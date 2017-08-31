// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import axios from './http'

import App from './App'
import router from './router'
import echarts from 'echarts'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-default/index.css'

//  仓库
import store from './store'
//  http
Vue.prototype.$http = axios
Vue.prototype.$echarts = echarts
Vue.config.productionTip = false
Vue.use(ElementUI)

  // const router = new Router({
  //       routes
  //   });
  router.beforeEach((to, from, next) => {
      if (to.matched.some(r => r.meta.requireAuth)) {
          if (store.state.token) {
              next();
          }
          else {
              next({
                  path: '/',
                  //query: {redirect: to.fullPath}
              })
          }
      }
      else {
          next();
      }
  });
new Vue({
  el: '#app',
  store,
  router,
  template: '<App/>',
  components: { App }
})
