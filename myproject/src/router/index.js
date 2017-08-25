import Vue from 'vue'
import Router from 'vue-router'
import Hello from '@/components/Hello'
import Base from '@/components/business/Base'
Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Hello',
      component: Hello,

      children: [
	      {
	      	path: 'base',
	      	name: 'base',
	      	component: Base
	      },
	      {
	      	path: '',
	      	redirect: 'base'
	      }
      ]
    }
  ]
})
