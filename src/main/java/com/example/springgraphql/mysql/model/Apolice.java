package com.example.springgraphql.mysql.model;

import java.sql.Date;

import javax.persistence.*;

@Entity
public class Apolice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long apoliceAutoUID;
	
	@Column(name = "cia", nullable = true)
	private String cia;

	@Column(name = "cpfCPJCorretor", nullable = true)
	private String cpfCPJCorretor;

	@Column(name = "dataInicioVigencia", nullable = true)
	private Date dataInicioVigencia;

	@Column(name = "dataFimVigencia", nullable = true)
	private Date dataFimVigencia;
	
	@Column(name = "descricao", nullable = true)
	private String descricao;
		
	@Column(name = "documentoCertificado", nullable = true)
	private String documentoCertificado;

	@Column(name = "email", nullable = true)
	private String email;

	@Column(name = "estipulante", nullable = true)
	private String estipulante;
		
	@Column(name = "item", nullable = true)
	private String item;
		
	@Column(name = "nomeCorretor", nullable = true)
	private String nomeCorretor;
		
	@Column(name = "produto", nullable = true)
	private String produto;
		
	@Column(name = "quantidadeDiasRenovacao", nullable = true)
	private String quantidadeDiasRenovacao;

	@Column(name = "ramo", nullable = true)
	private String ramo;

	@Column(name = "segmento", nullable = true)
	private String segmento;

	@Column(name = "sucursal", nullable = true)
	private String sucursal;

	@Column(name = "tipoApolice", nullable = true)
	private String tipoApolice;

	@Column(name = "unidadeProdutora", nullable = true)
	private String unidadeProdutora;

	@Column(name = "certificadoUID", nullable = false)
	private Long certificadoUID;
	
	public Long getApoliceAutoUID() {
		return apoliceAutoUID;
	}

	public void setApoliceAutoUID(Long apoliceAutoUID) {
		this.apoliceAutoUID = apoliceAutoUID;
	}

	public String getCia() {
		return cia;
	}

	public void setCia(String cia) {
		this.cia = cia;
	}

	public String getCpfCPJCorretor() {
		return cpfCPJCorretor;
	}

	public void setCpfCPJCorretor(String cpfCPJCorretor) {
		this.cpfCPJCorretor = cpfCPJCorretor;
	}

	public Date getDataInicioVigencia() {
		return dataInicioVigencia;
	}

	public void setDataInicioVigencia(Date dataInicioVigencia) {
		this.dataInicioVigencia = dataInicioVigencia;
	}

	public Date getDataFimVigencia() {
		return dataFimVigencia;
	}

	public void setDataFimVigencia(Date dataFimVigencia) {
		this.dataFimVigencia = dataFimVigencia;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDocumentoCertificado() {
		return documentoCertificado;
	}

	public void setDocumentoCertificado(String documentoCertificado) {
		this.documentoCertificado = documentoCertificado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstipulante() {
		return estipulante;
	}

	public void setEstipulante(String estipulante) {
		this.estipulante = estipulante;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getNomeCorretor() {
		return nomeCorretor;
	}

	public void setNomeCorretor(String nomeCorretor) {
		this.nomeCorretor = nomeCorretor;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getQuantidadeDiasRenovacao() {
		return quantidadeDiasRenovacao;
	}

	public void setQuantidadeDiasRenovacao(String quantidadeDiasRenovacao) {
		this.quantidadeDiasRenovacao = quantidadeDiasRenovacao;
	}

	public String getRamo() {
		return ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}

	public String getSegmento() {
		return segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public String getTipoApolice() {
		return tipoApolice;
	}

	public void setTipoApolice(String tipoApolice) {
		this.tipoApolice = tipoApolice;
	}

	public String getUnidadeProdutora() {
		return unidadeProdutora;
	}

	public void setUnidadeProdutora(String unidadeProdutora) {
		this.unidadeProdutora = unidadeProdutora;
	}

	public Long getCertificadoUID() {
		return certificadoUID;
	}

	public void setCertificadoUID(Long certificadoUID) {
		this.certificadoUID = certificadoUID;
	}

	public Apolice() {
	}

	public Apolice(Long id) {
		this.certificadoUID = id;
	}


	@Override
	public String toString() {
		return " ";
	}

}
