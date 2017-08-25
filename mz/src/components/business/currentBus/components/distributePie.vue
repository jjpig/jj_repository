<template>
	<div>
		<div id="myPie" :style="{width: '500px', height: '270px'}"></div>
	</div>
</template>

<script type="text/javascript">
	export default{
		data(){
			return{

			}
		},

		mounted(){
		    this.drawPie();
		},

		methods: {
		    drawPie(){
		    	// 基于准备好的dom，初始化echarts实例
		        let myPie = this.$echarts.init(document.getElementById('myPie'));
		    }
		}
	}
</script>