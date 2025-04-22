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
	private String nome_tipo_produto;
	
	@Column
	private String descricao_produto;

	public TipoProduto() {

	}

	// Construtores
	public TipoProduto(Long id_tipoProduto, String nome, String descricao) {
		this.id_tipoProduto = id_tipoProduto;
		this.nome_tipo_produto = nome;
		this.descricao_produto = descricao;
	}

	// Getters e Setters
	public Long getId_tipoProduto() {
		return id_tipoProduto;
	}

	public void setId_tipoProduto(Long id_tipoProduto) {
		this.id_tipoProduto = id_tipoProduto;
	}

	public String getNome() {
		return nome_tipo_produto;
	}

	public void setNome(String nome) {
		this.nome_tipo_produto = nome;
	}

	public String getDescricao() {
		return descricao_produto;
	}

	public void setDescricao(String descricao) {
		this.descricao_produto = descricao;
	}
	

}
