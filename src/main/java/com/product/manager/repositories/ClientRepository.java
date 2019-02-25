package com.product.manager.repositories;

import org.springframework.data.repository.CrudRepository;

import com.product.manager.domain.Cliente;

public interface ClientRepository extends CrudRepository<Cliente, Integer>{

}
