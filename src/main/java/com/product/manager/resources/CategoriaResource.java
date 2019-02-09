package com.product.manager.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.manager.domain.Categoria;
import com.product.manager.services.CategoriasService;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {
	
	private CategoriasService categoriasService;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id){
		Categoria obj = categoriasService.buscar(id);
		return 	ResponseEntity.ok().body(obj);
		
	}
 }
