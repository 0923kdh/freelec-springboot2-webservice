package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/*
1. JPA Repository
 1) 보통 ibatis Mybatis 등에서 Dao라고 불리는 DB Layer 접근자로, 인터페이스로 생성함.
 2) 단순 인터페이스 생성 후 JpaRepository<Entity Class, PK 타입>를 상속하면 기본 CRUD 메소드가 자동으로 생성됨.
 3) @Repository를 추가할 필요도 없음.
 4) Entity Class와 기본 Entity Repository는 함께 위치해야함.(도메인 패키지에서 같이 관리함)
 5)
*/

public interface PostsRepository extends JpaRepository<Posts, Long> {

}
