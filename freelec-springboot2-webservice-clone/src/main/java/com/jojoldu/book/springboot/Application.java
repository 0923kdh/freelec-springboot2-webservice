package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/*
1. @SpringBootApplication
 1) SpringBootApplication이 있는 위치부터 설정을 읽어가기 때문에 이 클래스는 항상 프로젝트 최상단에 위치해야함.
 2) 스프링 부트의 자동설정, 스프링 Bean 읽기와 생성이 모두 가능함.
 3) @Configuration, @EnableAutoConfiguration, @ComponentScan 3개의 클래스를 어노테이션 설정한 것과 동일함.
    (1) @Configuration은 스프링의 다양한 설정을 자바 코드상에서 할 수 있도록 하는 어노테이션.
    (2) @EnableAutoConfiguration은 스프링 설정을 자동화하기 위한 어노테이션.
    (3) @ComponentScan DI 컨테이너가 관리하는 Bean을 자동 등록하는 어노테이션.

2. SpringApplication.run(Application.class, args)
 1) 내장 WAS를 실행한다.
    * 내장 WAS란 별도로 외부에 WAS를 두지 않고 애플리케이션을 실행할때 내부에서 WAS를 실행하는 것을 이야기함.
      항상 서버에 톰캣 설치가 필요 없고 스프링 부트로 만들어진 Jar 파일(실행 가능한 Java 패키징 파일)로 실행하면 된다.

3. @EnableJpaAuditing
 1) JPA Auditing 어노테이션들을 모두 활성화할 수 있도록 하는 어노테이션
*/
@EnableJpaAuditing
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
