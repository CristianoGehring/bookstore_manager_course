package com.cristianogehring.bookstroremanager.repository;

import com.cristianogehring.bookstroremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
