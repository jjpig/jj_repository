<template>
    <div class="title-box clearfix">
      
    <div class="sencond-box">
      <div class="content">
        <ul >
          <li v-for="(item,$index) in items" @click="selectStyle(item, $index)" :class="{'active':item.isActive}">
            {{item.title}}
          </li>
        </ul>
      </div>
    </div>
  </div>
</template>

<script>
  import Vue from 'vue'
  export default {
    props: [
      // 'info',
      // 'index',
      // 'items',
      // 'isActive'
      'list'
    ],
    data () {
      return {

        // isActive: false,
        items: [
          {title:'生育服务登记'},
          {title:'3年期流动人口婚育证明（现只办本街道户籍流出人口）'},
          {title:'（电子证明3月期限）流动人口电子婚育证明'},
          {title:'《独生子女父母光荣证》遗失补办申报《病残儿医学鉴定》'},
          {title:'避孕药具免费发放服务'},
          {title:'（本地户籍）免费孕前优生健康检查服务卡的发放办理'},
          {title:'（流动人口）免费孕前优生健康检查服务卡的发放办理'},
          {title:'出具计划生育免费技术服务介绍信'}
        ]
      }
    },
    computed: {

      // isDetailShow () {
      //     return this.$store.state.changeShowState[this.index]
      // }
    },
    methods: {
      //  切换导航组件详细内容显示状态
      // toggleItemDetail () {
      //   this.$store.commit('changeShowState', this.index)
      // },

      selectStyle (item, index) {
        this.$nextTick(function(){
          this.items.forEach(function(item){
            Vue.set(item, 'isActive', false);
          });
          Vue.set(item, 'isActive', true);
          this.$store.commit('SET_AFFAIRTYPEID', item.id);
          //事务类型列表
          // this.$http.post('/menu/queryAffairTypeList?token='+ _this.$store.state.token+'lineId='+index)
          // .then(res => {
          //   console.log(res.data.data.length);
          //   for (let i = 0; i < res.data.data.length; i++) {
          //     _this.items[i].title = res.data.data[i].name;
          //   }
          // })
          // .catch(error => {
          //   console.log(error);
          // });
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
