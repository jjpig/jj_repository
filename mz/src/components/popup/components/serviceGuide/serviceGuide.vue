<template>
  <div class="guide">
    <div class="guide-top">
      <p><span>个人参加社会保险登记制卡、取卡</span>社区事务受理服务中心办事报告 <span class="code">事务编码：RD12313</span></p>
    </div>
    <div class="guide-content">
      <div class="content-left">
        <table>
          <tr>
            <td><h3>项目名称</h3></td>
            <td><span>个人参加社会保险登记卡、取卡</span></td>
          </tr>
          <tr>
            <td><h3>受理条件</h3></td>
            <td><span>1、在成都市工作&nbsp;2、居民本人办理</span></td>
          </tr>
          <tr>
            <td><h3>申请材料</h3></td>
            <td>
              <button class="first">身份证复印件</button>
              <button>事务办理申请表</button>
              <button>委托公证书(2份)</button>
            </td>
          </tr>
          <tr>
            <td><h3>受理流程</h3></td>
            <td><span>个人参加社会保险登记卡、取</span></td>
          </tr>
          <tr>
            <td><h3>收费标准</h3></td>
            <td><span>个人参加社会保险登记卡、取卡</span></td>
          </tr>
        </table>
      </div>
      <div class="content-right">
        <button>打印</button><br/>
        <button @click="hidePop" class="close">关闭</button>
      </div>
    </div>
    <!-- <div>
      <div class="title">
        <h2>个人参加社会保险登记制卡、取卡</h2>
        <p>社区事务受理服务中心办事报告 <span>事务编码：RD12313</span></p>
      </div>
      <div>
        <h3>一、项目名称</h3>
        <p>个人参加社会保险登记卡、取卡</p>
      </div>
      <div>
        <h3>二、受理条件</h3>
        <p>1、在成都市工作</p>
        <p>2、居民本人办理</p>
      </div>
      <div>
        <h3>三、申请材料</h3>
        <p>1、在成都市工作</p>
        <p>2、居民本人办理</p>
      </div>
      <div>
        <h3>四、受理流程</h3>
        <p>在成都市工作</p>
      </div>
      <div>
        <h3>五、收费标准</h3>
        <p>在成都市工作</p>
      </div>
      <div>
        <h3>六、咨询查询</h3>
        <p>在成都市工作</p>
      </div>

      <div>
        <button>打印</button>
        <button @click="hidePop">关闭</button>
      </div>
    </div> -->
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
        }
    }
  }
</script>

<style scoped src="./service.css"></style>
