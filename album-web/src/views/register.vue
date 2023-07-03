
<template>
  <div class="register-page" >
    <div class="register-container">
      <el-row justify="center">
        <h2 class="register-h">注册</h2>
      </el-row>
      <el-row>
        <el-input v-model="input" placeholder="用户名" :input-style="input_style1"/>
      </el-row>
      <el-row>
        <el-input v-model="input" placeholder="密码" :input-style="input_style1"/>
      </el-row>
      <el-row>
        <el-input v-model="input" placeholder="重新输入密码" :input-style="input_style1"/>
      </el-row>
      <el-row>
        <el-input v-model="input" placeholder="输入手机号码" :input-style="input_style1"/>
      </el-row>
      <el-row justify="space-between">
        <el-col span="5">
          <el-input v-model="input" placeholder="验证码" :input-style="input_style2" />
        </el-col>
        <el-col span="6">
          <div>
            <identitfy :identifyCode="identifyCode" dotColorMax="500" dotColorMin="250"></identitfy>
          </div>
        </el-col>
      </el-row>
      <el-row justify="center">
        <el-button type="primary" class="btn-register">注册</el-button>
      </el-row>
    </div>
  </div>
</template>


<script setup>
import { ref, defineComponent} from "vue";
import identitfy from '@/components/ientify.vue'
const input_style1 = ref({
  marginBottom: "10px"
})
const input_style2 = ref({
  marginBottom: "20px"
})

const components = defineComponent({
  identitfy
})
let identifyCode = ref("ab12")

function changeCode(data) {
  identifyCode = ""
  for(let i = 0; i < data.length; i++) {
    identifyCode += data[i]
  }
}
</script>

<style scope="sass">

.register-container {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  width: 350px;
  border: 1px solid #dcdfe6;
  padding: 30px;
  padding-top: 15px;
  border-radius: 2px;
  box-shadow: rgba(99, 99, 99, 0.2) 0px 2px 8px 0px;
.register-h {
  color: black;
}
.btn-register {
  width: 100%;
}
}

</style>