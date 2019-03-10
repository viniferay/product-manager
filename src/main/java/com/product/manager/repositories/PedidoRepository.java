package com.product.manager.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.product.manager.domain.Pedido;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Integer>{

}
