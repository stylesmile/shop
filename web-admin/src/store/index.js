import Vue from 'vue'
import Vuex from 'vuex'
import app from './app'
import user from './user'
import getters from './getters'

Vue.use(Vuex)

const index = new Vuex.Store(
  {
    app,
    user,
    getters
  }
)

export default index
