package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_ornamentoProduto")
public class OrnamentoProduto {

	// Atributos

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOrnamentoProduto;

	@Column
	private String nome;

	@Column
	private String tipo;

	@Column
	private String descricao;

	public OrnamentoProduto() {

	}

	public OrnamentoProduto(Long idOrnamentoProduto, String nome, String descricao) {
		this.idOrnamentoProduto = idOrnamentoProduto;
		this.nome = nome;
		this.descricao = descricao;
	}

	public Long getIdOrnamentoProduto() {
		return idOrnamentoProduto;
	}

	public void setIdOrnamentoProduto(Long idOrnamentoProduto) {
		this.idOrnamentoProduto = idOrnamentoProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
