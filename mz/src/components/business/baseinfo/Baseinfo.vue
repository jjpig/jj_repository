<template>
  <div class="mz-baseinfo">
    <table :model="personInfo">
      <!-- 标题 -->
      <tr class="title">
        <td colspan="5">
          <h2>个人参加社会保险登记制刷卡、取卡</h2>
        </td>
      </tr>

      <!-- 个人信息 -->
      <tr class="clearfix">
        <td class="second-title"><h2><img src="./u1085.png">个人信息</h2></td>
        <td colspan="4" style="text-align:right;" class="second-title"><h3><a href="javascript:;" @click="showServiceGuide">办事指南 >></a></h3></td>
      </tr>

      <tr>
        <td rowspan="6"><img/></td>
        <td><span>排队号</span></td>
        <td><span>姓名</span></td>
        <td><span>出生年月</span></td>
        <td><span>性别</span></td>  
      </tr>
      <tr>
        <td><input type="text"></td>
        <td><input type="text"></td>
        <td> 
          <el-date-picker v-model="birthday" type="date" placeholder="选择日期" :picker-options="pickerOptions0"></el-date-picker>
        </td>
        <td>
          <select name="">
            <option value="1">男</option>
            <option value="2">女</option>
          </select>
        </td>
      </tr>
      <tr>
        <td><span>身份证号</span></td>
        <td><span>民族</span></td>
        <td><span>文化程度</span></td>
        <td><span>住址邮编</span></td>
      </tr>
      <tr>
        <td class="IDnum">  
          <input type="text" v-model="personInfo.idNumber"><button @click="queryPersonInfo">获取</button>
        </td>
        <td>
          <select name="">
            <option value="1">汉</option>
          </select>
        </td>
        <td>
          <select name="">
            <option value="1">不明</option>
          </select>
        </td>
        <td><input type="text"></td>
      </tr>
      <tr>
        <td><span>联系电话</span></td>
        <td colspan="3"><span>手机</span></td>
      </tr>
      <tr>
        <td><input type="text" name=""></td>
        <td colspan="3"><input type="text"></td>
      </tr>
      <tr>
        <td style="text-align:center;">
          <p>
            <a href="javascript:;" @click="showResidentDetailInfo">+更多详细信息</a>
          </p>
        </td>
        <td colspan="4"><span>户籍地址</span></td>
      </tr>
      <tr>
        <td></td>
        <td colspan="4"><input type="text"></td>
      </tr>
      <tr>
        <td></td>
        <td colspan="4"><span>居住地址</span></td>
      </tr>
      <tr>
        <td></td>
        <td colspan="4"><input type="text"></td>
      </tr>
      <tr>
        <td></td>
        <td colspan="4"><span>工作地址</span></td>
      </tr>
      <tr>
        <td></td>
        <td colspan="4"><input type="text"></td>
      </tr>

      <!-- 附件信息 -->
      <tr class="clearfix">
        <td class="second-title"><h2><img src="./u1207.png">附件信息</h2></td>
        <td colspan="4" style="text-align:right;" class="second-title">
          <ul class="clearfix">
            <li @click="showPhotoPop">
              <div class="green">
                <img src="./u1205.png"/>
              </div>
            </li>
            <li @click="showRecord">
              <div class="green">
                <img src="./u1190.png"/>
              </div>
            </li>
            <li>
              <div class="green">
                <img src="./u1195.png"/>
              </div>
            </li>
            <li>
              <div class="green">
                <img src="./u1200.png"/>
              </div>
            </li>
            <li><img src="./u1183.png"></li>
            <li><img src="./u1185.png"></li>
          </ul>
        </td>
      </tr>
      <tr>
        <td rowspan="2" style="text-align:center;"><span>已上传附件</span></td>
        <td colspan="2">
          <el-upload action="" list-type="picture-card" :on-preview="handlePictureCardPreview" :on-remove="handleRemove"><i class="el-icon-plus"></i></el-upload>
          <el-dialog v-model="dialogVisible" size="tiny">
            <img width="100%" :src="dialogImageUrl" alt="">
          </el-dialog>
        </td>
        <td colspan="2" style="text-align:left;">附件支持文件格式包括：<div>jsp,&nbsp;png,&nbsp;gif,&nbsp;doc,&nbsp;txt,&nbsp;xls</div></td>
      </tr>
      <tr>
        <td colspan="4">
          <table class="upload-table">
            <tr class="header">
              <th><input type="checkbox" name="check" style="width:20px;"></th>
              <th>附件名称</th>
              <th>上传时间</th>
            </tr>
            <tr>
              <td><input type="checkbox" name="check" style="width:20px;"></td>
              <td>name</td>
              <td>time</td>
            </tr>
          </table>
        </td>
      </tr>

      <!-- 事务信息 -->
      <tr>
        <td colspan="5" class="second-title"><h2><img src="./u1246.png">事务信息</h2></td>
      </tr>
      <tr>
        <td rowspan="6"><span></span></td>
        <td><span>受理日期</span></td>
        <td><span>联系电话</span></td>
        <td><span>事务状态</span></td>
        <td><span>办理类型</span></td>  
      </tr>
      <tr>
        <td>
          <el-date-picker v-model="gettime" type="date" placeholder="选择日期" :picker-options="pickerOptions0"></el-date-picker>
        </td>
        <td><input type="text"></td>
        <td><input type="text"></td>
        <td>
          <select name="">
            <option value="1">ss</option>
            <option value="2">as</option>
          </select>
        </td>
      </tr>
      <tr>
        <td><span>下一个办理点</span></td>
        <td><span>下一经办人</span></td>
        <td colspan="2"><span>处理意见</span></td>
      </tr>
      <tr>
        <td>
          <select name="">
            <option value="1">无</option>
            <option value="2">as</option>
          </select>
        </td>
        <td>
          <select name="">
            <option value="1">无</option>
            <option value="2">as</option>
          </select>
        </td>
        <td colspan="2">
          <select name="" v-model="checkResult">
            <option value="1">予以受理</option>
            <option value="2">不予办理</option>
          </select>
        </td>
      </tr>
      <tr>
        <td colspan="4">事务备注</td>
      </tr>
      <tr>
        <td colspan="4">
          <textarea id="" cols="100" style="height:80px;"></textarea>
          <button @click="reject" style="height:80px;" class="quickReply">快速回覆</button>
        </td>
      </tr>

      <!-- 取件信息 -->
      <tr>
        <td colspan="5" class="second-title"><h2><img src="./u1319.png">取件信息</h2></td>
      </tr>
      <tr>
        <td rowspan="2"></td>
        <td><span>取件方式</span></td>
        <td colspan="3"><span>取件地址</span></td> 
      </tr>
      <tr>
        <td>
          <select name="">
            <option value="1">ss</option>
            <option value="2">as</option>
          </select>
        </td>
        <td colspan="3">
          <select name="">
            <option value="1">ss</option>
            <option value="2">as</option>
          </select>
        </td>
      </tr>
    </table>

    <!-- 按钮框 -->
      <div class="btn-box">
        <button class="over" @click="over"><img src="./u1344.png">办结</button>
        <button class="line"><img src="./u1349.png">专线</button>
        <button class="record" @click="showRecord"><img src="../../popup/components/serviceGuide/u874.png" width="10px" />档案</button>
        <button class="back" @click="back"><img src="./u1344.png">返回</button>
      </div>
    </div>
