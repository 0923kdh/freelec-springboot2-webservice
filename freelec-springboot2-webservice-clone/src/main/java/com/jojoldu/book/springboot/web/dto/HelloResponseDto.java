package com.jojoldu.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/*
1. Dto Class 는 Request 데이터를 받는다.
 1) Request와 Response용 Dto는 View를 위한 클래스라 잦은 변경이 필요할 수 있음.
 2) 위와 같은 이유로 View Layer / DB Layer 역할 분리를 철저하게 하는게 좋음
 3) 실제로 Controller 에서 결괏값으로 여러 테이블을 조인해서 줘야할 경우가 빈번하므로
    Entity 클래스만으로 표현하기가 어렵다.
 4) Entity 클래스와 Controller 에서 쓸 Dto는 분리해서 사용해야함.

2. @Getter
 1) 선언된 모든 필드의 get 메소드를 생성해줌.

3. @RequiredArgsConstructor
 1) 선언된 모든 final 필드가 포함된 생성자를 생성해줌.
 2) final이 없는 필드는 생성자에 포함되지 않음.
*/

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;

}