<template>
  <div class="detailInfo">
    <div class="info-box clearfix">
      <div class="left-list">
        <ul>
          <li :class="{ active: list.state[index] }"
              v-for="(title, index) in list.title"
              @click="changeCurrentContent( index )">{{ title }}</li>
        </ul>
      </div>
      <div class="right-content">
        <!--基本信息-->
        <div v-if="list.state[0]" class="content">
          <table>
            <tr>
            <td rowspan="6"><img src="../../../leftlist/avatar.png" width="100%"></td>
            <td><span>身份证号</span></td>
            <td><span>姓名</span></td>
            <td><span>出生年月</span></td>
            <td><span>性别</span></td>  
          </tr>
          <tr>
            <td><input type="text"></td>
            <td><input type="text"></td>
            <td><input type="text"></td>
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
            <td><input type="text"></td>
            <td><input type="text"></td>
            <td>
              <select name="">
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
          <!-- <h2>基本信息</h2>
          <hr> 
          <div class="img-area">
            <img src="">
          </div>
          <div>
            <span>身份证号：</span>
            <input type="text">
            
            <span>姓名：</span>
            <input type="text">
            
            <span>出生年月</span>
            <input type="text">

            <span>性别</span>
            <select>
              <option value="1">男性</option>
            </select>
            <br>
            
            <span>民族</span>
            <select>
              <option value="0">汉族</option>
            </select>
            <br>
            <span>文化程度</span>
            <select>
              <option value="0">不明</option>
            </select>
            <span>居住地邮编</span>
            <input type="text">
            <br>
            <span>联系电话</span>
            <input type="text">
            <span>手机</span>
            <input type="text">
            <br>
            <span>户籍地址</span>
            <input type="text">
            <br>
            <span>居住地址</span>
            <input type="text">
            <br>
            <span>工作地址</span>
            <input type="text">
          </div> -->
        </div>

        <!--扩展信息-->
        <div v-if="list.state[1]">
          <h2>扩展信息</h2>
          <hr>
          <div>
            <span>婚姻状况</span>
            <select>
              <option value="0">未知</option>
            </select>
            <span>健康状况</span>
            <select>
              <option value="0">健康</option>
            </select>
            <br>
            <span>政治面貌</span>
            <select>
              <option value="0">群众</option>
            </select>
            <span>血型</span>
            <select>
              <option value="0">其他</option>
            </select>
            <br>
            <span>是否工作</span>
            <button>是</button>
            <button>否</button>
            <br>
            <span>公司名称</span>
            <input type="text">
            <br>
            <span>是否有房产</span>
            <button>是</button>
            <button>否</button>
          </div>
        </div>

        <!-- 人社信息 -->
        <div v-if="list.state[2]">
          <h2>人社信息</h2>
          <hr>
          <span>就业证号</span>
          <input type="text">
          <br>
          <span>是否参加医保</span>
          <button>是</button>
          <button>否</button>
          <br>
          <span>是否参加养老保险</span>
          <button>是</button>
          <button>否</button>
          <br>
          <span>养老保险参保时间</span>
          <input type="text">
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
        <div v-if="list.state[3]">
          <h2>民政信息</h2>
          <hr>
          <span>是否特困户</span>
          <button>是</button>
          <button>否</button>
          <br>
          <span>是否低保对象</span>
          <button>是</button>
          <button>否</button>
          <br>
          <span>主要收入来源</span>
          <div>
            <input type="checkbox"><span>其他</span>
            <input type="checkbox"><span>财产性收入</span>
            <input type="checkbox"><span>失业保险金</span>
            <input type="checkbox"><span>劳动收入</span>
            <input type="checkbox"><span>家庭其他成员供养</span>
            <input type="checkbox"><span>最低生活保障金</span>
            <input type="checkbox"><span>离退休养老金</span>
          </div>
          <br>
          <span>生活状况</span>
          <select>
            <option value="">一般</option>
          </select>
          <br>
          <span>就业情况</span>
          <button>在职</button>
          <button>不在职</button>
        </div>

        <!--计生信息-->
        <div v-if="list.state[4]">
          <h2>计生信息</h2>
          <hr>
          <div>
            <span>结婚日期</span>
            <input type="text">
          </div>
          <div>
            <span>子女个数</span>
            <input type="number">
          </div>
          <div>
            <span>女儿个数</span>
            <input type="number">
          </div>
          <div>
            <span>节育措施</span>
            <select>
              <option value="">其他</option>
            </select>
          </div>
          <div>
            <span>是否捡、抱养、收养子女</span>
            <button>是</button>
            <button>否</button>
          </div>
        </div>

        <!--残联信息-->
        <div v-if="list.state[5]">
          <h2>残联信息</h2>
          <hr>
          <div>
            <span>是否残疾</span>
            <button>是</button>
            <button>否</button>
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
        <div v-if="list.state[6]">
          <h2>家庭成员</h2>
          <hr>
          <div>
            <div>
              <button>新增</button>
              <button>修改</button>
              <button>删除</button>
            </div>
            <div>
              <table width="100%" class="family">
                <tr>
                  <th></th>
                  <th>姓名</th>
                  <th>性别</th>
                  <th>身份证号</th>
                  <th>家庭身份</th>
                  <th></th>
                </tr>
                <tr>
                  <td>
                    <input type="checkbox">
                  </td>
                  <td>张三</td>
                  <td>男性</td>
                  <td>656565656565656</td>
                  <td>本人</td>
                  <td>
                    <button>查看</button>
                  </td>
                </tr>
              </table>
            </div>
          </div>
        </div>

        <!--历史记录-->
        <div v-if="list.state[7]">
          <h2>历史记录</h2>
          <hr>
          <div>
            <table width="100%">
              <tr>
                <th>事务名称</th>
                <th>受理日期</th>
              </tr>
            </table>
          </div>
        </div>

        <!--电子档案-->
        <div v-if="list.state[8]">
          <h2>电子档案</h2>
          <hr>
          <div>
            <input type="checkbox">
            <span>档案名</span>
            <span>上传时间</span>
          </div>
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
            title: [
                '基本信息',
                '扩展信息',
                '人社信息',
                '民政信息',
                '计生信息',
                '残联信息',
                '家庭成员',
                '历史纪录',
                '电子档案'
            ]
        }
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

<style scoped src="./detailInfo.css"></style>
