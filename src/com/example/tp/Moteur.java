package com.example.tp;

public class Moteur {
	private String type;
	private int puissance;

//  the constructor by using source

	public Moteur(String type, int puissance) {
		super();
		this.type = type;
		this.puissance = puissance;
	}
//  toString by using source

	@Override
	public String toString() {
		  return type + " " + puissance + "ch";
	}

}
