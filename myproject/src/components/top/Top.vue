<template>
	<div class="hello--top">
		{{topMsg}}
	</div>
</template>

<script type="text/javascript">
	export default{
		name: 'top',
		data(){
			return{
				topMsg: "vue practice"
			}
		}
	}
</script>

<style scoped src="./top.css"></style>
