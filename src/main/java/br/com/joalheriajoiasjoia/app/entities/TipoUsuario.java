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
@Table(name = "tb_tipoUsuario")
public class TipoUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTipoUsuario;
	
	@Column
	private String nome_tipo_usuario;
	
	@ManyToOne
	@JoinColumn(name = "tipo_usuario", nullable = false)
	private TipoUsuario tipoUsuario;

	public TipoUsuario() {
		
	}
	
	public TipoUsuario(Long idTipoUsuario, String nome) {
		this.idTipoUsuario = idTipoUsuario;
		this.nome_tipo_usuario = nome;
	}

	public Long getIdTipoUsuario() {
		return idTipoUsuario;
	}

	public void setIdTipoUsuario(Long idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	public String getNome() {
		return nome_tipo_usuario;
	}

	public void setNome(String nome) {
		this.nome_tipo_usuario = nome;
	}
	
	
	
	
}
