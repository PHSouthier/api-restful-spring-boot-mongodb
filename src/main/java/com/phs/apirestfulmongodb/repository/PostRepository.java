package com.phs.apirestfulmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.phs.apirestfulmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
