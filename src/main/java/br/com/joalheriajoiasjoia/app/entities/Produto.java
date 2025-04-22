package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_produto;
	
	@Column
	private String nomeProduto;
	
	@Column
	private Double precoProduto;
	
	@Column
	private String descricaoProduto;
	
	@Column
	private String imgUrl;
	
	@ManyToOne
	@JoinColumn(name = "categoriaProduto", nullable = false)
	private CategoriaProduto categoriaProduto;
	
	@ManyToOne
	@JoinColumn(name = "tipoProduto",nullable = false)
	private TipoProduto tipoProduto;
	
	public Produto() {
		
	}

	// Construtores
	public Produto(Long id_produto, String nomeProduto, Double precoProduto, String descricaoProduto, String imgUrl) {
		this.id_produto = id_produto;
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.descricaoProduto = descricaoProduto;
		this.imgUrl = imgUrl;
	}
	// Getters e Setters
	public Long getId_produto() {
		return id_produto;
	}

	public void setId_produto(Long id_produto) {
		this.id_produto = id_produto;
	}

	public String getNome() {
		return nomeProduto;
	}

	public void setNome(String nome) {
		this.nomeProduto = nome;
	}

	public Double getPreco() {
		return precoProduto;
	}

	public void setPreco(Double preco) {
		this.precoProduto = preco;
	}

	public String getCor() {
		return descricaoProduto;
	}

	public void setCor(String cor) {
		this.descricaoProduto = cor;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}
	
	

}
