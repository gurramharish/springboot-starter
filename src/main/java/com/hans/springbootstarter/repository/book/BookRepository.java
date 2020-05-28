package com.hans.springbootstarter.repository.book;

import com.hans.springbootstarter.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
