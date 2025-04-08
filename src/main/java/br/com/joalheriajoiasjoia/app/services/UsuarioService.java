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
	
	public Usuario saveUsuario( Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
<<<<<<< HEAD:src/main/java/br/com/joalheriajoiasjoia/app/services/UsuarioService.java
	public List<Usuario> getAllUsuario(){
=======
	public List<Usuario> getAllUsuarios(){
>>>>>>> 749d37c (backend completo):joalheriaJoiasJoia/src/main/java/br/com/joalheriajoiasjoia/app/services/UsuarioService.java
		return usuarioRepository.findAll();
	}
	
	public Usuario getUsuarioById (Long id) {
		return usuarioRepository.findById(id).orElse(null);
	}
	
	 public Usuario buscarUsuarioPorCpf(String cpf) {
	    	return usuarioRepository.findByCpf(cpf);
	    }
	
	public void deleteUsuario(Long id) {
		usuarioRepository.deleteById(id);
	}


}
