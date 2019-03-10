package com.product.manager.domain.enums;

public enum EstadoPagamento {
	PENDENTE(1, "Pendente"),
	QUITADO(1, "Quitado"),
	CANCELADO(1, "Cancelado");
	
	private int id;
	private String estado;
	
	private EstadoPagamento(int id, String estado) {
		this.id = id;
		this.estado = estado;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public static EstadoPagamento toEnum(Integer id) {
		
		if(id == null) {
			return null;
		}
		
		for (EstadoPagamento x : EstadoPagamento.values()) {
			if (id.equals(x.getId())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id invalido" + id);
	}
}


