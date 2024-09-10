<template>
  <div>
    <h1 class="text-5xl">INSERT</h1>
    <label for="email">email</label>
    <input type="text" name="" id="email" v-model="email">
    <h1 class="text-3xl">{{email}}</h1>
    <button @click="doInsert"
    class="">버튼
    </button>
  </div>
</template>

<script>
import{ref} from "vue";

export default {
  setup () {
  const email = ref('');
  const doInsert = () =>{
    console.log(email.value);
    // fetch(`http://localhost:8080/user/insert`,)
    // .then()
  }    

    return {doInsert,email}
  }
}
</script>

<style lang="scss" scoped>

</style>