package com.product.manager.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.manager.domain.Produto;
import com.product.manager.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Produto buscarProduto(Integer id) {
		Optional<Produto> obj = produtoRepository.findById(id);
		
		return obj.orElse(null);
	}
}
