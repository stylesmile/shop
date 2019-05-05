<template>
  <div class="dashboard-container">
    <div class="dashboard-text">name: {{name}}</div>
    <div class="dashboard-text">
      roles:
      <span v-for="role in roles" :key="role">{{role}}</span>
    </div>
  </div>
  <!--<h1>homepage</h1>-->
  <!--<div class="line">
    <h1>homepage</h1>
    homepage
  </div>-->
</template>
<style>
</style>
<script>
import {mapGetters} from 'vuex'

export default {
  name: 'home',
  computed: {
    ...mapGetters(['name', 'roles'])
  }
}
</script>
<style>
  .dashboard-container {
    margin: 30px;
  }

  .dashboard-text {
    font-size: 30px;
    line-height: 46px;
  }
</style>
