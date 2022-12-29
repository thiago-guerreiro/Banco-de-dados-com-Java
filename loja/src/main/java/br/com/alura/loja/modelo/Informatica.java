package br.com.alura.loja.modelo;

import javax.persistence.Entity;

@Entity
public class Informatica {
	
	private String marca;
	private Integer modelo;

	public Informatica(String marca, Integer modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public Informatica() {
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getModelo() {
		return modelo;
	}

	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}

}
