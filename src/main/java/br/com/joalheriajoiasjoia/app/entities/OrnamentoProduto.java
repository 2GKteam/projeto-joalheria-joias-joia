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
<<<<<<< HEAD

	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_ornamento;
=======
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOrnamentoProduto;
>>>>>>> 7adea21 (mundança no controller do usuario melhoria no script de cadastro)
	
	@Column
	private String nome;
	
	@Column
<<<<<<< HEAD
	private String tipo;
	
	public OrnamentoProduto() {
		
	}

	//Construtores
	public OrnamentoProduto(Long id_ornamento, String nome, String tipo) {
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
	
	
=======
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
	
	

	
>>>>>>> 7adea21 (mundança no controller do usuario melhoria no script de cadastro)
}
