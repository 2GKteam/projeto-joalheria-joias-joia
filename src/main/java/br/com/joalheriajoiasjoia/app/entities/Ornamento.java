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

	@OneToMany(mappedBy = "ornamentoProduto")
	private List<Produto> produtos;

	public Ornamento() {

	}

	// Construtores

	public Ornamento(Long idOrnamento, String nome, String tipo, List<Produto> produtos) {
		super();
		this.idOrnamento = idOrnamento;
		this.nome = nome;
		this.tipo = tipo;
		this.produtos = produtos;
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

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
