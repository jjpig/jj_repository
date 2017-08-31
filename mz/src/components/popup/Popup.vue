<template>
  <div class="popup">
    <div class="header clearfix"><span>{{ popTitle }}</span><span @click="closePop">×</span></div>
    <div class="guide-box">
      <mz-serviceWizard v-if="isShowServiceWizard"></mz-serviceWizard>
      <mz-serviceGuide v-if="isShowServiceGuide"></mz-serviceGuide>
      <mz-residentDetailInfo v-if="isShowResidentDetailInfo"></mz-residentDetailInfo>
      <mz-photo v-if="isShowPhoto"></mz-photo>
      <mz-autoTable v-if="isShowAutoTable"></mz-autoTable>
      <mz-simpleGuide v-if="isShowSimpleGuide"></mz-simpleGuide>
      <mz-record v-if="isShowRecord"></mz-record>
      <mz-printGuide v-if="isShowPrintGuide"></mz-printGuide>
      <mz-printContent v-if="isShowPrintContent"></mz-printContent>
      <mz-quickReply v-if="isShowQuickReply"></mz-quickReply>
    </div>
  </div>
</template>

<script>
  //  办事向导
  import mzServiceWizard from './components/serviceWizard/serviceWizard';
  //  办事指南
  import mzServiceGuide from './components/serviceGuide/serviceGuide'
  //  居民详细信息
  import mzResidentDetailInfo from './components/residentDetailInfo/residentDetailInfo'
  //  拍摄照片
  import mzPhoto from './components/photo/Photo'
  //  自动填表
  import mzAutoTable from './components/autoTable/AutoTable'
  // 事务导航
  import mzSimpleGuide from './components/simpleGuide/simpleGuide'
  // 档案
  import mzRecord from './components/record/record'
  // 打印导航
  import mzPrintGuide from './components/printGuide/printGuide'
  // 打印存根等
  import mzPrintContent from './components/printGuide/printContent'
  // 快捷回复
  import mzQuickReply from './components/quickReply/quickReply'

  export default {
      data () {
          return {

          }
      },
      //  计算属性
      computed: {
        //  弹出框标题
        popTitle () {
            return this.$store.state.popTitle
        },
        isShowServiceWizard () {
            return this.$store.state.isShowServiceWizard
        },
        isShowServiceGuide () {
            return this.$store.state.isShowServiceGuide
        },
        isShowResidentDetailInfo () {
            return this.$store.state.isShowResidentDetailInfo
        },
        isShowPhoto () {
            return this.$store.state.isShowPhoto
        },
        isShowAutoTable () {
            return this.$store.state.isShowAutoTable
        },
        isShowSimpleGuide(){
            return this.$store.state.isShowSimpleGuide
        },
        isShowRecord(){
          return this.$store.state.isShowRecord
        },
        isShowPrintGuide(){
          return this.$store.state.isShowPrintGuide
        },
        isShowPrintContent(){
          return this.$store.state.isShowPrintContent
        },
        isShowQuickReply(){
          return this.$store.state.isShowQuickReply
        }
      },
      methods: {
        closePop () {
            this.$store.commit('hidePopud');
        }
      },
      //  组件
      components: {
          mzServiceWizard,
          mzServiceGuide,
          mzResidentDetailInfo,
          mzPhoto,
          mzAutoTable,
          mzSimpleGuide,
          mzRecord,
          mzPrintGuide,
          mzPrintContent,
          mzQuickReply
      }
  }
</script>

<style scoped src="./popup.css"></style>
