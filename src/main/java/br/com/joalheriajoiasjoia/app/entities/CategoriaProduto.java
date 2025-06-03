package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_categoriaProduto")
public class CategoriaProduto {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategoria;

	@Column
	private String nomeCategoria;
	
	@Column
	private String descricaoCategoria;

	//Construtores
	public CategoriaProduto() {
		
	}
	
	public CategoriaProduto(Long id_categoria, String nome, String descricao) {
		this.idCategoria = id_categoria;
		this.nomeCategoria = nome;
		this.descricaoCategoria = descricao;
	}
	//Getters e Setters
	public Long getId_categoria() {
		return idCategoria;
	}

	public void setId_categoria(Long id_categoria) {
		this.idCategoria = id_categoria;
	}

	public String getNome() {
		return nomeCategoria;
	}

	public void setNome(String nome) {
		this.nomeCategoria = nome;
	}
	
	public String getDescricao() {
		return descricaoCategoria;
	}
	
	public void setDescricao(String descricao) {
		this.descricaoCategoria = descricao;
	}
	

}
