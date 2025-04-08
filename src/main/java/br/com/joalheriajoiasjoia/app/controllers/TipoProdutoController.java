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

import br.com.joalheriajoiasjoia.app.entities.TipoProduto;
import br.com.joalheriajoiasjoia.app.services.TipoProdutoService;

@RestController
<<<<<<< HEAD:src/main/java/br/com/joalheriajoiasjoia/app/controllers/TipoProdutoController.java
@RequestMapping("/tipoproduto")
=======
@RequestMapping("/tipo")
>>>>>>> 648ba29 (alteração no beck end alteração de material para ornamento e tipo para tipoProduto):joalheriaJoiasJoia/src/main/java/br/com/joalheriajoiasjoia/app/controllers/TipoProdutoController.java
public class TipoProdutoController {

	@Autowired
	private TipoProdutoService tipoProdutoService;

	@PostMapping
	public TipoProduto createTipoProduto(@RequestBody TipoProduto tipoProduto) {
		return tipoProdutoService.saveTipoProduto(tipoProduto);
	}

	@GetMapping
	public List<TipoProduto> getAllTipoProduto() {
		return tipoProdutoService.getAlltipoProduto();
	}

	@GetMapping("/{id}")
	public TipoProduto getTipoProduto(@PathVariable Long id) {
		return tipoProdutoService.getTipoProdutoById(id);
	}

	@PutMapping
	public TipoProduto editTipoProduto(@RequestBody TipoProduto tipoProduto) {
		return tipoProdutoService.saveTipoProduto(tipoProduto);
	}

	@DeleteMapping("/{id}")
	public void deleteTipoProduto(@PathVariable Long id) {
		tipoProdutoService.deleteTipoProduto(id);
	}
}
