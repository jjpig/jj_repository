<template>
  <div class="service">
    <div class="box-left-button">
      <button @click="" class="active">办事条件</button>
      <button @click="">所需材料</button>
    </div>
    <div class="box-right">
      <div class="right-content">
          <div >
            1、在成都市工作、生活居民
            2、居民本人办理
          </div >
          <div>
            1、居民身份证原件
            2、社会保险事业管理局个人制卡取卡登记表
          </div>
      </div>
      <div class="right-button">
          <button @click="" class="guide-btn">智&nbsp;能&nbsp;向&nbsp;导</button>
          <button @click="showBaseInfo" class="y-btn">√&nbsp;&nbsp;符&nbsp;&nbsp;合</button>
          <button @click="hidePop" class="n-btn">×&nbsp;不&nbsp;符&nbsp;合</button>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
      data () {
          return {

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
          //  隐藏弹出框
          this.$store.commit('hidePopud');
          //  路由跳转至基本信息页
          this.$router.push('baseinfo');
        }
      }
  }
</script>

<style scoped src="./service.css"></style>
√