package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipoProduto")
public class TipoProduto {
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_tipoProduto;

	@Column
	private String nome;

	public TipoProduto() {

	}

	// Construtores
	public TipoProduto(Long id_tipoProduto, String nome) {
		this.id_tipoProduto = id_tipoProduto;
		this.nome = nome;
	}

	// Getters e Setters
	public Long getId_tipoProduto() {
		return id_tipoProduto;
	}

	public void setId_tipoProduto(Long id_tipoProduto) {
		this.id_tipoProduto = id_tipoProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
