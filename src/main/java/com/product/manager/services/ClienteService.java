package com.product.manager.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.manager.domain.Cliente;
import com.product.manager.repositories.ClientRepository;

import com.product.manager.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = clientRepository.findById(id);
			
		return obj.orElseThrow(() 
				-> new ObjectNotFoundException("Objeto não encontrado: "
						+ id + ", Tipo " 
						+ Cliente.class.getName())); 
	}

}
