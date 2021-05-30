package com.jojoldu.book.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
1. class HelloController
 1) /hello로 요청이 오면 문자열 hello를 반환하는 class.

2. @RestController
 1) 스피링프레임워크 4.x 버전 이상부터 사용가능한 어노테이션으로 @Controller에 @ResponseBody가 결합된 어노테이션이다.
 2) JSON을 반환한다.
 * Controller는 주로 View를 반환하기 위해 사용함

3. GetMapping
 1) HTTP Get Method 요청을 받을 수 있는 API를 만들어준다.
*/

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() { return "hello"; }
}
