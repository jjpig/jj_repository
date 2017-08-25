/**
 * Created by bing(tech_hubing@163.com) on 2017/8/14.
 */
import Vue from 'vue'

/**
 * 根级别的mutation
 */
let mutations = {
  /**
   * 设置左侧菜单栏显示隐藏样式
   * 被选中的状态取反，其他设置false（关闭）
   * @param state 当前store的state
   * @param index 被选中的菜单序号
   */
  changeShowState ( state, index ) {
    for ( let i = 0; i < state.changeShowState.length; i++ ) {
      if( index == i ) {
        Vue.set(state.changeShowState, index, !state.changeShowState[index]);
      } else {
        Vue.set(state.changeShowState, i, false);
      }
    }
  },

  /**
   * 显示办事向导弹出框
   * @param state
   * @param payload
   */
  showPopup ( state, payload ) {
    state.isShowPop = true;
    state.popTitle = payload.title;
    switch (payload.name) {
      //  设置弹出框内容为（办事向导）
      case 'serviceWizard':
          state.isShowServiceWizard = true;
          break;
      //  设置弹出框内容为（办事指南）
      case 'serviceGuide':
          state.isShowServiceGuide = true;
          break;
      // 设置弹出框内容为（居民详细信息）
      case 'residentDetailInfo':
          state.isShowResidentDetailInfo = true;
          break;
      //  拍摄照片
      case 'photo':
          state.isShowPhoto = true;
          break;
      //  自动填表
      case 'autoTable':
          state.isShowAutoTable = true;
          break;
      // 事务导航
      case 'showSimpleGuide':
           state.isShowSimpleGuide = true;
    }
  },

  hidePopud ( state ) {
    state.isShowPop = false;
    state.isShowServiceWizard = false;
    state.isShowServiceGuide = false;
    state.isShowResidentDetailInfo = false;
    state.isShowPhoto = false;
    state.isShowAutoTable = false;
    state.isShowSimpleGuide = false;
  },

  /**
   * 显示登录错误提示框
   * @param state
   * @param payload
   */
  showError( state, payload ){
    state.isShowLoginError = true;
    state.popTitle = payload.title;
    switch (payload.name) {
      //  请输入账号密码
      case 'nameOrPwdNull':
          state.isShowServiceGuide = true;
          break;
      // 用户名或密码错误
      case 'nameOrPwdError':
          state.isShowResidentDetailInfo = true;
          break;
    }
  },

  closeError( state ){
    state.isShowLoginError = false;
  }
}
export default mutations;

