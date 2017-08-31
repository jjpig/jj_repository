<template>
  <div class="header">
    <div class="logo">
      <div>
        <img width="80" height="80" src="./logo.png" alt="">
      </div>
    </div>
    <div class="title">
      <div class="title-first">成都社区公共服务综合信息平台<span class="title-second">受理服务系统</span></div>
      <span class="title-version">Ver2.0.4.0&nbsp;版本说明</span>
      <div class="off-box" >
        <div @click="logout">
          <img src="./off.png" alt="">
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
      name: 'header',
      data () {
          return {

          }
      },
      methods: {
        logout(){
          var _this = this;
          this.$http.post('/user/logout?token='+ _this.$store.state.token
          )
          .then(res => {
            if(res.data.success == true){
              _this.$store.commit('LOGOUT');
              _this.$router.push('/');
              //window.open(location, '_self').close();
            }else{
               console.log("false");
            }
          })
          .catch(error => {
            console.log(error);
          });
        }
      }
  }
</script>

<style scoped src="./header.css"></style>
