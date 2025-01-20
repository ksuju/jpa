package com.ll.jpa.domain.post.post.repository;

import com.ll.jpa.domain.post.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName    : com.ll.jpa.domain.post.post.repository
 * fileName       : PostRepository
 * author         : sungjun
 * date           : 2025-01-20
 * description    : 자동 주석 생성
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-20        kyd54       최초 생성
 */
// JpaRepository<Post, Long>
// Post = 이 클래스로 다룰 엔티티 클래스와 연동된 테이블 (POST 테이블)
// Long = Post 엔티티 클래스의 PK 타입
public interface PostRepository extends JpaRepository<Post, Long> {
}
