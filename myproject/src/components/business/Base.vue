<template>
	<div class="content--base">

		<video class="" webkit-playsinline style="object-fit:contain; height:500px;">
			<source src="/static/resource/1.mp4" type="video/mp4"/>
			<p>设备不支持</p>
		</video>
		<img src="/static/resource/2.png" style="width:80px;" class="base__video" />
		<div class="controls">
                <div>
                    <div class="progressBar">
                        <div class="timeBar"></div>
                    </div>
                </div>
                <div><span class="current">00:00</span>/<span class="duration">00:00</span></div>
                <div><span class="fill">全屏</span></div>
        </div>
	</div>
</template>

<script type="text/javascript">

	export default{
		name: 'base',
		data(){
			return{
				
			}
		},
	}
</script>

<style scoped src="./bass.css"></style>