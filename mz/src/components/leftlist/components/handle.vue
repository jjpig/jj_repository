<template>
  <div>
    <div class="title-box clearfix">
      <div class="list-icon">
        <div>
          <img width="35" height="35" :src="info.icon" alt="">
        </div>
      </div>
      <div class="title-name">{{ info.title }}</div>
      <div>
        <div class="up-icon-box">
          <img :src="currentIcon" @click="toggleItemDetail" alt="">
        </div>
      </div>
    </div>
    <div class="content-box" v-show="isDetailShow" >
      <div class="content">
        <h2 class="active">计生</h2>
        <ul  ><!--@click="showGuide"-->
          <li v-for="(item,$index) in items" @click="selectStyle(item, $index)" :class="{'active':item.isActive}">
            {{item.select}}
          </li>
          <!-- <li >生育服务登记</li>
          <li :class="{active : isActive}">3年期流动人口婚育证明（现只办本街道户籍流出人口）</li>
          <li>（电子证明3月期限）流动人口电子婚育证明</li>
          <li>《独生子女父母光荣证》遗失补办申报《病残儿医学鉴定》</li>
          <li>避孕药具免费发放服务</li>
          <li>（本地户籍）免费孕前优生健康检查服务卡的发放办理</li>
          <li>（流动人口）免费孕前优生健康检查服务卡的发放办理</li>
          <li>出具计划生育免费技术服务介绍信</li> -->
        </ul>
      </div>
    </div>
  </div>
</template>

<script>
  import Vue from 'vue'
  export default {
    props: [
      'info',
      'contentHeight',
      'index'
    ],
    data () {
      return {
        //  上下箭头
        upIcon: require('./u108.png'),
        downIcon: require('./u117.png'),
        isActive: false,
        items: [
          {select:'生育服务登记'},
          {select:'3年期流动人口婚育证明（现只办本街道户籍流出人口）'},
          {select:'（电子证明3月期限）流动人口电子婚育证明'},
          {select:'《独生子女父母光荣证》遗失补办申报《病残儿医学鉴定》'},
          {select:'避孕药具免费发放服务'},
          {select:'（本地户籍）免费孕前优生健康检查服务卡的发放办理'},
          {select:'（流动人口）免费孕前优生健康检查服务卡的发放办理'},
          {select:'出具计划生育免费技术服务介绍信'}
        ]
      }
    },
    computed: {
      //  切换栏目中上下箭头显示
      currentIcon () {
          return this.$store.state.changeShowState[this.index] ? this.upIcon : this.downIcon
      },
      isDetailShow () {
          return this.$store.state.changeShowState[this.index]
      }
    },
    methods: {
      //  切换导航组件详细内容显示状态
      toggleItemDetail () {
        this.$store.commit('changeShowState', this.index)
      },
      //  显示办事向导
      // showGuide () {
      //     this.$store.commit({
      //       type: 'showPopup',
      //       name: 'serviceWizard',
      //       title: '办事向导'
      //     });
      //     // this.isActive = !this.isActive;
      // },
      selectStyle (item, index) {
        this.$nextTick(function(){
          this.items.forEach(function(item){
            Vue.set(item, 'isActive', false);
          });
          Vue.set(item, 'isActive', true);
        });
        this.$store.commit({
            type: 'showPopup',
            name: 'serviceWizard',
            title: '事务办理向导'
          });
      }
    }
  }
</script>

<style src="./handle.css" scoped></style>
