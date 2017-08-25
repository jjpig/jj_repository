<template>
  <div class="hello">
    <ptop ref="top"></ptop>
    <!-- <h1>{{ msg }}</h1> -->
    <pcontent ref="content"></pcontent>
  </div>
</template>

<script>
 import top from './top/Top';
 import content from './content/Content';

export default {
  name: 'hello',
  data () {
    return {
      msg: 'Welcome to Your Vue.js App'
    }
  },
  components: {
    ptop: top,
    pcontent: content
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}
</style>
