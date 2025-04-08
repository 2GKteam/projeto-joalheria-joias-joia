package br.com.joalheriajoiasjoia.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import br.com.joalheriajoiasjoia.app.entities.Ornamento;
=======
>>>>>>> 7adea21 (mundança no controller do usuario melhoria no script de cadastro)
import br.com.joalheriajoiasjoia.app.entities.OrnamentoProduto;
import br.com.joalheriajoiasjoia.app.services.OrnamentoProdutoService;

@RestController
<<<<<<< HEAD
@RequestMapping("/ornamentoProduto")
public class OrnamentoProdutoController {

=======
@RequestMapping("/ornamentoproduto")
public class OrnamentoProdutoController {
	
>>>>>>> 7adea21 (mundança no controller do usuario melhoria no script de cadastro)
	@Autowired
	private OrnamentoProdutoService ornamentoProdutoService;

	@PostMapping
	public OrnamentoProduto createOrnamentoProduto(@RequestBody OrnamentoProduto ornamentoProduto) {
		return ornamentoProdutoService.saveOrnamentoProduto(ornamentoProduto);
	}

	@GetMapping
	public List<OrnamentoProduto> getAllOrnamentoProduto() {
		return ornamentoProdutoService.getAllOrnamentoProduto();
	}

	@GetMapping("/{id}")
	public OrnamentoProduto getOrnamentoProduto(@PathVariable Long id) {
		return ornamentoProdutoService.getOrnamentoProdutoById(id);
	}

	@PutMapping
	public OrnamentoProduto editOrnamentoProduto(@RequestBody OrnamentoProduto ornamentoProduto) {
		return ornamentoProdutoService.saveOrnamentoProduto(ornamentoProduto);
	}

	@DeleteMapping("/{id}")
	public void deleteOrnamentoProduto(@PathVariable Long id) {
		ornamentoProdutoService.deleteOrnamentoProduto(id);
	}
<<<<<<< HEAD
=======

>>>>>>> 7adea21 (mundança no controller do usuario melhoria no script de cadastro)
}
