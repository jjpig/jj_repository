<template>
	<div>
		<div class="title">
			<p>本月受理分布</p>
		</div>
		<div id="myPie" :style="{width: '100%', height: '295%'}"></div>
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
				require('echarts/theme/macarons');
		    	// 基于准备好的dom，初始化echarts实例
		        let myPie = this.$echarts.init(document.getElementById('myPie'),'macarons');
		        let month = new Date();
		        myPie.setOption({
		        	title: {
		        		text: month.getMonth()+'月',
				        x: 'center',
				        y: 'center',
		            	textStyle: {
		            		fontFamily: 'SourceHanSansCN-Medium,Source Han Sans CN Medium,Source Han Sans CN Normal,Source Han Sans CN',
						    fontWeight: 500,
						    fontStyle: 'normal',
						    fontSize: 60,
						    color: '#595757',
						    lineHight: 50
		            	},
		        	},

		        	calculable: true,
		        	tooltip:{},
		        	series: [{
		        		name: '受理分布',
		        		type: 'pie',
		        		radius: ['50%', '70%'],
		        		itemStyle: {
		        			normal: {
		        				label: {
		        					show: true,
		        					fontFamily: 'IKEASans-Regular,IKEA Sans',
				    				fontWeight: 400,
									fontStyle: 'normal',
									color: '#595757',
									formatter: '{d}%\n{b}'
									// formatter: function(params){
									// 	if(params.name.length > 7){
									// 		return params.name.substring(0,7)+'\n'+params.name.substring(7)+'\n'+params.value+'%';
									// 	}else{
									// 		return params.name+'\n'+params.value+'%';
									// 	}
									// } 
								},
		        				labelLine: {
		        					show: true
		        				},
		        				
		        			},

		        			emphasis: {
		        				label: {
		        					show: true,
		        					position: 'center',
		        					textStyle: {
		        						fontFamily: 'IKEASans-Regular,IKEA Sans',
			    						fontWeight: 400,
									    fontStyle: 'normal',
									    color: '#333333'
		        					}
		        				}
		        			}
		        		},

		        		data: [
		        			{value: 335, name:'生育服务登记'},
		        			{value: 310, name:'电子婚育证明'},
		        			{value: 234, name:'优生健康检查服务卡'},
		        			{value: 135, name:'计划生育技术服务'},
		        		],
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

	#myPie{
		margin-top: 10px;
	}
</style>