<template>
  <div class="mz-tool-bar">
    <ul class="clearfix">
      <li><div><img width="35" height="35" src="./u148.png" alt="" @click="backToMain"></div></li>
      <li><div><img width="35" height="35" src="./u150.png" alt="" @click="backToLast"></div></li>
      <li><div><img width="35" height="35" src="./u158.png" alt="" @click="goToNext"></div></li>
      <li><div><img width="35" height="35" src="./u152.png" alt="" @click="refresh"></div></li>
      <li><div><img width="35" height="35" src="./u154.png" alt=""></div></li>
      <li><div><img width="35" height="35" src="./u156.png" alt="" @click="guide"></div></li>
    </ul>
  </div>
</template>

<script>
  export default {
      data () {
          return {

          }
      },

      methods:{
        
        backToMain(){
          this.$router.push('currentBus');
        },
        backToLast(){
          this.$router.back(-1);
        },
        goToNext(){
          this.$router.go(1);
        },
        refresh(){
          this.$router.go(0);
        },
        guide(){
          this.$store.commit({
            type: 'showPopup',
            name: 'showSimpleGuide',
            title: '事务导航'
          });
        }
      }
  }
</script>

<style src="./toolbar.css" scoped></style>
