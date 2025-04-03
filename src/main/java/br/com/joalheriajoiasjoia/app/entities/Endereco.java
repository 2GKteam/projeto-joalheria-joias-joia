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
@Table(name = "tb_endereco")
public class Endereco {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_endereco;

	@Column
	private String bairro;

	@Column
	private String rua;

	@Column
	private String cidade;

	@Column
	private String numeroCasa;

	@Column
	private String estado;

	@Column
	private String cep;

	@Column
	private String complemento;
	
	@ManyToOne
	@JoinColumn(name = "UsuarioEndereco",nullable = false)
	private Usuario usuarioId; 
	

	// Contrutores
	

}
