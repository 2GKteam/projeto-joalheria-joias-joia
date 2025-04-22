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
	private Long id_categoria;

	@Column
	private String nome_categoria;
	
	@Column
	private String descricao_categoria;

	//Construtores
	public CategoriaProduto() {
		
	}
	
	public CategoriaProduto(Long id_categoria, String nome, String descricao) {
		this.id_categoria = id_categoria;
		this.nome_categoria = nome;
		this.descricao_categoria = descricao;
	}
	//Getters e Setters
	public Long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Long id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getNome() {
		return nome_categoria;
	}

	public void setNome(String nome) {
		this.nome_categoria = nome;
	}
	
	public String getDescricao() {
		return descricao_categoria;
	}
	
	public void setDescricao(String descricao) {
		this.descricao_categoria = descricao;
	}
	

}
