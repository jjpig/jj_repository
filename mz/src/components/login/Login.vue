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
          <input type="password" class="pwd" placeholder="密码" v-model.trim="password">
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
  import axios from 'axios';
  import qs from 'qs';
  export default {
    name: 'login',
    data () {
      return {
        loginName: '',
        password: '',
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
            // console.log(this.loginName);
            var _this = this;
            var params = {
              loginName : _this.loginName,
              //password : _this.password
              password: '63a9f0ea7bb98050796b649e85481845'
            };
            // 
            if(_this.loginName == '' || _this.password == ''){
              // alert("请输入用户名和密码");
              _this.$store.commit({
                type: 'showError',
                name: 'nameOrPwdNull',
                title: '请输入用户名和密码'
              });
              return false;

            }else{
              this.$http.post('/user/login',qs.stringify(params))
              .then(res => {
                  //console.log(res);
                  if(res.data.success == true){
                    _this.$store.commit('SET_USER',res.data.data);
                    console.log(_this.$store.state.token);

                    _this.$router.push('/home');
                  }else{
                    _this.$store.commit({
                      type: 'showError',
                      name: 'nameOrPwdError',
                      title: res.data.msg
                    });
                  }
                }).catch(error => {
                  console.log(error);
                  _this.$store.commit({
                    type: 'showError',
                    name: 'nameOrPwdError',
                    title: error
                  });
                });
            }
        }
    },
    components:{
      mzError
    }
  }
</script>

<style scoped src="./login.css"></style>
