package com.product.manager.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.manager.domain.Categoria;
import com.product.manager.repositories.CategoriaRepository;

@Service
public class CategoriasService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		
		return obj.orElse(null);
		
	}
}
