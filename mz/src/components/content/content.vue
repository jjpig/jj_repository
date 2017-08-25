<template>
  <div class="content">
    <router-view></router-view>
  </div>
</template>

<script>
  export default {
    name: 'content',
    data () {
      return {

      }
    }
  }
</script>

<style scoped>
  .content {
    position: relative;
 /*   float: right;*/
    width: 100%;
    overflow-y: auto;
  }
</style>

