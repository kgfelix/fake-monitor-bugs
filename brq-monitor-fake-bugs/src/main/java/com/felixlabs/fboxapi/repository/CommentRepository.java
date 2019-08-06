package com.felixlabs.fboxapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.felixlabs.fboxapi.model.Comment;

public interface CommentRepository extends CrudRepository<Comment, Integer> {

}
