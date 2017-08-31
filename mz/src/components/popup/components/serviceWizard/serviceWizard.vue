<template>
  <div class="service">
    <div class="box-left-button">
      <ul>
        <li :class="{'active': isActive}"><img src="./u742.png" width="16px">办事条件</li>
        <li :class="{'active': !isActive}"><img src="./u744.png" width="16px">所需材料</li>
      </ul>
    </div>
    <div class="box-right">
      <div class="right-content">
          <div v-if="isShow">
            1、在成都市工作、生活居民
            2、居民本人办理
          </div>
          <div v-else>
            1、居民身份证原件
            2、社会保险事业管理局个人制卡取卡登记表
          </div>
      </div>
      <div class="right-button">
          <button @click="" class="guide-btn">智&nbsp;能&nbsp;向&nbsp;导</button>
          <button @click="showBaseInfo" class="y-btn"><img src="./u753.png" width="12px">符&nbsp;&nbsp;合</button>
          <button @click="hidePop" class="n-btn"><img src="./u758.png" width="12px">不&nbsp;符&nbsp;合</button>
      </div>
    </div>
  </div>
</template>

<script>
import Vue from 'vue'
  export default {
      data () {
          return {
            isActive: true,
            isShow: true,
            items: [
              {select:'办事条件', isActive: true},
              {select:'所需材料', isActive: false}
            ]
          }
      },
      methods: {
        hidePop () {
          this.$store.commit('hidePopud');
          this.$store.commit({
            type: 'showPopup',
            name: 'showSimpleGuide',
            title: '事务导航'
          });
        },

        //  条件符合，显示基本信息填写
        showBaseInfo () {
          if(this.isShow == false){
            //  隐藏弹出框
            this.$store.commit('hidePopud');
            //  路由跳转至基本信息页
            this.$router.push('baseinfo');
          }else{
            this.isActive = false;
            this.isShow = false;
          }
        },
      }
  }
</script>

<style scoped src="./service.css"></style>
√