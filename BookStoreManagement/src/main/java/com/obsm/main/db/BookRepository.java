package com.obsm.main.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.obsm.main.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>
{

}
