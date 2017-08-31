<template>
	<div class="printContent">
		<div class="content">
			<iframe src="" width="100%"></iframe>
		</div>
		<div class="btn-area">
			<button @click="print">打印</button>
			<button @click="close">关闭</button>
		</div>
	</div>
</template>

<script type="text/javascript">
	export default{
		methods: {
			print(){
				
			},
			close(){
				return this.$store.commit('hidePopud');
			}
		}
	}
</script>

<style type="text/css" scoped src="./printContent.css"></style>