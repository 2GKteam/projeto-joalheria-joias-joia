package br.com.joalheriajoiasjoia.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.joalheriajoiasjoia.app.entities.CategoriaProduto;
import br.com.joalheriajoiasjoia.app.entities.Pedido;
@Repository
public interface CategoriaProdutoRepository extends JpaRepository<CategoriaProduto, Long> {

}
