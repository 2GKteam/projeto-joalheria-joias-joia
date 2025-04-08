package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joalheriajoiasjoia.app.entities.Usuario;
import br.com.joalheriajoiasjoia.app.services.UsuarioService;

@RestController
<<<<<<< HEAD:src/main/java/br/com/joalheriajoiasjoia/app/controllers/UsuarioController.java
@RequestMapping("/usuarios")
=======
@RequestMapping("/cadastrousuario")
>>>>>>> 749d37c (backend completo):joalheriaJoiasJoia/src/main/java/br/com/joalheriajoiasjoia/app/controllers/UsuarioController.java
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping
	public Usuario createUsuario(@RequestBody Usuario usuario) {
		return usuarioService.saveUsuario(usuario);
	}

	@GetMapping
<<<<<<< HEAD:src/main/java/br/com/joalheriajoiasjoia/app/controllers/UsuarioController.java
	public List<Usuario> getAllUsuario() {
		return usuarioService.getAllUsuario();
=======
	public List<Usuario> getAllUsuarios() {
		return usuarioService.getAllUsuarios();
>>>>>>> 749d37c (backend completo):joalheriaJoiasJoia/src/main/java/br/com/joalheriajoiasjoia/app/controllers/UsuarioController.java
	}

	@GetMapping("/{id}")
	public Usuario getUsuario(@PathVariable Long id) {
		return usuarioService.getUsuarioById(id);
	}

	@GetMapping("/cpf/{cpf}")
	public ResponseEntity<Object> buscarUsuarioPorCpf(@PathVariable String cpf) {
		Usuario usuario = usuarioService.buscarUsuarioPorCpf(cpf);

		if (usuario != null) {
			return ResponseEntity.ok(usuario);
		} else {
			return ResponseEntity.status(404).body("Usuario com CPF " + cpf + "não foi encontrado");
		}
	}

	@PutMapping
	public Usuario editUsuario(@RequestBody Usuario usuario) {
		return usuarioService.saveUsuario(usuario);
	}

	@DeleteMapping("/{id}")
	public void deleteUsuario(@PathVariable Long id) {
		usuarioService.deleteUsuario(id);
	}

}
