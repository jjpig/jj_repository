// /**
//  * http配置
//  */

import axios from 'axios'
import store from './store'
import router from './router'

// axios 配置
axios.defaults.timeout = 5000;
axios.defaults.baseURL = 'http://47.93.189.152/mzapi';

// axios.create({
// 	headers: {
// 	 method: 'get',
//      url: 'http://47.93.189.152/mzapi',
//      headers: {
//      	'X-XSRF-TOKEN': store.state.token,
//      },
//      responseType: 'json',
//      timeout: 50000
// 	}
// });
// http request 拦截器
// axios.interceptors.request.use(
//     config => {
//         if (store.state.token) {
//             //config.headers.Authorization = `${store.state.user.token}`;
//             config.headers['X-XSRF-TOKEN'] = store.state.token;
//         }
//         return config;
//     },
//     err => {
//         return Promise.reject(err);
//     });

// http response 拦截器
// axios.interceptors.response.use(
//     response => {
//         return response;
//     },
//     error => {
//         if (error.response) {
//             switch (error.response.status) {
//                 case 401:
//                     // 401 清除token信息并跳转到登录页面
//                     // store.commit('');
//                     router.replace({
//                         path: '/',
//                         //query: {redirect: router.currentRoute.fullPath}
//                     })
//             }
//         }
//         // console.log(JSON.stringify(error));//console : Error: Request failed with status code 402
//         return Promise.reject(error.response.data)
//     });

export default axios;