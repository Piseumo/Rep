<script setup>
import { RouterLink, RouterView } from 'vue-router'

</script>
<script>
export default {
  data() {
    return {
      calendar: [],
      year: 2024,
      month: 10,
    };
  },
  methods: {
    getNextMonth() {
      if (this.month === 12) {
        this.month = 1;
        this.year++;
      } else {
        this.month++;
      }
      this.fetchCalendar(); // 달력 데이터를 다시 가져오는 로직
    },
    getPreviousMonth() {
      if (this.month === 1) {
        this.month = 12;
        this.year--;
      } else {
        this.month--;
      }
      this.fetchCalendar(); // 달력 데이터를 다시 가져오는 로직
    },
    fetchCalendar() {
      // 서버에서 달력 데이터를 가져오는 API 호출
      // 이 예시에서는 직접 달력 데이터를 생성했다고 가정
      this.calendar = [
        ["", "", 1, 2, 3, 4, 5],
        [6, 7, 8, 9, 10, 11, 12],
        [13, 14, 15, 16, 17, 18, 19],
        [20, 21, 22, 23, 24, 25, 26],
        [27, 28, 29, 30, 31, "", ""],
      ];
    },
  },
  mounted() {
    this.fetchCalendar(); // 초기 달력 데이터 가져오기
  },
};
</script>

<template>
   <div>
    <button @click="getPreviousMonth">이전 달</button>
    <button @click="getNextMonth">다음 달</button>
    <table>
      <thead>
        <tr>
          <th>Sun</th>
          <th>Mon</th>
          <th>Tue</th>
          <th>Wed</th>
          <th>Thu</th>
          <th>Fri</th>
          <th>Sat</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="(week, index) in calendar" :key="index">
          <td v-for="(day, idx) in week" :key="idx">{{ day }}</td>
        </tr>
      </tbody>
    </table>
  </div>
  <header>
    <div class="p-5 bg-slate-500 text-white text-3xl">
      <nav class="flex space-x-5">
        <div>
          <RouterLink to="/">Home</RouterLink>
        </div>
        <div>
          <RouterLink to="/user">User</RouterLink>
        </div>
        <div class="group relative">
          <RouterLink to="/freeboardlist">FreeBoard</RouterLink>
          <div class="opacity-0 
                    group-hover:opacity-100 
                    transition absolute 
                    bg-slate-500 
                    p-5 top-8
                    -left-5
                    rounded">
            <div>
              <RouterLink to="/freeboardlist">FreeBoardList</RouterLink>
            </div>
            <div>
              <RouterLink to="/freeboardinput">FreeBoardinput</RouterLink>
            </div>
          </div>
        </div>
        <div>
          <RouterLink to="/fileupload">fileupload</RouterLink>
        </div>
      </nav>
    </div>
  </header>

  <RouterView />
</template>

<style scoped></style>
