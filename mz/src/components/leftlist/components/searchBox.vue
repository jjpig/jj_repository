<template>
  <div class="search">
    <div class="list-icon">
      <div class="search-icon-box">
        <img @click="showQuickList = true" src="./u94.png" alt="">
        <div v-show="showQuickList" @click="showQuickList = false" class="show-box">
          <ul>
            <li v-for="(item, index) in quickList">{{ item.name }}</li>
          </ul>
        </div>
      </div>
    </div>
    <div class="input-box">
      <input v-model="searchContent" @keyup="searchItem" title="" type="text" />
    </div>
    <div class="close-box">
      <div>
        <img @click="clearSearchContent" src="./u96.png" alt="">
      </div>
    </div>
  </div>
</template>

<script>
  export default {
      data () {
          return {
            //  是否显示快速进入列表
            showQuickList: false,
            //  初始化输入框内容
            searchContent: '',
            //  快捷操作列表
            quickList: []
          }
      },
      //  钩子函数
      beforeCreate () {
        /**
         * 测试接口
         * http同服务器交互
         * 获取一个列表
         */
        //  当前实例
        var _this = this;
        this.$http.get('http://118.190.107.11:8080/dpt/queryDepartmentList')
            .then(res => {
              _this.quickList = res.data.data;
            })
            .catch(error => {
                console.log(error);
            })
      },
      methods: {
            //  搜索框输入时触发
            searchItem () {
                console.log( this.searchContent );
            },
            //  清除搜索框内已输入的内容
            clearSearchContent () {
                this.searchContent = '';
            }
      }
  }
</script>

<style scoped>
  .search-icon-box {
    position: relative;
  }
  .search-icon-box div.show-box {
    position: absolute;
    left: 15px;
    top: 13px;
    background: rgba(0, 0, 0, 0.7);
    width: 500px;
    height: 500px;
    -webkit-border-radius: 10px;
    -moz-border-radius: 10px;
    border-radius: 10px;
    color: #ffffff;
    z-index: 100;
  }
  .search {
    position: absolute;
    top: 0px;
    width: 300px;
    background: #3C4B64;
    height: 60px;
  }
  .list-icon {
    width: 60px;
    height: 60px;
    float: left;
    cursor: pointer;
  }
  .list-icon div {
    width: 60px;
    height: 60px;
    text-align: center;
    display: table-cell;
    vertical-align: middle;
  }
  .input-box {
    float: left;
    height: 60px;
    line-height: 60px;
  }
  .input-box input {
    height: 30px;
    width: 180px;
    -webkit-border-radius: 10px;
    -moz-border-radius: 10px;
    border-radius: 10px;
    outline:none;
    border:none;
  }
  .close-box {
    float: left;
  }
  .close-box div {
    width: 60px;
    height: 60px;
    display: table-cell;
    vertical-align: middle;
    text-align: center;
  }
  .close-box img {
    cursor: pointer;
  }
</style>
