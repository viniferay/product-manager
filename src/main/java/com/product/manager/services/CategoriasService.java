package com.product.manager.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.manager.domain.Categoria;
import com.product.manager.repositories.CategoriaRepository;
import com.product.manager.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriasService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		
		//Trata execao em caso de categoria nao cadastrada.
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado: "+ id +", Tipo" + Categoria.class.getName()));
		
	}
	
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return categoriaRepository.save(obj);
	}
}
