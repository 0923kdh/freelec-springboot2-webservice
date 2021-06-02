package com.jojoldu.book.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/*
1. @RunWith
 1) 테스트를 진행할때 JUnit에 내장된 실행자 외에 다른 실행자를 실행시킨다.
 2) 여기서는 SpringRunner라는 스프링 실행자를 사용함.
 3) 즉 스프링 부트 테스트와 JUnit 사이에 연결자 역할을 함.

2. @WebMvcTest
 1) 여러 스프링 어노테이션 중 Web(spring MVC)에 집중할 수 있는 어노테이션임.
 2) 선언할 경우 @Controller, @ControllerAdvice 등을 사용할 수 있음.
 3) 단, @Service, @Component, @Repository 등은 사용할 수 없음.
    (1) 여기서는 컨트롤러만 사용하기 때문에 선언함.

3. @Autowired
 1) 스프링이 관리하는 빈을 주입받음.

4. private MockMvc mvc
 1) 웹 API를 테스트할 때 사용함.
 2) 스프링 MVC 테스트 시작점.
 3) 이 클래스를 통해 HTTP GET, POST 등에 대한 API 테스트를 할 수 있음.

5. param
 1) API 테스트할 때 사용될 요청 파라미터를 설정함.
 2) 단, 값은 String만 사용됨.
 3) 숫자 / 날짜 등의 데이터도 등록할 때 문자열로 변경해야만 가능함.

6. jsonPath
 1) JSON 응답값을 필드별로 검증할 수 있는 메소드.
 2) $를 기준으로 필드명을 명시함.
 3) 여서기는 name과 amount를 검증해야하니 $.name / $.amount로 검증함.
*/

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }

    @Test
    public void helloDto가_리턴된다() throws Exception {
        String name = "hello";
        int amount = 1000;

        mvc.perform(
                    get("/hello/dto")
                            .param("name", name)
                            .param("amount", String.valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount", is(amount)));
    }
}