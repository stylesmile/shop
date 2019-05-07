import {getInfo, login, logout} from '@/api/login'
import {resetRouter} from '@/router'
import {getToken, removeToken, setToken} from '@/utils/token'

const user = {
  state: {
    token: getToken(),
    name: '',
    avatar: '',
    roles: []
  },
  mutations: {
    SET_TOKEN: (state, token) => {
      state.token = token
    },
    SET_AVATAR: (state, avatar) => {
      state.avator = avatar
    },
    SET_NAME: (status, name) => {
      status.name = name
    },
    SET_ROLES: (state, roles) => {
      state.roles = roles
    }
  },
  actions: {
    Login ({commit}, userInfo) {
      debugger
      // 去掉首尾空格
      const username = userInfo.username.trim()
      return new Promise((resolve, reject) => {
        login(username, userInfo.password).then(response => {
          const data = response.data
          // 保存token到cookie
          setToken(data.token)
          commit('SET_TOKEN', data.token)
          resolve()
        }).catch(error => {
          reject(error)
        })
      })
    },
    GetInfo ({commit, state}) {
      return new Promise((resolve, reject) => {
        getInfo(state.token).then(response => {
          const {data} = response

          if (!data) {
            // reject('Verification failed, please Login again.')
          }
          const {name, avatar} = data
          commit('SET_NAME', name)
          commit('SET_AVATAR', avatar)
          resolve(data)
        }).catch(error => {
          reject(error)
        })
      })
    },
    // user logout
    logout ({commit, state}) {
      return new Promise((resolve, reject) => {
        logout(state.token).then(() => {
          commit('SET_TOKEN', '')
          removeToken()
          resetRouter()
          resolve()
        }).catch(error => {
          reject(error)
        })
      })
    },

    // remove token
    resetToken ({commit}) {
      return new Promise(resolve => {
        commit('SET_TOKEN', '')
        removeToken()
        resolve()
      })
    }
  }
}
export default user
