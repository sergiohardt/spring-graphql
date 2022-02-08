package com.example.springgraphql.mysql.resolver;

import java.util.Optional;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.springgraphql.mysql.model.Apolice;
import com.example.springgraphql.mysql.model.Certificado;
import com.example.springgraphql.mysql.repository.ApoliceAutoRepository;
import com.example.springgraphql.mysql.repository.CertificadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javassist.NotFoundException;

@Component
public class Mutation implements GraphQLMutationResolver {
	private CertificadoRepository certificadoRepository;
	private ApoliceAutoRepository apoliceAutoRepository;

	@Autowired
	public Mutation(CertificadoRepository certificadoRepository, ApoliceAutoRepository apoliceAutoRepository) {
		this.certificadoRepository = certificadoRepository;
		this.apoliceAutoRepository = apoliceAutoRepository;
	}

	public Certificado createCertificado(Integer cdProdutoRet, Integer numeroApolice, Integer seguradoUID) {
		Certificado certificado = new Certificado();
		certificado.setCdProdutoRet(cdProdutoRet);
		certificado.setNumeroApolice(numeroApolice);
		certificado.setSeguradoUID(seguradoUID);

		certificadoRepository.save(certificado);

		return certificado;
	}

	public Apolice createApolice(String cia, String cpfCPJCorretor, Long certificadoUID) {
		Apolice apoliceAuto = new Apolice();
		apoliceAuto.setCia(cia);
		apoliceAuto.setCpfCPJCorretor(cpfCPJCorretor);
		apoliceAuto.setCertificadoUID(certificadoUID);

		apoliceAutoRepository.save(apoliceAuto);

		return apoliceAuto;
	}

	public boolean deleteCertificaodo(Long id) {
		certificadoRepository.deleteById(id);
		return true;
	}

	public Certificado updateCertificaodo(Long id, Integer cdProdutoRet, Integer numeroApolice, Integer seguradoUID) throws NotFoundException {
		Optional<Certificado> optTutorial = certificadoRepository.findById(id);

		if (optTutorial.isPresent()) {
			Certificado certificado = optTutorial.get();
			certificado.setCdProdutoRet(cdProdutoRet);
			certificado.setNumeroApolice(numeroApolice);
			certificado.setSeguradoUID(seguradoUID);

			certificadoRepository.save(certificado);
			return certificado;
		}

		throw new NotFoundException("Not found Certificado to update!");
	}
}
