package br.com.joalheriajoiasjoia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joalheriajoiasjoia.app.entities.CategoriaProduto;
import br.com.joalheriajoiasjoia.app.repositories.CategoriaProdutoRepository;

@Service
public class CategoriaProdutoService {

	@Autowired
	private CategoriaProdutoRepository categoriaProdutoRepository;

	public CategoriaProduto saveCategoriaProduto(CategoriaProduto categoriaProduto) {
		return categoriaProdutoRepository.save(categoriaProduto);
	}

	public List<CategoriaProduto> getAllCategoriaProduto() {
		return categoriaProdutoRepository.findAll();
	}

	public CategoriaProduto getCategoriaProdutoById(Long id) {
		return categoriaProdutoRepository.findById(id).orElse(null);
	}

	public void deleteCategoriaProduto(Long id) {
		categoriaProdutoRepository.deleteById(id);
	}
}
