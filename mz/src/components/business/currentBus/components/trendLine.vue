<template>
	<div>
		<div class="title">
			<p>本月受理趋势</p>
		</div>
		<div id="myChart" :style="{width: '100%', height: '295%'}"></div>
	</div>
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

		        	tooltip:{},
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

<style type="text/css" scoped>
	.title{
		position: absolute;
		top: -10px;
		text-align: center;
		width: 100%;
		height: 30px;
		background-color: rgba(77, 115, 235, 1);
	    border: none;
	    border-radius: 15px;
	    box-shadow: none;
	    font-family: 'SourceHanSansCN-Medium', 'Source Han Sans CN Medium', 'Source Han Sans CN Normal', 'Source Han Sans CN';
	    font-weight: 500;
	    font-style: normal;
	    font-size: 20px;
	    color: #FFFFFF;
	}

	#myChart{
		margin-top: 10px;
		height: 500px;
	}
</style>