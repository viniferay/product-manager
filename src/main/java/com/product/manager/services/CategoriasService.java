package com.product.manager.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.product.manager.domain.Categoria;
import com.product.manager.repositories.CategoriaRepository;
import com.product.manager.services.exceptions.DataIntegrityException;
import com.product.manager.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriasService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		
		//Trata execao em caso de categoria nao cadastrada.
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado: "+ id +", Tipo" + Categoria.class.getName()));
		
	}
	
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		return categoriaRepository.save(obj);
	}
	
	public Categoria update(Categoria obj) {
		find(obj.getId());
		return categoriaRepository.save(obj);
	}
	
	public void delete(Integer id) {
		find(id);
		try {
			categoriaRepository.deleteById(id);
		}
		catch(DataIntegrityViolationException e){
			throw new DataIntegrityException("A categoria possuí produtos. Não é possivel excluir a categoria");
		}
	}
	
	public List<Categoria> findAll(){
		return categoriaRepository.findAll();
	}
	
	public Page<Categoria> findPage(Integer page, Integer linesPage, String orderBy, String direction){
		PageRequest pageRequest = new PageRequest(page, linesPage, Direction.valueOf(direction) , orderBy);
		return categoriaRepository.findAll(pageRequest);
	}
}