</template>

<script>
  export default {
      data () {
          return {
            checkResult: '',
            birthday:'',
            gettime:'',
            pickerOptions0: {
              disabledDate(time) {
                return time.getTime() < Date.now() - 8.64e7;
              }
            },
            dialogImageUrl: '',
            dialogVisible: false,
            personInfo: [
              {idNumber : ''},
            ]
          }
      },
      methods: {

        showServiceGuide () {
          var _this = this;
          this.$http.post('/affair/queryFormList?affairTypeId='+this.$store.state.affairTypeId)
          .then(res => {
            console.log(res.rows.name);
            // for (let i = 0; i < res.rows.length; i++) {
            //   _this.items[i].title = res.data.data[i].name;
            // }
          })
          .catch(error => {
            console.log(error);
          });
            //  显示办事指南
          this.$store.commit({
            type: 'showPopup',
            name: 'serviceGuide',
            title: '办事指南'
          });
        },

        showResidentDetailInfo () {
            //  显示居民详细信息
          this.$store.commit({
            type: 'showPopup',
            name: 'residentDetailInfo',
            title: '居民详细信息'
          });
        },

        showPhotoPop () {
            //  显示拍照窗口
          this.$store.commit({
            type: 'showPopup',
            name: 'photo',
            title: '拍摄照片'
          });
        },

        showAutoTable () {
            //  自动填表
            this.$store.commit({
              type: 'showPopup',
              name: 'autoTable',
              title: '自动填表'
            });
        },

        showRecord(){
          this.$store.commit({
              type: 'showPopup',
              name: 'record',
              title: '档案'
            });
        },

        over(){
          this.$store.commit({
            type: 'showPopup',
            name: 'printGuide',
            title: '办事向导'
          });
        },

        back(){
          this.$router.push('currentBus');
        },

        reject(){
          if(this.checkResult == 2){
            this.$store.commit({
              type: 'showPopup',
              name: 'quickReply',
              title: '快捷回复'
            })
          }
        },

        handleRemove(file, fileList) {
          console.log(file, fileList);
        },
        handlePictureCardPreview(file) {
          this.dialogImageUrl = file.url;
          this.dialogVisible = true;
        },

        queryPersonInfo(){

          var _this = this;
          // var instance = axios.create({
          //   baseURL:"http://139.224.32.1:8080/",
          //   timeout:1000,
          //   headers: {'content-type':'foobar'}
          // });
          _this.$http.post('http://139.224.32.1:8080/mz/affair/person/query', {
                params: {
                  idNumber: _this.personInfo.idNumber
                }
            })
          .then(res => {
            _this.personInfo = res.data.data;
          })
          .catch(error => {
            console.log(error);
          });
        },
      }
  }
</script>

<style scoped src="./baseinfo.css">
  .el-select .el-input {
    width: 110px;
  }
</style>
