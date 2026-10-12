package com.example.tp;

public class Compte {

	protected int numero;
	protected double solde;

	private static int comp = 0;

//	THE CONSTRUCTORS BY USING SOURCE 
	public Compte( double soldeInitial) {
		this.numero = ++comp;
		this.solde = soldeInitial;
	}

	
//	THE GETTERS BY USING SOURCE 
	public int getNumero() {
		return numero;
	}

	public double getSolde() {
		return solde;
	}

	
//LES METHODES 
	public void deposer(double montant) {
		   if (montant > 0) {
	            solde += montant;
	            System.out.println("Compte #" + numero + " : dépôt de " + montant);
	        }

	}

	public void retirer(double montant) {
		 if (montant > 0 && solde >= montant) {
	            solde -= montant;
	            System.out.println("Compte #" + numero + " : retrait de " + montant);
	        } else {
	            System.out.println("Compte #" + numero + " : retrait impossible ( Votre solde est insuffisant)");
	        }
	}

//	pour afficher les detailes on peut utiliser tostring aussi 

	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + "]";
	}

}
