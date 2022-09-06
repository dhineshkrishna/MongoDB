package com.batch.mongo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.batch.mongo.model.Book;

@Repository
public interface BookRepo extends MongoRepository<Book, Integer> {

}
