package com.example.tp;

public class CompteCourant extends Compte {
	protected double decouvertAutorise;

//	the constructors by using source 
	public CompteCourant(double soldeInitial, double decouvertAutorise) {
		super(soldeInitial);
		this.decouvertAutorise = decouvertAutorise;
	} 

// les methodes 
	
	@Override
    public void retirer(double montant) {
        if (montant > 0 && solde + decouvertAutorise >= montant) {
            solde -= montant;
            System.out.println("CompteCourant #" + getNumero()
                + " : retrait de " + montant);
        } else {
            System.out.println("CompteCourant #" + getNumero()
                + " : retrait impossible (découvert max dépassé)");
        }
    }

//	afficher les details par source 
	@Override
	public String toString() {
		return "CompteCourant [decouvertAutorise=" + decouvertAutorise + ", numero=" +  getNumero() + ", solde=" + solde
				+ "]";
	}

	
	
	
	

}
