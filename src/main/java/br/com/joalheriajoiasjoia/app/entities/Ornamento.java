package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbOrnamento")
public class Ornamento {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOrnamento;

	@Column
	private String nome;

	@Column
	private String tipo;

	public Ornamento() {

	}

	// Construtores
	public Ornamento(Long idOrnamento, String nome, String tipo) {
		this.idOrnamento = idOrnamento;
		this.nome = nome;
		this.tipo = tipo;
	}
	// Getters e Setters

	public Long getIdOrnamento() {
		return idOrnamento;
	}

	public void setIdOrnamento(Long idOrnamento) {
		this.idOrnamento = idOrnamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
