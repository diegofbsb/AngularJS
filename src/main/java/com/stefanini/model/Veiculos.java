package com.stefanini.model;
// Generated 07/11/2016 12:04:56 by Hibernate Tools 4.3.1.Final

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Veiculos generated by hbm2java
 */
@Entity
@Table(name = "veiculos", catalog = "hackaton")
public class Veiculos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String placa;
	
	@ManyToOne
	@JoinColumn(name = "PROP_ID")
	private Proprietario proprietario;
	
	@OneToOne
	@JoinColumn(name = "MOD_ID")
	private Modelo modelo;
	private String uf;

	public Veiculos() {
	}

	public Veiculos(String placa, Proprietario cpfProprietario, Modelo idModelo, String uf) {
		this.placa = placa;
		this.proprietario = cpfProprietario;
		this.modelo = idModelo;
		this.uf = uf;
	}

	@Id

	@Column(name = "placa", unique = true, nullable = false, length = 7)
	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	@Column(name = "uf", nullable = false, length = 2)
	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
