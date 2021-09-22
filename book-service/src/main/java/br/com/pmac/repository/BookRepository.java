package br.com.pmac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pmac.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{}