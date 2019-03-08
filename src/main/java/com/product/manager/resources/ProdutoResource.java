package com.product.manager.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.product.manager.domain.Produto;
import com.product.manager.services.ProdutoService;

@Controller
@RequestMapping("/produtos")
public class ProdutoResource {

	@Autowired
	private ProdutoService produtoService;

	@GetMapping("/{id}")
	public ResponseEntity<?> fin(@PathVariable Integer id){
		Produto obj = produtoService.buscarProduto(id);

		return ResponseEntity.ok().body(obj);
	}
}
