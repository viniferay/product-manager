package com.product.manager.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.product.manager.domain.ItemPedido;

@Repository
public interface ItemPedidoRepository extends CrudRepository<ItemPedido, Integer>{

}
