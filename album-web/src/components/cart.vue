<template>
  <div>
    <el-table :data="tableData" border style="width: 100%" empty-text="暂无订单">
    <el-table-column prop="date" label="订单编号" width="180" />
    <el-table-column prop="name" label="商品名称" width="180" />
    <el-table-column prop="address" label="定制信息" />
    <el-table-column prop="address" label="购买数量" />
    <el-table-column prop="address" label="支付金额" />
    </el-table>
  </div>
</template>

<script setup>

</script>

<style scoped>

</style>