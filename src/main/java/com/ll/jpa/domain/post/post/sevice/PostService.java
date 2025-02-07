package com.ll.jpa.domain.post.post.sevice;

import com.ll.jpa.domain.post.post.entity.Post;
import com.ll.jpa.domain.post.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * packageName    : com.ll.jpa.domain.post.post.sevice
 * fileName       : PostService
 * author         : sungjun
 * date           : 2025-01-20
 * description    : 자동 주석 생성
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-20        kyd54       최초 생성
 */
@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    public Post write(String title, String content) {

        Post post = Post.builder()
                .createdAt(LocalDateTime.now())
                .modifiedAt(LocalDateTime.now())
                .title(title)
                .content(content)
                .blind(false)
                .build();

        postRepository.save(post);

        return post;
    }

    public Optional<Post> findById(long id) {
        return postRepository.findById(id);
    }
}
