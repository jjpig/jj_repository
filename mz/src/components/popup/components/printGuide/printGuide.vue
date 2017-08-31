<template>
	<div class="printGuide">
		<p>您还可以进行一下操作</p>
		<div class="btn-area">
			<button @click="printOne" class="one">打印回执</button><br/>
			<button @click="printTwo" class="two">打印件袋</button><br/>
			<button @click="backToMain" class="back">返回首页</button>
		</div>
	</div>
</template>

<script type="text/javascript">
	export default{
		methods: {
			printOne(){
				this.$store.commit('hidePopud');
				this.$store.commit({
					type: 'showPopup',
					name: 'printContent',
					title: '打印回执'
				});
			},

			printTwo(){
				this.$store.commit('hidePopud');
				this.$store.commit({
					type: 'showPopup',
					name: 'printContent',
					title: '打印回执'
				});
			},
			backToMain(){
				return this.$router.push('currentBus');
			}
		}
	}
</script>

<style type="text/css" scoped src="./printGuide.css"></style>