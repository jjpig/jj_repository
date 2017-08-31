<template>
  <div ref="leftList" class="left-list">
    <div class="login-box">
      <div class="avatar-box">
        <div class="avatar">
          <img src="./avatar.png" alt="">
        </div>
        <div class="info-box">
          <!-- <p>当前用户：簇桥前台 [ 簇桥街道 ]</p> -->
          <p v-model="name">当前用户：{{name}}</p>
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
        :items="items"
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
          //  初始化各个导航组件基本信息 事务导航 个人统计 我的信息 台账导航
          navInfo: [
            {
              icon: require('./components/u106.png'),
              title: ''
            },
            {
              icon: require('./components/u115.png'),
              title: ''
            },
            {
              icon: require('./components/u122.png'),
              title: ''
            },
            {
              icon: require('./components/u131.png'),
              title: ''
            }
          ],
          isShowDetail: false,
          name: '',
          items:[
            {},{},{},{},{},{},
          ]
        }
    },

    methods: {
      hideAllDetail () {

      },
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
      this.name = localStorage.name;
      //console.log(this.$store.state.user.name);

      var _this = this;

      //菜单列表
        this.$http.post('/menu/queryMenuList?parentId='+localStorage.id+'&token='+ _this.$store.state.token
        )
        .then(res => {
          for (let i = 0; i <= res.data.data.length; i++) {
            _this.navInfo[i].title = res.data.data[i].name;
          }
          console.log(res);
        })
        .catch(error => {
          console.log(error);
        });

      //事务导航窗口
        this.$http.post('/menu/affairNavigation?token='+ _this.$store.state.token)
        .then(res => {
          console.log(res.data.data.length);
          for (let i = 0; i < res.data.data.length; i++) {
            _this.items[i].title = res.data.data[i].name;
          }
        })
        .catch(error => {
          console.log(error);
        });
    },

    components: {
        mzSearchBox: searchbox,
        mzUploadBox: upload,
        mzHandleBox: handle
    }
  }
</script>

<style src="./leftList.css"></style>
