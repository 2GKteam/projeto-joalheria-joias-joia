package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_ornamento")
public class Ornamento {

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_ornamento;
	
	@Column
	private String nome;
	
	@Column
	private String tipo;
	
	public Ornamento() {
		
	}

	//Construtores
	public Ornamento(Long id_ornamento, String nome, String tipo) {
		this.id_ornamento = id_ornamento;
		this.nome = nome;
		this.tipo = tipo;
	}
	//Getters e Setters
	public Long getId_ornamento() {
		return id_ornamento;
	}

	public void setId_ornamento(Long id_ornamento) {
		this.id_ornamento = id_ornamento;
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
