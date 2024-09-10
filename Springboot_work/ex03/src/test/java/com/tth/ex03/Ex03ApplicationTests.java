package com.tth.ex03;

import com.tth.ex03.user.User;
import com.tth.ex03.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class Ex03ApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
		// save insert 실행...
		System.out.println("실행");
		User user = User.builder()
				.name("탁길동")
				.age(33)
				.email("aaa@naver.com")
				.password("password")
				.wdate(LocalDateTime.now())
				.build();

		userRepository.save(user);
	}

	@Test
	void selectTest(){
		userRepository.findAll()
				.stream()
				.forEach(System.out::println);

	}

}
