import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'

Vue.use(Router)
Vue.use(ElementUI)

const routesMap =
[
  {
    path: '/',
    name: 'home',
    component: () => import('@/components/home/home.vue')
  },
  {
    path: '/login',
    name: 'login',
    component: () => import('@/components/login.vue')
  },
  {
    path: '/HelloWorld',
    name: 'HelloWorld',
    component: HelloWorld
  }
]

export default new Router({
  routes: routesMap
})
