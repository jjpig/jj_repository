<template>
  <div class="currentBus">

    <div class="mz-distributePie">
      <mz-distributePie></mz-distributePie>
    </div>

    <div class="mz-trendLine">
      <mz-trendLine ref="trendLine"></mz-trendLine>
    </div>
    
    <div class="table-location" >
      <div class="table-header">
        <span class="name">当前已处理的事务</span>
        <span class="count">1</span>
      </div>
      <div class="table-body">
        <table width="100%">
          <tr class="col-name">
            <th>申请人</th>
            <th>事务编号</th>
            <th>事务名称</th>
            <th>受理日期</th>
            <th>办理状态</th>
            <th></th>
          </tr>
          <tr class="content-row">
            <td>王某某</td>
            <td>f9sdfj2938fjj923f</td>
            <td>《独生子女父母光荣证》遗失补办</td>
            <td>2017/8/20</td>
            <td>已办结</td>
            <td>
              <button>详细</button>
            </td>
          </tr>
          <tr class="content-row">
            <td>王某某</td>
            <td>f9sdfj2938fjj923f</td>
            <td>《独生子女父母光荣证》遗失补办</td>
            <td>2017/8/20</td>
            <td>已办结</td>
            <td>
              <button>详细</button>
            </td>
          </tr>
          <tr class="content-row">
            <td>王某某</td>
            <td>f9sdfj2938fjj923f</td>
            <td>《独生子女父母光荣证》遗失补办</td>
            <td>2017/8/20</td>
            <td>已办结</td>
            <td>
              <button>详细</button>
            </td>
          </tr>
        </table>
      </div>
    </div>

<!--     <div class="table-location">
      <div class="table-header">
        <div>
          <span class="name">当前未处理的事务</span>
          <span class="count">1</span>
        </div>
        <br>
        <div class="table-body">
          <table width="100%">
            <tr class="col-name">
              <th>申请人</th>
              <th>事务编号</th>
              <th>事务名称</th>
              <th>受理日期</th>
              <th>办理状态</th>
              <th></th>
            </tr>
            <tr class="content-row">
              <td>王某某</td>
              <td>f9sdfj2938fjj923f</td>
              <td>《独生子女父母光荣证》遗失补办</td>
              <td>2017/8/20</td>
              <td>已办结</td>
              <td>
                <button>详细</button>
              </td>
            </tr>
          </table>
        </div>
      </div> -->
    </div>
  </div>
</template>

<script>
import mzTrendLine from './components/trendLine'
import mzDistributePie from './components/distributePie'
  export default {
      data () {
          return {

          }
      },

      components: {
        mzTrendLine,
        mzDistributePie
      }
  }
</script>

<style scoped src="./currentBus.css"></style>
