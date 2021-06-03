package com.jojoldu.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
1. 해당 클래스는 실제 DB의 테이블과 매칭될 클래스이며, 보통 Entity Class라고도 함.
 JPA를 사용하면 DB 데이터에 작업할 경우 실제 쿼리를 날리기보다는 이 Entity Class의 수정을 통해 작업함.

2. 해당 클래스에서 사용하는 JPA에서 제공하는 어노테이션
 1) @Entity
  (1) 테이블과 링크될 클래스임을 나타냄
  (2) 기본값으로 클래스의 카멜케이스 이름을 언더스코어 네이밍(_)으로 테이블 이름을 매칭함.
    * SalesManager.java -> sales_manager table
  (3) 웬만하면 Entity의 PK는 Long 타입의 Auto_increment를 추천함.
 2) @Id
  (1) 해당 테이블의 PK 필드를 나타냄.
 3) @GeneratedValue
  (1) PK의 생성 규칙을 나타냄.
  (2) 스프링 부트 2.0 에서는 GenerationType.IDENTITY 옵션을 추가해야만 auto_increment가 됨.
 4) @Column
  (1) 테이블의 칼럼을 나타내며 굳이 선언하지 않더라도 해당 클래스의 필드는 모두 칼럼이 됨.
  (2) 기본값 외 추가로 변경이 필요한 옵션이 있으면 사용함.
    * 문자열의 경우 VARCHAR(255)가 기본인데, 사이즈를 늘리고 싶거나 타입을 변경하고 싶거나 할 때 사용함.
*/

@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}