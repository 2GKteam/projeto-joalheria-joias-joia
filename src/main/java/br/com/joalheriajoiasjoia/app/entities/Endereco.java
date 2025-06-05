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
@Table(name = "tbEndereco")
public class Endereco {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idEndereco")
	private Long idEndereco;

	@Column
	private String bairro;

	@Column
	private String rua;

	@Column
	private String cidade;

	@Column
	private String numeroCasa;

	@Column
	private String cep;

	@Column
	private String complemento;
	
	@Column
	private String uf;
	
	@ManyToOne
	@JoinColumn(name = "usuarioId", nullable = false)
	private Usuario usuario;


	
	public Endereco() {
		
	}
	public Endereco(Long idEndereco, String bairro, String rua, String cidade, String numeroCasa, String cep, String complemento, String logadouro, String uf, Usuario usuario) {
		this.idEndereco = idEndereco;
		this.bairro = bairro;
		this.rua = rua;
		this.cidade = cidade;
		this.numeroCasa = numeroCasa;
		this.cep = cep;
		this.complemento = complemento;
		this.uf = uf;
		this.usuario = usuario;
	}
	
}
