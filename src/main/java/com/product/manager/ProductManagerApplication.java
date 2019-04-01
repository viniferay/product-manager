package com.product.manager;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.product.manager.domain.Categoria;
import com.product.manager.repositories.CategoriaRepository;

@SpringBootApplication
public class ProductManagerApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(ProductManagerApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Eletronicos");
		Categoria cat3 = new Categoria(null, "Casa, Mesa e Banho");
		Categoria cat4 = new Categoria(null, "Games");
		Categoria cat5 = new Categoria(null, "Higiene");
		Categoria cat6 = new Categoria(null, "Pets");
		Categoria cat7 = new Categoria(null, "Board Games");
		repo.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7));
	}

}

