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
@Table(name = "tbTipoProduto")
public class TipoProduto {
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTipoProduto;

	@Column
	private String nomeTipoProduto;

	@Column
	private String descricaoProduto;

	@OneToMany(mappedBy = "tipoProduto")
	private List<Produto> produtos;

	public TipoProduto() {

	}

	// Construtores

	public TipoProduto(Long idTipoProduto, String nomeTipoProduto, String descricaoProduto, List<Produto> produtos) {
		this.idTipoProduto = idTipoProduto;
		this.nomeTipoProduto = nomeTipoProduto;
		this.descricaoProduto = descricaoProduto;
		this.produtos = produtos;
	}

	public Long getIdTipoProduto() {
		return idTipoProduto;
	}

	public void setIdTipoProduto(Long idTipoProduto) {
		this.idTipoProduto = idTipoProduto;
	}

	public String getNomeTipoProduto() {
		return nomeTipoProduto;
	}

	public void setNomeTipoProduto(String nomeTipoProduto) {
		this.nomeTipoProduto = nomeTipoProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
