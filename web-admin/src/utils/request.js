import axios from 'axios'
import store from '../store'
import { getToken } from './token'
import { MessageBox, Message } from '"element-ui'
// import { getToken } from '@/untils/token'

// 创建axios实例
const service = axios.create({
  //   dev.env.js 的 BASE_API
  baseURL: process.env.BASE_API,
  // 请求超时 时间
  timeout: 5000 // 请求超时 时间
})

// request 拦截器
service.interceptors.request.use(
  config => {
    if (store.getter.token) {
      // 让每个请求携带token
      config.headers['X-Token'] = getToken()
    }
    return config
  },
  error => {
    // do something with request error
    console.log(error)
    Promise.reject(error)
  }
)

// response 拦截器
service.interceptors.response.use(
  response => {
    // code 为非200抛出错误
    const res = response.data
    if (res.code !== 200) {
      Message({
        message: res.message,
        type: 'error',
        duration: 5 * 1000
      })
      // 50008 非法的token;50012其他客户端登陆了；50014:Token过期了；
      if (res.code === 50008 || res.code === 50012 || res.code === 50012) {
        MessageBox.confirm(
          '你已经退出登陆，可以取消留在该页面，或者重新登陆',
          '确定退出登陆',
          {
            confirmButtonText: '重新登陆',
            cancelButtonText: '取消',
            type: 'warning'
          }
        ).then(() => {
          store.dispatch('FedLogOut').then(() => {
            // 重新实例化vue-router对象 避免bug
            location.reload()
          })
        })
      }
      // eslint-disable-next-line prefer-promise-reject-errors
      return Promise.reject('error')
    } else {
      return response.data
    }
  },
  error => {
    console.log('err' + error) // for debug
    Message({
      message: error.message,
      type: 'error',
      duration: 5 * 1000
    })
    return Promise.reject(error)
  }
)

export default service
