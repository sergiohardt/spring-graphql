package com.example.springgraphql.mysql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.springgraphql.mysql.model.Apolice;
import com.example.springgraphql.mysql.model.Certificado;
import com.example.springgraphql.mysql.repository.ApoliceAutoRepository;
import com.example.springgraphql.mysql.repository.CertificadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
	private CertificadoRepository certificadoRepository;
	private ApoliceAutoRepository apoliceAutoRepository;

	@Autowired
	public Query(CertificadoRepository certificadoRepository, ApoliceAutoRepository apoliceAutoRepository) {
		this.certificadoRepository = certificadoRepository;
		this.apoliceAutoRepository = apoliceAutoRepository;
	}

	public Iterable<Certificado> findAllCertificados() {
		return certificadoRepository.findAll();
	}

	public Iterable<Apolice> findAllApolices() {
		return apoliceAutoRepository.findAll();
	}
}
