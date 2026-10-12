package com.example.tp;

public class Vehicule {

	private long id;
	protected String modele;

	private static int comp = 0;

//  the constructor by using source
	public Vehicule(String modele) {
		this.id = ++comp;
		this.modele = modele;
	}
//  the getters  by using source

	public long getId() {
		return id;
	}

//  toString by using source

	@Override
	public String toString() {
		return "Vehicule#" + id + " [" + modele + "]";
	}

}
