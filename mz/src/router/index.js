import Vue from 'vue'
import Router from 'vue-router'

import Login from '@/components/login/Login'
import Home from '@/components/home/Home'

//  基本信息填写
import Baseinfo from '@/components/business/baseinfo/Baseinfo'

//  当前已处理事务
import CurrentBus from '@/components/business/currentBus/CurrentBus'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    //  一级路由
    //  登陆主页路由
    {
      path: '/',
      name: 'login',
      component: Login
    },
    //  home主页
    {
      path: '/home',
      component: Home,
      //  二级路由
      children: [
        {
          path: 'currentBus',
          name: 'currentBus',
          component: CurrentBus
        },
        {
          path: 'baseinfo',
          name: 'baseinfo',
          component: Baseinfo
        },
        {
          path: '',
          redirect: 'currentBus'
        }
      ]
    }
  ]
})
