package com.example.tp;

public class Camion extends Motorise {
	private double capaciteCharge;

//  the constructor by using source

	public Camion(String modele, Moteur moteur, double niveauCarburant, double capaciteCharge) {
		super(modele, moteur, niveauCarburant);
		this.capaciteCharge = capaciteCharge;
	}

//    methode 
	public void charger(double poids) {
		System.out.println(modele + " charge " + poids + " t (max " + capaciteCharge + " t)");
	}

//  toSring by using source
	@Override
	public String toString() {
		return super.toString() + " {Camion, cap=" + capaciteCharge + " t}";
	}
}
