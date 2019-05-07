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

const createRouter = () => new Router({
  // mode: 'history', // require service support
  scrollBehavior: () => ({ y: 0 }),
  routes: routesMap
})

const router = createRouter()

// Detail see: https://github.com/vuejs/vue-router/issues/1234#issuecomment-357941465
export function resetRouter () {
  const newRouter = createRouter()
  router.matcher = newRouter.matcher // reset router
}

export default new Router({
  routes: routesMap
})
