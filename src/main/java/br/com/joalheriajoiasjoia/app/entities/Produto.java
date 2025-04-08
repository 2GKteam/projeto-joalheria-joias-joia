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
	private String nome;
	
	@Column
	private Double preco;
	
	@Column
	private String cor;
	
<<<<<<< HEAD:src/main/java/br/com/joalheriajoiasjoia/app/entities/Produto.java
	@Column
	private String imgUrl;
	
=======
>>>>>>> 648ba29 (alteração no beck end alteração de material para ornamento e tipo para tipoProduto):joalheriaJoiasJoia/src/main/java/br/com/joalheriajoiasjoia/app/entities/Produto.java
	@ManyToOne
	@JoinColumn(name = "categoriaProduto", nullable = false)
	private CategoriaProduto categoriaProduto;
	
	@ManyToOne
	@JoinColumn(name = "tipoProduto",nullable = false)
	private TipoProduto tipoProduto;
	
	public Produto() {
		
	}

	// Construtores
	public Produto(Long id_produto, String nome, Double preco, String cor, String imgUrl) {
		this.id_produto = id_produto;
		this.nome = nome;
		this.preco = preco;
		this.cor = cor;
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
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}
	
	

}
