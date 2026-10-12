package com.example.tp.entities;

public class Revue extends Document {
//  the attributes 
	private int mois;
	private int annee;

//  the constructor by using source 
	public Revue(String titre, String auteur, int mois, int annee) {
		super(titre, auteur);
		this.mois = mois;
		this.annee = annee;
	}

//  the getters by using source 
	public int getMois() {
		return mois;
	}

	public int getAnnee() {
		return annee;
	}

//  to string by using source 
	@Override
	public String toString() {
		return super.toString() + " {Revue, mois=" + mois + ", annee=" + annee + "}";
	}
}
