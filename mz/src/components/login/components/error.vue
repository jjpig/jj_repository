<template>
	<div class="error">
		<div>登录失败</div>
		<p>{{popTitle}}</p>
		<button @click="backToLogin">确&nbsp;定</button>
	</div>
</template>

<script type="text/javascript">
	export default{
		name: 'error',
		computed: {
	      popTitle () {
	            return this.$store.state.popTitle
	      },
	      isShowLoginError(){
	        return this.$store.state.isShowLoginError
	      }
	    },
		methods:{
			backToLogin(){
				return this.$store.commit("closeError");
			}
		}		
	}
</script>

<style scoped src="./error.css"></style>