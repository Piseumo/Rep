package com.tth.org.kakao.todo;

import com.tth.org.kakao.jpa.KakaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
    List<TodoEntity> findAllByKakaoEntity(KakaoEntity kakaoEntity);
}
