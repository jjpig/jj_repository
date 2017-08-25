<template>
  <div class="bg clearfix">
    <div id="u2" class="ax_default">
      <div class="info-box">
        <div class="title">
          <img width="100" height="100" src="./u4.png" alt="logo">
          <span class="main">社区公共服务综合信息平台</span>
          <p>受理服务系统</p>
          <span class="version">Ver2.0.4.0</span>
        </div>
        <div class="input-box">
          <input type="text" class="name" placeholder="用户名" v-model.trim="loginName">
            <br/>
          <input type="password" class="pwd" placeholder="密码" v-model.trim="loginPwd">
        </div>
        <button @click="login">登陆</button>
      </div>
    </div>
    <div v-if="isShowLoginError" class="mzError">
      <mz-error></mz-error>
    </div>
  </div>
</template>

<script>
  import mzError from './components/error'

  export default {
    name: 'login',
    data () {
      return {
        loginName: '',
        loginPwd: '',
      }
    },
    computed: {
        isShowLoginError(){
          return this.$store.state.isShowLoginError
        }
    },
    methods: {
        login () {
            //  登陆接口，登陆成功后，跳转到home主页
            console.log(this.loginName);

            if(this.loginName == '' || this.loginPwd == ''){
              // alert("请输入用户名和密码");
              this.$store.commit({
                type: 'showError',
                name: 'nameOrPwdNull',
                title: '请输入用户名和密码'
              });
              return false;
            }
            this.$router.push('home');
        }
    },
    components:{
      mzError
    }
  }
</script>

<style scoped src="./login.css"></style>
