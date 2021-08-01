package com.jogo.lojagames.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jogo.lojagames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByControlesContainingIgnoreCase (String controles);
}
