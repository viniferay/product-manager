package com.product.manager.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.manager.domain.Pedido;
import com.product.manager.services.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoResource {

	private PedidoService pedidoService;
	
	public ResponseEntity<?> buscar(Integer id){
		Pedido obj = pedidoService.buscar(id);
		
		return ResponseEntity.ok().body(obj);
	}
}
