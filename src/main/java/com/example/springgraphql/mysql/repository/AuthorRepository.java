package com.example.springgraphql.mysql.repository;

import com.example.springgraphql.mysql.model.Author;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}