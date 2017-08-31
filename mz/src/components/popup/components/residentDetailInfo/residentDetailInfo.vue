<template>
  <div class="detailInfo">
    <div class="info-box clearfix">
      <div class="left-list">
        <ul>
          <li :class="{ active: list.state[index] }"
              v-for="(i, index) in list.navInfo"
              @click="changeCurrentContent( index )">
              <i :class='i.icon'></i>{{ i.title }}
          </li>
        </ul>
      </div>
      <div class="right-content">

        <!--基本信息-->
        <div v-if="list.state[0]" class="content">
          <table>
            <tr>
            <td rowspan="6"><img src="" width="100%"></td>
            <td><span>身份证号</span></td>
            <td><span>姓名</span></td>
            <td><span>出生年月</span></td>
            <td><span>性别</span></td>  
          </tr>
          <tr>
            <td><input type="text"></td>
            <td><input type="text"></td>
            <td><el-date-picker v-model="birthday" type="date" placeholder="选择日期" :picker-options="pickerOptions0"></el-date-picker></td>
            <td>
              <select name="">
                <option value="1">男</option>
                <option value="2">女</option>
              </select>
            </td>
          </tr>
          <tr>
            <td><span>手机号码</span></td>
            <td><span>联系电话</span></td>
            <td><span>住址邮编</span></td>
            <td><span>文化程度</span></td>
          </tr>
          <tr>
            <td><input type="text"></td>
            <td><el-input><template slot="prepend">028</template></el-input></td>
            <td><input type="text"></td>
            <td>
              <select name="" style="width:80px;">
                <option value="1">不明</option>
              </select>
            </td>
          </tr>
          <tr>
            <td colspan="3"><span>户籍地址</span></td>
            <td><span>民族</span></td>
          </tr>
          <tr>
            <td colspan="3"><input type="text"></td>
            <td><input type="text"></td>
          </tr>
          <tr>
            <td></td>
            <td colspan="3"><span>居住地址</span></td>
          </tr>
          <tr>
            <td></td>
            <td colspan="3"><input type="text"></td>
          </tr>
          <tr>
            <td></td>
            <td colspan="3"><span>工作地址</span></td>
          </tr>
          <tr>
            <td></td>
            <td colspan="3"><input type="text"></td>
          </tr>
          </table>
        </div>

        <!--扩展信息-->
        <div v-if="list.state[1]" class="content">

          <table style="width:80%; margin:auto;">
            <tr>
              <td><span>婚姻状况</span></td>
              <td><span>健康状况</span></td>
            </tr>
            <tr>
              <td>
                <select>
                  <option value="0">未知</option>
                </select>
              </td>
              <td>
                <select>
                  <option value="0">健康</option>
                </select>
              </td>
            </tr>
            <tr>
              <td><span>政治面貌</span></td>
              <td><span>血型</span></td>
            </tr>
            <tr>
              <td>
                <select>
                  <option value="0">群众</option>
                </select>
              </td>
              <td>
                <select>
                  <option value="0">其他</option>
                </select>
              </td>
            </tr>
            <tr>
              <td colspan="2">
                <span>是否工作</span>
                <button>是</button>
                <button>否</button>
              </td>
            </tr>
            <tr>
              <td colspan="2"><span>公司名称</span></td>
            </tr>
            <tr>
              <td colspan="2"><input type="text"></td>
            </tr>
            <tr>
              <td colspan="2">
                <span>是否有房产</span>
                <button>是</button>
                <button>否</button>
              </td>
            </tr>
          </table>


        </div>

        <!-- 人社信息 -->
        <div v-if="list.state[2]" class="content" style="width:50%; margin:auto;">
          <span>就业证号</span>
          <input type="text" placeholder="输入公司全称">
          <br>
          <span>是否参加医保</span>
          <button style="width:80px;margin-left:20px;">是</button>
          <button style="width:80px;margin-left:20px;">否</button>
          <br>
          <span>是否参加养老保险</span>
          <button style="width:80px;margin-left:20px;">是</button>
          <button style="width:80px;margin-left:20px;">否</button>
          <br>
          <span>养老保险参保时间</span><br>
          <el-date-picker v-model="birthday" type="date" placeholder="选择日期" :picker-options="pickerOptions0"></el-date-picker>
          <br>
          <span>养老保险缴费档次</span>
          <input type="text">
          <br>
          <span>养老保险注销原因</span>
          <select>
            <option value="">其他</option>
          </select>
        </div>

        <!--民政信息-->
        <div v-if="list.state[3]" class="content">
          <table style="width:80%; margin:auto;">
            <tr>
              <td><span>是否特困户</span></td>
              <td>
                <button>是</button>
                <button>否</button>
              </td>
            </tr>
            <tr>
              <td><span>是否低保对象</span></td>
              <td>
                <button>是</button>
                <button>否</button>
              </td>
            </tr>
            <tr>
              <td><span>主要收入来源</span></td>
              <td>
                <div class="checkbox-area">
                  <input type="checkbox"><span>其他</span>
                  <input type="checkbox"><span>财产性收入</span><br/>
                  <input type="checkbox"><span>失业保险金</span>
                  <input type="checkbox"><span>劳动收入</span><br/>
                  <input type="checkbox"><span>家庭其他成员供养</span>
                  <input type="checkbox"><span>最低生活保障金</span><br/>
                  <input type="checkbox"><span>离退休养老金</span>
                </div>
              </td>
            </tr>
            <tr>
              <td colspan="2"><span>生活状况</span></td>
            </tr>
            <tr>
              <td colspan="2">
                <select>
                  <option value="">一般</option>
                </select>
              </td>
            </tr>
            <tr>
              <td><span>就业情况</span></td>
              <td>
                <button>在职</button>
                <button>不在职</button>
              </td>
            </tr>
          </table>
          
        </div>

        <!--计生信息-->
        <div v-if="list.state[4]" class="content">
          <table style="width:80%; margin:auto;">
            <tr>
              <td><span>结婚日期</span></td>
              <td><span>子女个数</span></td>
              <td><span>女儿个数</span></td>
            </tr>
            <tr>
              <td><el-date-picker v-model="birthday" type="date" placeholder="选择日期" :picker-options="pickerOptions0"></el-date-picker></td>
              <td><input type="number" ></td>
              <td><input type="number" ></td>
            </tr>
            <tr>
              <td colspan="3"><span>节育措施</span></td>
            </tr>
            <tr>
              <td colspan="3">
                <select>
                  <option value="">其他</option>
                </select>
              </td>
            </tr>
            <tr>
              <td><span>是否捡、抱养、收养子女</span></td>
              <td colspan="2">
                <button>是</button>
                <button>否</button>
              </td>
            </tr>
          </table>
        </div>

        <!--残联信息-->
        <div v-if="list.state[5]" class="content" style="width:40%; margin:auto; padding-top:100px;">
          <div>
            <span>是否残疾</span>
            <button style="width:80px;margin-left:20px;">是</button>
            <button style="width:80px;margin-left:20px;">否</button>
          </div>
          <div>
            <span>残疾类型</span>
            <select>
              <option value="">请选择</option>
            </select>
          </div>
          <div>
            <span>残疾等级</span>
            <input type="number">
          </div>
        </div>

        <!--家庭成员-->
        <div v-if="list.state[6]" class="content">
              <table class="family" cellspacing="0">
                <tr>
                  <th><img src="../../../business/baseinfo/u1185.png"><img src="../../../business/baseinfo/u1183.png"></th>
                  <th>姓名</th>
                  <th>性别</th>
                  <th>身份证号</th>
                  <th>家庭身份</th>
                  <th></th>
                  <th></th>
                </tr>
                <tr>
                  <td></td>
                  <td>张三</td>
                  <td>男性</td>
                  <td>656565656565656</td>
                  <td>本人</td>
                  <td>
                    <img src="./u2217.png">
                  </td>
                  <td>
                    <button>查&nbsp;看</button>
                  </td>
                </tr>
              </table>
        </div>

        <!--历史记录-->
        <div v-if="list.state[7]" class="content">
          <div>
            <table width="100%" class="history-table">
              <tr>
                <th>事务名称</th>
                <th>受理日期</th>
              </tr>
              <tr>
                <td>个人参加社会保险登记制卡、取卡</td>
                <td>2017年01月08日</td>
              </tr>
            </table>
          </div>
        </div>

        <!--电子档案-->
        <div v-if="list.state[8]" class="content">
          <table class="record-table" cellspacing="0">
            <tr class="header">
              <th><input type="checkbox" name="check" style="width:20px;"></th>
              <th><span>档案名称</span></th>
              <th><span>上传时间</span></th>
            </tr>
            <tr>
              <td><input type="checkbox" name="check" style="width:20px;"></td>
              <td>张三个人电子信息档案</td>
              <td>2017年01月08日</td>
            </tr>
          </table>
        </div>

      </div>
    </div>
    <div class="btn-box">
      <button class="save">保存</button>
      <button @click="hidePop" class="close">关闭</button>
    </div>
  </div>
