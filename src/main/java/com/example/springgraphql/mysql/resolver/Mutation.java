package com.example.springgraphql.mysql.resolver;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.springgraphql.mysql.model.Author;
import com.example.springgraphql.mysql.model.Certificado;
import com.example.springgraphql.mysql.model.Tutorial;
import com.example.springgraphql.mysql.model.Apolice;
import com.example.springgraphql.mysql.repository.AuthorRepository;
import com.example.springgraphql.mysql.repository.CertificadoRepository;
import com.example.springgraphql.mysql.repository.TutorialRepository;
import com.example.springgraphql.mysql.repository.ApoliceAutoRepository;

import javassist.NotFoundException;

@Component
public class Mutation implements GraphQLMutationResolver {
	private AuthorRepository authorRepository;
	private TutorialRepository tutorialRepository;
	private CertificadoRepository certificadoRepository;
	private ApoliceAutoRepository apoliceAutoRepository;

	@Autowired
	public Mutation(AuthorRepository authorRepository, TutorialRepository tutorialRepository, CertificadoRepository certificadoRepository, ApoliceAutoRepository apoliceAutoRepository) {
		this.authorRepository = authorRepository;
		this.tutorialRepository = tutorialRepository;
		this.certificadoRepository = certificadoRepository;
		this.apoliceAutoRepository = apoliceAutoRepository;
	}

	public Author createAuthor(String name, Integer age) {
		Author author = new Author();
		author.setName(name);
		author.setAge(age);

		authorRepository.save(author);

		return author;
	}

	public Tutorial createTutorial(String title, String description, Long authorId) {
		Tutorial book = new Tutorial();
		book.setAuthor(new Author(authorId));
		book.setTitle(title);
		book.setDescription(description);

		tutorialRepository.save(book);

		return book;
	}

	public Certificado createCertificado(Integer cdProdutoRet, Integer numeroApolice, Integer seguradoUID) {
		Certificado certificado = new Certificado();
		certificado.setCdProdutoRet(cdProdutoRet);
		certificado.setNumeroApolice(numeroApolice);
		certificado.setSeguradoUID(seguradoUID);

		certificadoRepository.save(certificado);

		return certificado;
	}

	//public ApoliceAuto createApoliceAuto(String cia, String cpfCPJCorretor, Long certificadoUID) {
	public Apolice createApolice(String cia, String cpfCPJCorretor, Long certificadoUID) {
		Apolice apoliceAuto = new Apolice();
		apoliceAuto.setCia(cia);
		apoliceAuto.setCpfCPJCorretor(cpfCPJCorretor);
		apoliceAuto.setCertificadoUID(certificadoUID);

		apoliceAutoRepository.save(apoliceAuto);

		return apoliceAuto;
	}

	public boolean deleteTutorial(Long id) {
		tutorialRepository.deleteById(id);
		return true;
	}

	public Tutorial updateTutorial(Long id, String title, String description) throws NotFoundException {
		Optional<Tutorial> optTutorial = tutorialRepository.findById(id);

		if (optTutorial.isPresent()) {
			Tutorial tutorial = optTutorial.get();

			if (title != null)
				tutorial.setTitle(title);
			if (description != null)
				tutorial.setDescription(description);

			tutorialRepository.save(tutorial);
			return tutorial;
		}

		throw new NotFoundException("Not found Tutorial to update!");
	}
}
