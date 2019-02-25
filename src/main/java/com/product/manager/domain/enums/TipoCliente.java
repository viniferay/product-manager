package com.product.manager.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA (1, "Pessoa Fisíca"),
	PESSOAJURIDICA (2, "Pessoa Juridica");
	
	private int id;
	private String descricao;
	
	private TipoCliente(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
		
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public static TipoCliente toEnum(Integer id) {
		
		if(id == null) {
			return null;
		}
		
		for (TipoCliente x : TipoCliente.values()) {
			if (id.equals(x.getId())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id invalido" + id);
	}

}
