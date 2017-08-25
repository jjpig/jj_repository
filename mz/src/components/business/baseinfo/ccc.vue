<template>
  <div class="mz-baseinfo">
    <table>
      <tr class="title">
        <td colspan="5">
          <h2>个人参加社会保险登记制刷卡、取卡</h2>
        </td>
      </tr>

      <tr class="clearfix">
        <td><h2>个人基本信息</h2></td>
        <td colspan="4"><h3><a href="javascript:;" @click="showServiceGuide">办事指南 >></a></h3></td>
      </tr>

      <tr>
        <td rowspan="6"></td>
        <td><span>排队号</span></td>
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
        <td><span>身份证号</span></td>
        <td><span>民族</span></td>
        <td><span>文化程度</span></td>
        <td><span>住址邮编</span></td>
      </tr>
      <tr>
        <td><input type="text"><button @click="showPhotoPop">获取</button></td>
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
        <td>
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

      <tr class="clearfix">
        <td><h2>附件信息</h2></td>
        <td colspan="4">
        <ul class="clearfix">
            <li>新增</li>
            <li>修改</li>
            <li>删除</li>
            <li>自动配对</li>
            <li>档案</li>
            <li>刷新</li>
          </ul>
        </td>
      </tr>

      <tr>
        <td rowspan="2"><input type="button" name="upload" value="上传附件" /></td>
        <td>
          <img src=""/>
        </td>
        <td>附件支持文件格式包括：<br/>jsp,png,gif,doc,txt,xls</td>
      </tr>
      <tr>
        <td colspan="4">
          <table>
            <tr>
              <th><input type="checkbox" name="check"></th>
              <th>附件名称</th>
              <th>上传时间</th>
            </tr>
            <tr>
              <td><input type="checkbox" name="check"></td>
              <td>name</td>
              <td>time</td>
            </tr>
          </table>
        </td>
      </tr>

      <tr>
        <td colspan="5"><h2>事务信息</h2></td>
      </tr>
      <tr>
        <td rowspan="4"></td>
        <td><span>受理日期</span></td>
        <td><span>联系电话</span></td>
        <td><span>事务状态</span></td>
        <td><span>办理类型</span></td>  
      </tr>
      <tr>
        <td>
          <select name="">
            <option value="1">ss</option>
            <option value="2">as</option>
          </select>
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
        <td>
          <select name="">
            <option value="1">予以受理</option>
            <option value="2">as</option>
          </select>
        </td>
      </tr>
      <tr>
        <textarea id="" cols="100" rows="5"></textarea>
        <button>快速回复</button>
      </tr>

      <tr>
        <td colspan="5"><h2>取件信息</h2></td>
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
        <button>办结</button>
        <button>专线</button>
        <button>档案</button>
        <button>返回</button>
      </div>

      <!-- <div class="btn-box">
        <button>社区受理</button>
        <button @click="showAutoTable">表格</button>
        <button>档案</button>
        <button>返回</button>
      </div> -->
    <div class="baseinfo-box"></div>

      <!-- 基本信息 -->
      <div class="baseinfo-content"></div>

      <!-- 附件信息 -->
      <div class="enclosure-info">
        
          <div class="file-name">
            
            
          </div>
        </div>
      </div>

      <!-- 事务信息 -->
      <div class="affair-info">
        <h2>事务信息</h2>
        <div>
          <span>受理日期</span>
          <input type="text">
          <span>受理人员</span>
          <input type="text">
          <br>
          <span>事务状态</span>
          <input type="text">
          <span>办事类型</span>
          <select name="">
            <option value="1">标准件</option>
          </select>
          <br>
          <span>下一办理点</span><span>无</span>
          <span>下一经办人</span><span>无</span>
          <br>
          <span>处理意见</span>
          <select>
            <option value="1">予以处理</option>
          </select>
          <br>
          <p>事务备注</p>
          <textarea id="" cols="100" rows="5"></textarea>
          <button>快捷回复</button>
        </div>
      </div>

      <!-- 取件信息 -->
      <div class="get-info">
        <h2>取件信息</h2>
        <div>
          <span>取件方式</span><span>无需取件</span>
          <span>取件地点</span><span>无</span>
        </div>
      </div>

      

    </div>
  </div>
</template>

<script>
  export default {
      data () {
          return {

          }
      },
      methods: {
        showServiceGuide () {
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
        }
      }
  }
</script>

<style scoped src="./baseinfo.css"></style>
