package com.example.tp;

public class CompteEpargne extends Compte {

	protected double tauxInteret;

//	 constructor by using source 

	public CompteEpargne(double soldeInitial, double tauxInteret) {
		super(soldeInitial);
		this.tauxInteret = tauxInteret;
	}

//	 les methodes 
	public void appliquerInterets() {
		double interets = solde * tauxInteret / 100.0;
		solde += interets;
		System.out.println("CompteEpargne #" + getNumero() + " : intérêts de " + interets);
	}

//	afficher les details par toString 
	@Override
	public String toString() {
		return "CompteEpargne [tauxInteret=" + tauxInteret + " %" + ", numero=" + getNumero() + ", solde=" + solde
				+ "]";
	}

}
