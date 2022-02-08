package com.example.springgraphql.mysql.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.springgraphql.mysql.model.Author;
import com.example.springgraphql.mysql.model.Certificado;
import com.example.springgraphql.mysql.model.Tutorial;
import com.example.springgraphql.mysql.model.Apolice;
import com.example.springgraphql.mysql.repository.AuthorRepository;
import com.example.springgraphql.mysql.repository.CertificadoRepository;
import com.example.springgraphql.mysql.repository.TutorialRepository;
import com.example.springgraphql.mysql.repository.ApoliceAutoRepository;

@Component
public class Query implements GraphQLQueryResolver {
	private AuthorRepository authorRepository;
	private TutorialRepository tutorialRepository;
	private CertificadoRepository certificadoRepository;
	private ApoliceAutoRepository apoliceAutoRepository;

	@Autowired
	public Query(AuthorRepository authorRepository, TutorialRepository tutorialRepository, CertificadoRepository certificadoRepository, ApoliceAutoRepository apoliceAutoRepository) {
		this.authorRepository = authorRepository;
		this.tutorialRepository = tutorialRepository;
		this.certificadoRepository = certificadoRepository;
		this.apoliceAutoRepository = apoliceAutoRepository;
	}

	public Iterable<Author> findAllAuthors() {
		return authorRepository.findAll();
	}

	public Iterable<Tutorial> findAllTutorials() {
		return tutorialRepository.findAll();
	}

	public Iterable<Certificado> findAllCertificados() {
		return certificadoRepository.findAll();
	}


	public Iterable<Apolice> findAllApolices() {
		return apoliceAutoRepository.findAll();
	}
	
	public long countAuthors() {
		return authorRepository.count();
	}

	public long countTutorials() {
		return tutorialRepository.count();
	}

}
