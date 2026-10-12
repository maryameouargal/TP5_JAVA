package com.example.tp;

public class Voiture extends Motorise {
	private int nbPortes;

//  the constructor by using source

	public Voiture(String modele, Moteur moteur, double niveauCarburant, int nbPortes) {
		super(modele, moteur, niveauCarburant);
		this.nbPortes = nbPortes;
	}

//	methode
	public void klaxonner() {
		System.out.println(modele + " klaxonne : « Pouet ! »");
	}

//  toString by using source
	@Override
	public String toString() {
		return super.toString() + " {Voiture, portes=" + nbPortes + "}";
	}
}
