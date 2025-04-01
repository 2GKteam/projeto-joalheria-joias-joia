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
@Table(name = "tb_pedidoproduto")
public class PedidoProduto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPedidoProduto;
	
	@Column
	private int quantidade;
	
	@Column
	private Double precoUnitario;
	
	@ManyToOne
	@JoinColumn(name = "produto",nullable = false)
	private Produto produtoId;
	
	@ManyToOne
	@JoinColumn(name = "pedido",nullable = false)
	private Pedido pedidoId;

	public PedidoProduto() {
		
	}

	public PedidoProduto(Long idPedidoProduto, int quantidade, Double precoUnitario, Produto produtoId,
			Pedido pedidoId) {
		
		this.idPedidoProduto = idPedidoProduto;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
		this.produtoId = produtoId;
		this.pedidoId = pedidoId;
	}

	public Long getIdPedidoProduto() {
		return idPedidoProduto;
	}

	public void setIdPedidoProduto(Long idPedidoProduto) {
		this.idPedidoProduto = idPedidoProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public Produto getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(Produto produtoId) {
		this.produtoId = produtoId;
	}

	public Pedido getPedidoId() {
		return pedidoId;
	}

	public void setPedidoId(Pedido pedidoId) {
		this.pedidoId = pedidoId;
	}
	
	
	
	
	
}
