<template>
  <div class="mz-tool-bar">
    <ul class="clearfix">
      <li><div><img width="35" height="35" src="./u148.png" alt="" @click="backToMain"></div></li>
      <li><div><img width="35" height="35" src="./u150.png" alt=""></div></li>
      <li><div><img width="35" height="35" src="./u158.png" alt=""></div></li>
      <li><div><img width="35" height="35" src="./u152.png" alt=""></div></li>
      <li><div><img width="35" height="35" src="./u154.png" alt=""></div></li>
      <li><div><img width="35" height="35" src="./u156.png" alt=""></div></li>
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
        }
      }
  }
</script>

<style src="./toolbar.css" scoped></style>
