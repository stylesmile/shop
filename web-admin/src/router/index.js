import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import login from '@/components/login'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'

Vue.use(Router)
Vue.use(ElementUI)

export default new Router({
  routes: [
    {
      path: '/1',
      name: 'login',
      component: HelloWorld
    },
    {
      path: '/',
      name: 'login',
      component: () => import('@/components/login.vue')
    },
    {
      path: '/login2',
      name: 'login',
      component: login
    }

  ]
})
