/**
 * Created by bing(tech_hubing@163.com) on 2017/8/14.
 */
import Vuex from 'vuex'
import Vue from 'vue'
import mutatioins from './mutations';

Vue.use(Vuex)

/**
 * 组装模块并导出store
 * @type {Store}
 */
const store = new Vuex.Store({
  state: {
    //  左侧菜单栏的显示状态，true为展开，false为关闭，分别对应四个菜单组件
    changeShowState: [true, false, false, false],
    //  是否显示弹出框
    isShowPop: false,
    //  弹出框标题信息
    popTitle: '',
    //  显示办事向导
    isShowServiceWizard: false,
    //  显示办事指南
    isShowServiceGuide: false,
    //  显示居民详细信息
    isShowResidentDetailInfo: false,
    //  显示拍照信息
    isShowPhoto: false,
    //  显示自动填表
    isShowAutoTable: false,

    // 显示事务导航
    isShowSimpleGuide: false,
    // 显示登陆错误提示框
    isShowLoginError: false
  },
  mutations: mutatioins
});

export default store;
