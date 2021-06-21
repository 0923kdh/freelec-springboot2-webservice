package com.jojoldu.book.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
머스테치 스타터 컨트롤러에서 문자열을 반환할 때 앞의 경로와 뒤의 파일 확장자는 자동으로 지정함.
앞의 경로 src/main/resources/templates로, 뒤의 파일 확장자는 .mustache가 붙음.
즉 여기선 index를 반환하므로 src/main/resources/templates/index.mustache로 전환되어
View Resolver가 처리하게 된다.
*/

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }
}