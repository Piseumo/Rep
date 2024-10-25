import axios from 'axios';

const url = 'http://localhost:20002';

const apiClient = axios.create({
	baseURL: 'http://localhost:20002',
	headers: {
		'context-type': 'application/json',
		'Authorization' : 'Bearer ' + localStorage.getItem('token'),
	}		
});



export const login = async (code) => {
	try {
		const res = await axios.get(`${url}/kakao/login?code=${code}`);
		return res.data;
	} catch (err) {
		console.error(err);
		return err;
	}
};

export const msgSend = async (message) => {
	try {
		const res = await axios.get(`${url}/kakao/msg?message=${message}`, {
			headers: {
				'Content-Type': 'application/json',
				Authorization: `Bearer ${localStorage.getItem('token')}`,
			},
		});
		return res;
	} catch (err) {
		console.error(err);
		return err;
	}
};

export const loginCheck = async () => {
	try {
		// const res = await axios.get(`${url}/user/info`, {
		// 	headers: {
		// 		'Content-Type': 'application/json',
		// 		Authorization: `Bearer ${localStorage.getItem('token')}`,
		// 	},
		// });
		const res = await apiClient.get('/user/info');
		return res;
	} catch (err) {
		console.error(err);
		return err;
	}
};