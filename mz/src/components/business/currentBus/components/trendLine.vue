<template>
	<div id="myChart" :style="{width: '500px', height: '270px'}"></div>
</template>

<script type="text/javascript">
	export default{
		name: 'trendLine',

		data(){
			return{
				
			}
		},

		mounted(){
		    this.drawLine();
		},

		methods: {
		    drawLine(){
		        // 基于准备好的dom，初始化echarts实例
		        let myChart = this.$echarts.init(document.getElementById('myChart'))
		        // 绘制图表
		        myChart.setOption({
		        	// 标题
		            title: { 
		            	text: '本月受理趋势',
		            	textStyle: {
		            		fontFamily: 'SourceHanSansCN-Medium,Source Han Sans CN Medium,Source Han Sans CN Normal,Source Han Sans CN',
						    fontWeight: 500,
						    fontStyle: 'normal',
						    fontSize: 20,
						    color: '#FFFFFF',
						    lineHight: 50
		            	},
		            	backgroundColor: '#4d73eb',
		            },

		            // 工具条
		            tooltip: {},

		            // 坐标轴
		            xAxis: {
		            	boundaryGap: false,
		                data: ["2017 01","2017 02","2017 03","2017 04","2017 05","2017 06"],
		                axisLine:{
		                	lineStyle:{
		                		color: '#595757',
 		                	}
		                }
		            },
		            yAxis: {
		            	splitLine:{show: false},
		            	axisLine:{
		                	lineStyle:{
		                		color: '#595757',
 		                	}
		                }
		            },
		            
		            //线
		            series: [{
		                name: '受理人数',
		                type: 'line',
		                itemStyle: {
		                	normal: {
		                		areaStyle: {
				                	color: '#6D83DE',
				                },
		                		borderColor: '#405CEE',
								borderWidth: 2,
		                	}
		                },
		                lineStyle: {
							normal: {
								color: '#405CEE',
							},
						},
						markPoint : {
		                    data : [
		                        {type : 'max', name: ''},
		                    ],
		                    itemStyle: {
		                    	normal:{
		                    		color: '#4d73eb',
		                    	}
		                    },
		                },
						
		                data: [105, 120, 336, 210, 110, 20]
		            }],
		        });
	  		}
  		}

	}
</script>

<style scoped src=""></style>