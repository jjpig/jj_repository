<template>
  <div class="upload-box">
    <div class="upload-icon">
      <div>
        <img src="./u141.png" alt="">
      </div>
    </div>
    <div class="upload-info">
      <span>当前上传文件 <span>0</span></span>
    </div>
  </div>
</template>

<script>
  export default {
    data () {
      return {

      }
    }
  }
</script>

<style>
  .upload-box {
    background: #354053;
    position: relative;
  }
  .upload-icon {
    width: 60px;
    height: 60px;
    background: #354053;
  }
  .upload-icon div {
    width: 60px;
    height: 60px;
    text-align: center;
    display: table-cell;
    vertical-align: middle;
  }
  .upload-info {
    height: 60px;
    line-height: 60px;
    position: absolute;
    top: 0;
    right: 0;
    color: #4D73EB;
    font-size: 20px;
    padding-right:20px;
  }
</style>
