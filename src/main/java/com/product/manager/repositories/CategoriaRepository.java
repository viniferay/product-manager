package com.product.manager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.product.manager.domain.Categoria;

public interface  CategoriaRepository extends JpaRepository<Categoria, Integer>{
	
}
