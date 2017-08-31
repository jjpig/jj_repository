x<template>
	<div class="guide">
		<p>您可以进行一下操作</p>	
		<div class="button-area">
			<button @click="register" class="register"><img src="./u476.png" width="18px">咨询登记</button><br/>
			<button @click="print" class="print"><img src="./u478.png" width="18px">打印报告</button><br/>
			<button @click="back" class="back"><img src="./u480.png" width="18px">返回首页</button>
		</div>
	</div>
</template>

<script type="text/javascript">
	export default{
		methods: {
			register(){

			},

			print(){
				this.$store.commit('hidePopud');
				this.$store.commit({
					type: 'showPopup',
					name: 'serviceGuide',
					title: '办事指南'
				});
			},

			back(){
				this.$store.commit('hidePopud');
				this.$router.push('currentBus');
			}
		}
	}
</script>

<style scoped src="./simpleGuide.css"></style>