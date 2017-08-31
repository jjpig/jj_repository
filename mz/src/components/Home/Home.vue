<template>
  <div class="wrap">
    <mz-header ref="header"></mz-header>
    <div class="mz-body">
      <mz-leftList :style="{ height: h + 'px' }" class="mz-left-list"></mz-leftList>
      <div :style="{ width: w + 'px', height: h + 'px'}" class="mz-right-content">
        <mz-content :style="{ height: contentHeight + 'px'}"></mz-content>
        <mz-toolbar class="mz-toolbar"></mz-toolbar>
      </div>
    </div>
    <div v-if="isShowPop" class="mz-popup">
      <mz-popup></mz-popup>
    </div>
  </div>
</template>

<script>
  //  头部组件
  import header from '../header/header';
  //  左侧菜单
  import leftList from '../leftlist/leftList';
  //  内容组件
  import content from '../content/content';
  //  工具栏组件
  import toolbar from '../toolbar/toolbar';
  //  弹出框组件
  import popup from '../popup/Popup';

  export default {
    name: 'home',
    data () {
        return {
          h: 0,
          w: 0,
          contentHeight: 0,
        }
    },

    computed: {
        isShowPop () {
            return this.$store.state.isShowPop
        },
    },
    
    beforeMount () {
        this.h = document.body.clientHeight - 100;
        this.w = document.body.clientWidth - 300;
        this.contentHeight = document.body.clientHeight - 100 - 70;
    },

    components:{
      mzHeader: header,
      mzLeftList: leftList,
      mzContent: content,
      mzToolbar: toolbar,
      mzPopup: popup
    }
  }
</script>

<style src="./main.css"></style>
