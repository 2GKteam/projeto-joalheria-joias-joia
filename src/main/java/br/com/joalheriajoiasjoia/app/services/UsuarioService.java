package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.Usuario;
import br.com.joalheriajoiasjoia.app.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario saveUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	public List<Usuario> getAllUsuario() {
		return usuarioRepository.findAll();
	}

	public Usuario getUsuarioById(Long id) {
		return usuarioRepository.findById(id).orElse(null);
	}

	public Usuario buscarUsuarioPorCpf(String cpf) {
		return usuarioRepository.findByCpf(cpf);
	}

	public void deleteUsuario(Long id) {
		usuarioRepository.deleteById(id);
	}

	public Usuario autenticarPessoa(String email, String senha) {

		//
		Usuario pessoa = usuarioRepository.findByEmail(email);

		if (pessoa != null && pessoa.getSenha().equals(senha)) {
			return pessoa;
		} else {

			return null;
		}
	}
}
