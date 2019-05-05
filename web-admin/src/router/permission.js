import router from '../router'
import store from '../store'
// progress bar library 进度条库
import NProgress from 'nprogress'
// progress bar style
import 'nprogress/nprogress.css'
import {Message} from 'element-ui'
// getToken from cookie
import {getToken} from '@/utils/token'

// nprogress configure 进度条配置
NProgress.configure({ showSpinner: false })

// judge each router, handle permission，判断每个路由，处理权限
const whiteList = ['/login'] // 不重定向白名单
router.beforeEach((to, from, next) => {
  NProgress.start()
  if (getToken()) {
    // start progress
    // if token is not empty
    if (to.path === '/login') {
      next({ path: '/' })
      // if current page is homepage will not trigger afterEach hook, so manually handle it
      // 如果当卡页面是首页，不会自动触发，手动处理
      NProgress.done()
    } else {
      if (store.getters.roles.length === 0) {
        store.dispatch('GetInfo').then(res => { // 拉取用户信息
          next()
        }).catch((err) => {
          store.dispatch('FedLogOut').then(() => {
            Message.error(err || 'Verification failed, please login again')
            next({ path: '/' })
          })
        })
      } else {
        next()
      }
    }
  } else {
    if (whiteList.indexOf(to.path) !== -1) {
      next()
    } else {
      // redirect to login page 重定向到登陆页
      next(`/login?redirect=${to.path}`)
      NProgress.done()
    }
  }
})

// after finished ,end progress
router.afterEach(() => {
  NProgress.done() // 结束Progress
})
