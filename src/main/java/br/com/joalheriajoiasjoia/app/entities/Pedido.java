package br.com.joalheriajoiasjoia.app.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPedido;
	
	@Column
	private LocalDateTime dataPedido;
	
	@Column
	private String status;
	
	@Column
	private Double total;
	
	@ManyToOne
	@JoinColumn(name = "UsuarioPedido",nullable = false)
	private Usuario usuarioId;
	@ManyToOne
	@JoinColumn(name = "PedidoEndereco",nullable = false)
	private Endereco enderecoId;
	
	public Pedido() {
		
	}
	public Pedido(Long idPedido, LocalDateTime dataPedido, String status, Double total, Usuario usuarioId,
			Endereco enderecoId) {
		this.idPedido = idPedido;
		this.dataPedido = dataPedido;
		this.status = status;
		this.total = total;
		this.usuarioId = usuarioId;
		this.enderecoId = enderecoId;
	}
	public Long getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}
	public LocalDateTime getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(LocalDateTime dataPedido) {
		this.dataPedido = dataPedido;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Usuario getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(Usuario usuarioId) {
		this.usuarioId = usuarioId;
	}
	public Endereco getEnderecoId() {
		return enderecoId;
	}
	public void setEnderecoId(Endereco enderecoId) {
		this.enderecoId = enderecoId;
	}
	
	
	
	
}
	
	
