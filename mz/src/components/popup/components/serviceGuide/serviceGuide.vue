<template>
  <div class="guide">
    <div class="guide-top">
      <p><span>个人参加社会保险登记制卡、取卡</span>社区事务受理服务中心办事报告 <span class="code">事务编码：RD12313</span></p>
    </div>
    <div class="guide-content">
      <div class="content-left">
        <table id="print">
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
            <td>
              <el-steps :space="150" :active="1" center="center">
                <el-step title="提交事务办理材料" description="0.5个工作日"></el-step>
                <el-step title="材料审核" description="1个工作日"></el-step>
                <el-step title="事务办理" description="1个工作日"></el-step>
                <el-step title="办理完成" description=""></el-step>
              </el-steps>
            </td>
          </tr>
          <tr>
            <td><h3>收费标准</h3></td>
            <td><span>个人参加社会保险登记卡、取卡</span></td>
          </tr>
        </table>
      </div>
      <div class="content-right" id="not-print">
        <button @click="printf"><img src="./u874.png" width="14px">打印</button><br/>
        <button @click="hidePop" class="close"><img src="../serviceWizard/u758.png" width="14px">关闭</button>
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
        printf(){
          // let newWin = window.open("_blank");
          let part = document.getElementById('print').innerHTML;
          let not = document.getElementById('not-print');
          not.style.display="none";
          // newWin.document.write(part);
          // newWin.document.close();
          // newWin.print();
          window.print();
          return true;
        },

        hidePop () {
            this.$store.commit('hidePopud');
        },

      //   PrintElem(elem) {
      //     var newWin = window.open('', 'PRINT', 'height=400,width=600');

      //     newWin.document.write('<html><head><title>' + document.title  + '</title>');
      //     newWin.document.write('</head><body >');
      //     newWin.document.write('<h1>' + document.title  + '</h1>');
      //     newWin.document.write(document.getElementById(elem).innerHTML);
      //     newWin.document.write('</body></html>');

      //     newWin.document.close(); // necessary for IE >= 10
      //     newWin.focus(); // necessary for IE >= 10*/

      //     newWin.print();
      //     newWin.close();

      //     return true;
      // }
    }
  }
</script>

<style scoped src="./service.css"></style>
