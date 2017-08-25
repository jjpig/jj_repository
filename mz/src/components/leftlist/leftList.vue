<template>
  <div ref="leftList" class="left-list">
    <div class="login-box">
      <div class="avatar-box">
        <div class="avatar">
          <img src="./avatar.png" alt="">
        </div>
        <div class="info-box">
          <p>当前用户：簇桥前台 [ 簇桥街道 ]</p>
          <p>
            <span>等级 : ✭ ✭</span>
            <span>注销</span>
            <span>退出</span>
          </p>
        </div>
      </div>
    </div>
    <div ref="searchBox" class="search-box">
      <mz-searchBox></mz-searchBox>
    </div>
    <div :style="{ height : handleBoxHeight + 'px',overflow: 'hidden', background: '#354053', position:'absolute', top: '160px'} ">
      <mz-handleBox
        v-for="(i, index) in navInfo"
        v-bind:key="index"
        :info="i"
        :index="index"
        @hideAllDetail="hideAllDetail"
        :contentHeight="contentHeight"></mz-handleBox>
    </div>
    <div ref="uploadBox" class="">
      <mz-uploadBox></mz-uploadBox>
    </div>
  </div>
</template>

<script>
  //  搜索框组件
  import searchbox from './components/searchBox';
  //  上传组件
  import upload from './components/upload';
  //  事务导航组件
  import handle from './components/handle';

  export default {
    data () {
        return {
          //  导航部分高度
          handleBoxHeight: 0,
          //  导航各项内容高度
          contentHeight: 0,
          //  初始化各个导航组件基本信息
          navInfo: [
            {
              icon: require('./components/u106.png'),
              title: '事务导航'
            },
            {
              icon: require('./components/u115.png'),
              title: '个人统计'
            },
            {
              icon: require('./components/u122.png'),
              title: '我的信息'
            },
            {
              icon: require('./components/u131.png'),
              title: '台账导航'
            }
          ],
          isShowDetail: false
        }
    },
    methods: {
      hideAllDetail () {

      }
    },
    mounted () {
      //  动态计算handle box区域高度
      let height = this.$refs.leftList.getBoundingClientRect().height;
      let searchBoxHeight = this.$refs.searchBox.getBoundingClientRect().height;
      let uploadBoxHeight = this.$refs.uploadBox.getBoundingClientRect().height;
      let handleBoxHeight = height - searchBoxHeight - uploadBoxHeight - 100;
      this.handleBoxHeight = handleBoxHeight;
      //  动态计算各项内容可显示的高度
      let contentHeight = handleBoxHeight - 240;
      this.contentHeight = contentHeight;

    },
    components: {
        mzSearchBox: searchbox,
        mzUploadBox: upload,
        mzHandleBox: handle
    }
  }
</script>

<style src="./leftList.css"></style>
