package com.ll.jpa.global.initData;

import com.ll.jpa.domain.post.post.entity.Post;
import com.ll.jpa.domain.post.post.sevice.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * packageName    : com.ll.jpa.global.initData
 * fileName       : BaseInitData
 * author         : sungjun
 * date           : 2025-01-20
 * description    : 자동 주석 생성
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-20        kyd54       최초 생성
 */
@Configuration
@RequiredArgsConstructor
public class BaseInitData {
    private final PostService postService;

    @Bean
    public ApplicationRunner BaseInitDataApplicationRunner() {
        return args -> {
            Post post1 = postService.write("title1", "content1");
            System.out.println(post1.getId() + "번 글이 생성됨");

            Post post2 = postService.write("title2", "content2");
            System.out.println(post2.getId() + "번 글이 생성됨");

            Post post3 = postService.write("title3", "content3");
            System.out.println(post3.getId() + "번 글이 생성됨");

            Post found = postService.findById(2).get();
            System.out.println("found_id : " + found.getId());
            System.out.println("found_title : " + found.getTitle());
            System.out.println("found_content : " + found.getContent());
        };
    }
}
