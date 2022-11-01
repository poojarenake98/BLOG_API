package com.pooja.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pooja.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