</template>

<script>

  export default {
    data () {
      return {
        list: {
            //  初始化办事指南各项显示状态
            state: [true, false, false, false, false, false, false, false, false],
            navInfo: [
              {
                icon: 'fa fa-user',
                title: '基本信息'
              },
              {
                icon: 'fa fa-sitemap',
                title: '扩展信息'
              },
              {
                icon: 'fa fa-hospital-o',
                title: '人社信息'
              },
              {
                icon: 'fa fa-asterisk',
                title: '民政信息'
              },
              {
                icon: 'fa fa-odnoklassniki',
                title: '计生信息'
              },
              {
                icon: 'fa fa-stethoscope',
                title: '残联信息'
              },
              {
                icon: 'fa fa-users',
                title: '家庭成员'
              },
              {
                icon: 'fa fa-history',
                title: '历史纪录'
              },
              {
                icon: 'fa fa-pencil-square-o',
                title: '电子档案'
              },
            ],
        },
        birthday: '',
            pickerOptions0: {
              disabledDate(time) {
                return time.getTime() < Date.now() - 8.64e7;
              }
            },
      }
    },
    methods: {
      hidePop () {
        this.$store.commit('hidePopud');
      },
      changeCurrentContent ( index ) {
          this.list.state = [false, false, false, false, false, false, false, false, false];
          this.list.state[index] = true;
      }
    }
  }
</script>

<style scoped src="./detailInfo.css">

</style>
