package com.example.springgraphql.mysql.model;

import javax.persistence.*;

@Entity
public class Certificado {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long certificadoUID;

	@Column(name = "cdProdutoRet", nullable = false)
	private Integer cdProdutoRet;

	@Column(name = "chaveNegocio", nullable = true)
	private Integer chaveNegocio;

	@Column(name = "descricaoSituacao", nullable = true)
	private String descricaoSituacao;

	@Column(name = "nomeProduto ", nullable = true)
	private String nomeProduto;


	@Column(name = "numeroApolice", nullable = false)
	private Integer numeroApolice;

	@Column(name = "ramo", nullable = true)
	private Integer ramo;

	@Column(name = "seguradoUID", nullable = false)
	private Integer seguradoUID;

	public Long getCertificadoUID() {
		return certificadoUID;
	}

	public void setCertificadoUID(Long certificadoUID) {
		this.certificadoUID = certificadoUID;
	}

	public Integer getCdProdutoRet() {
		return cdProdutoRet;
	}

	public void setCdProdutoRet(Integer cdProdutoRet) {
		this.cdProdutoRet = cdProdutoRet;
	}

	public Integer getChaveNegocio() {
		return chaveNegocio;
	}

	public void setChaveNegocio(Integer chaveNegocio) {
		this.chaveNegocio = chaveNegocio;
	}

	public String getDescricaoSituacao() {
		return descricaoSituacao;
	}

	public void setDescricaoSituacao(String descricaoSituacao) {
		this.descricaoSituacao = descricaoSituacao;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Integer getNumeroApolice() {
		return numeroApolice;
	}

	public void setNumeroApolice(Integer numeroApolice) {
		this.numeroApolice = numeroApolice;
	}

	public Integer getRamo() {
		return ramo;
	}

	public void setRamo(Integer ramo) {
		this.ramo = ramo;
	}

	public Integer getSeguradoUID() {
		return seguradoUID;
	}

	public void setSeguradoUID(Integer seguradoUID) {
		this.seguradoUID = seguradoUID;
	}

	public Certificado() {
	}

	public Certificado(Long id) {
		this.certificadoUID = id;
	}

	public Certificado(Long id, Integer cdProdutoRet, Integer seguradoUID) {
		this.certificadoUID = id;
		this.cdProdutoRet = cdProdutoRet;
		this.seguradoUID = seguradoUID;
	}

	@Override
	public String toString() {
		return " ";
	}

}
