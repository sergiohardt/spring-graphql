package com.example.springgraphql.mysql.repository;

import com.example.springgraphql.mysql.model.Certificado;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificadoRepository extends JpaRepository<Certificado, Long> {

}