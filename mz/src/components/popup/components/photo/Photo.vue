<template>
  <div class="photo clearfix">
    <div class="left">
      <h2>附件信息</h2>
      <hr>
      <ul>
        <li :class="{ active: list.state[index] }"
              v-for="(title, index) in list.title"
              @click="changeCurrentContent( index )">{{ title }}</li>
      </ul>
    </div>
    <div class="right">
      <div class="photo-box">
        <div class="photo-content"></div>
        <div>
          <div class="btn-box">
            <span>照片名称</span>
            <select>
              <option v-for="(title, index) in list.title">{{title}}</option>
            </select>
            <br>
            <span style="margin-left:10px;">设备名称</span>
            <select>
              <option value="">338 Camera</option>
            </select>
          </div>
          <div class="btn-box">
            <button>拍照</button>
            <button>录像</button>
            <button>停止</button>
            <button @click="closePhotoPop">关闭</button>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
  export default {
      data () {
          return {
            list: {
              //  初始化办事指南各项显示状态
              state: [true, false, false, false, false, false, false, false, false, false, false],
              title: [
                  '身份证',
                  '户口簿',
                  '录取通知书',
                  '低保证',
                  '特困证明',
                  '慈善组学申请',
                  '低保类高等教育助学申请汇总表',
                  '特困类高等教育助学申请汇总表',
                  '高等教育慈善助学金申请表',
                  '特困家庭子女高等教育助学公示',
                  '其他证明文件'
              ]
            }
          }
      },
      methods: {
        closePhotoPop () {
            this.$store.commit({
              type: 'hidePopud'
            });
        },
        changeCurrentContent ( index ) {
          this.list.state = [false, false, false, false, false, false, false, false, false, false, false];
          this.list.state[index] = true;
        }
      }
  }
</script>

<style scoped src="./photo.css"></style>
