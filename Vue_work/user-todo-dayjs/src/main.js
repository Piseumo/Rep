import './assets/main.css';

import { createApp } from 'vue';
import { createPinia } from 'pinia';

import App from './App.vue';
import router from './router';

const app = createApp(App);

app.use(createPinia());
app.use(router);

window.Kakao.init('fa7eeb699aed4f3e61233d89424bb39b'); // 사용하려는 앱의 JavaScript 키 입력

app.mount('#app');
