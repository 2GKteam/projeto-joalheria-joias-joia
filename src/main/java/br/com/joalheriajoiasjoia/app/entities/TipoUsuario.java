package br.com.joalheriajoiasjoia.app.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD:src/main/java/br/com/joalheriajoiasjoia/app/entities/TipoUsuario.java
<<<<<<< HEAD:src/main/java/br/com/joalheriajoiasjoia/app/entities/TipoUsuario.java
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
=======
>>>>>>> 749d37c (backend completo):joalheriaJoiasJoia/src/main/java/br/com/joalheriajoiasjoia/app/entities/TipoUsuario.java
=======
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
>>>>>>> 648ba29 (alteração no beck end alteração de material para ornamento e tipo para tipoProduto):joalheriaJoiasJoia/src/main/java/br/com/joalheriajoiasjoia/app/entities/TipoUsuario.java
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tipoUsuario")
public class TipoUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTipoUsuario;
	
	@Column
	private String nome;
<<<<<<< HEAD:src/main/java/br/com/joalheriajoiasjoia/app/entities/TipoUsuario.java
<<<<<<< HEAD:src/main/java/br/com/joalheriajoiasjoia/app/entities/TipoUsuario.java
=======
>>>>>>> 648ba29 (alteração no beck end alteração de material para ornamento e tipo para tipoProduto):joalheriaJoiasJoia/src/main/java/br/com/joalheriajoiasjoia/app/entities/TipoUsuario.java
	
	@ManyToOne
	@JoinColumn(name = "tipo_usario", nullable = false)
	private TipoUsuario tipoUsuario;
<<<<<<< HEAD:src/main/java/br/com/joalheriajoiasjoia/app/entities/TipoUsuario.java
=======
>>>>>>> 749d37c (backend completo):joalheriaJoiasJoia/src/main/java/br/com/joalheriajoiasjoia/app/entities/TipoUsuario.java
=======
>>>>>>> 648ba29 (alteração no beck end alteração de material para ornamento e tipo para tipoProduto):joalheriaJoiasJoia/src/main/java/br/com/joalheriajoiasjoia/app/entities/TipoUsuario.java

	public TipoUsuario() {
		
	}
	
	public TipoUsuario(Long idTipoUsuario, String nome) {
		this.idTipoUsuario = idTipoUsuario;
		this.nome = nome;
	}

	public Long getIdTipoUsuario() {
		return idTipoUsuario;
	}

	public void setIdTipoUsuario(Long idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
