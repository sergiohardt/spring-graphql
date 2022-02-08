package com.example.springgraphql.mysql.repository;

import com.example.springgraphql.mysql.model.Apolice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApoliceAutoRepository extends JpaRepository<Apolice, Long> {

}