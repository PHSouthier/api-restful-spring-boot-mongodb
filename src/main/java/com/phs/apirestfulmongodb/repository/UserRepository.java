package com.phs.apirestfulmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.phs.apirestfulmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
