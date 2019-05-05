import vue from 'vue'
import vuex from 'vuex'
import app from './modules/app'
import user from './modules/user'
import getters from './getters'

vue.use(vuex)

const store = new vuex.Store({
  app,
  user,
  getters
})

export default store
