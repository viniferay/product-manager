package com.product.manager.repositories;

import org.springframework.data.repository.CrudRepository;

import com.product.manager.domain.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

}
