package com.example.tp;

public class Moto extends Motorise {
	private double cylindree;

//  the constructor by using source

	public Moto(String modele, Moteur moteur, double niveauCarburant, double cylindree) {
		super(modele, moteur, niveauCarburant);
		this.cylindree = cylindree;
	}

// methode
	public void faireWheelie() {
		System.out.println(modele + " fait un wheelie ");
	}

//  toString  by using source
	@Override
	public String toString() {
		return super.toString() + " {Moto, cylindrée:" + cylindree + " cm³}";
	}
}
