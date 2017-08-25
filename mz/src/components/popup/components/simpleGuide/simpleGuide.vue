<template>
	<div class="guide">
		<p>您可以进行一下操作</p>	
		<div class="button-area">
			<button @click="register" class="register">咨询登记</button><br/>
			<button @click="print" class="print">打印报告</button><br/>
			<button @click="back" class="back">返回首页</button>
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
				this.$router.push('currentBus');
			}
		}
	}
</script>

<style scoped src="./simpleGuide.css"></style>