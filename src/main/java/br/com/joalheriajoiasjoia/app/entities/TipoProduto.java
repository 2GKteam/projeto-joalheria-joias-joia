package br.com.joalheriajoiasjoia.app.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
	
	@OneToMany(mappedBy = "tipoProduto")
	private List<Produto> produtos;
	
	public TipoProduto() {

	}

	// Construtores
	
	public TipoProduto(Long id_tipoProduto, String nome_tipo_produto, String descricao_produto,
			List<Produto> produtos) {
		this.id_tipoProduto = id_tipoProduto;
		this.nome_tipo_produto = nome_tipo_produto;
		this.descricao_produto = descricao_produto;
		this.produtos = produtos;
	}

	// Getters e Setters
	public Long getId_tipoProduto() {
		return id_tipoProduto;
	}

	public void setId_tipoProduto(Long id_tipoProduto) {
		this.id_tipoProduto = id_tipoProduto;
	}

	public String getNome_tipo_produto() {
		return nome_tipo_produto;
	}

	public void setNome_tipo_produto(String nome_tipo_produto) {
		this.nome_tipo_produto = nome_tipo_produto;
	}

	public String getDescricao_produto() {
		return descricao_produto;
	}

	public void setDescricao_produto(String descricao_produto) {
		this.descricao_produto = descricao_produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
}
