package com.jojoldu.book.springboot.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/*
1. Optional 은 존재할 수도 있지만 안할 수 도 있는 객체, 즉 null 이 될 수도 있는 객체를 뜻함

2. findByEmail
 1) 소셜 로그인으로 반환되는 값 중 email 을 통해 이미 생성된 사용자인지 처음 가입하는
    사용자인지 판단하기 위한 메소드임.
*/

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}