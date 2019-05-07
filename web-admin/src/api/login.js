import request from '@/utils/request'

export function login (username, password) {
  return request({
    url: '/user/login',
    method: 'post',
    data: {
      username,
      password
    }
  })
}

// 通过token获取用户信息
export function getInfo (token) {
  return ({
    url: '/user/info',
    method: 'get',
    params: {token}
  })
}

// 退出登录
export function logout () {
  return request({
    url: '/user/logout',
    method: 'post'
  })
}
