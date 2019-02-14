package com.product.manager.repositories;

import org.springframework.data.repository.CrudRepository;

import com.product.manager.domain.Categoria;

public interface  CategoriaRepository extends CrudRepository<Categoria, Integer>{
	
}
