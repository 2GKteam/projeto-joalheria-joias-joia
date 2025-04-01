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
	private String nome;
	
	@Column
	private String desconto;

	//Construtores
	public CategoriaProduto() {
		
	}
	
	public CategoriaProduto(Long id_categoria, String nome, String desconto) {
		this.id_categoria = id_categoria;
		this.nome = nome;
		this.desconto = desconto;
	}
	//Getters e Setters
	public Long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Long id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDesconto() {
		return desconto;
	}
	
	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}
	

}
