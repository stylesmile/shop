import cookie from 'js-cookie'

const tokenKey = 'admin_token'

export function getToken () {
  return cookie.get(tokenKey)
}

export function setToken (token) {
  return cookie.set(tokenKey)
}

export function removeToken () {
  return cookie.remove(tokenKey)
}
