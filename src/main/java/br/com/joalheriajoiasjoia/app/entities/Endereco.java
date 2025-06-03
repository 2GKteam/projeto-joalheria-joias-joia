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
	@Column(name = "id_endereco")
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
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario usuario;


	
	public Endereco() {
		
	}
	public Endereco(Long id_endereco, String bairro, String rua, String cidade, String numeroCasa, String cep, String complemento, String logadouro, String uf, Usuario usuario) {
		this.idEndereco = id_endereco;
		this.bairro = bairro;
		this.rua = rua;
		this.cidade = cidade;
		this.numeroCasa = numeroCasa;
		this.cep = cep;
		this.complemento = complemento;
		this.uf = uf;
		this.usuario = usuario;
	}
	public Long getId_endereco() {
		return idEndereco;
	}
	public void setId_endereco(Long id_endereco) {
		this.idEndereco = id_endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public Usuario getUsuario() {
	    return usuario;
	}

	public void setUsuario(Usuario usuario) {
	    this.usuario = usuario;
	}
}
