package com.product.manager.services;

import java.util.Optional;


import org.springframework.stereotype.Service;

import com.product.manager.domain.Pedido;
import com.product.manager.repositories.PedidoRepository;
import com.product.manager.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	private PedidoRepository pedidoRepository;
	
	public Pedido find(Integer id){
		Optional<Pedido> obj = pedidoRepository.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado: "+ id +", Tipo" + Pedido.class.getName()));
		
	}
}
