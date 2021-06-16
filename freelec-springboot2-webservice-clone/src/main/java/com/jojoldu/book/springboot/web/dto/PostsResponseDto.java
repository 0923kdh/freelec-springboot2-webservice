package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Getter;

/*
1. Dto Class 는 Request 데이터를 받는다.

2. PostsResponseDto는 Entity의 필드 중 일부만 사용하므로 생서자로 Entity를 받아 필드에 값을 넣는다.
*/

@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}