<template>
	<div class="quickReply">
		<h2>快捷回复</h2>
		<hr/>
		<input type="button" value="不符合条件" name=""/>
		<input type="button" value="材料不齐" name=""/>
		<input type="button" value="异常操作" name=""/>
		<input type="button" value="拍照不清晰" name=""/>
		<input type="button" value="受理阶段超时" name=""/>
		<button><img src="../serviceWizard/u758.png" width="10px">关闭</button>
	</div>
</template>

<script type="text/javascript">
	export default{

	}
</script>

<style type="text/css" scoped>
.quickReply{
	padding: 30px 40px;
}

h2{
	color: #4d73eb !important;
}

hr{
	color: #4d73eb;
}
input{
	width: 800px;
  	height: 40px;
  	color: #000;
  	background: #E7E7E7;
  	border: none;
	border-radius: 10px;
	box-shadow: none;
	margin-left: 60px;
	margin-top: 10px;
}

button{
	position: absolute;
	right: 40px;
	bottom: 30px;
	width: 100px;
  	height: 30px;
  	color: #FFF;
  	border: none;
	border-radius: 10px;
	background: rgba(219, 80, 60, 1);
	box-shadow: none;
	margin-left: 60px;
	margin-top: 10px;
}

img{
	margin-right: 5px;
}
</style>