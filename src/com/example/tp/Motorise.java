package com.example.tp;

public class Motorise extends Vehicule {
	protected Moteur moteur;
	protected double niveauCarburant;
	protected double kmTotal = 0;

//  the constructor by using source

	public Motorise(String modele, Moteur moteur, double niveauCarburant) {
		super(modele);
		this.moteur = moteur;
		this.niveauCarburant = niveauCarburant;
	}

//les methodes 
	public void demarrer() {
	    System.out.println(modele + " démarre avec "
	            + niveauCarburant + " unités, moteur " + moteur);
	    }

	public void rouler(double km) {
		double conso = km * 0.1;
		if (niveauCarburant >= conso) {
			niveauCarburant -= conso;
			kmTotal += km;
			System.out.println(modele + " a roulé " + km + " km,il  reste " + niveauCarburant + " unités");
		} else {
			System.out.println("Carburant insuffisant pour " + km + " km sur " + modele +
					" (reste : " + niveauCarburant + " unités)");
		}
	}

	public void refuel(double quantite) {
		niveauCarburant += quantite;
		System.out
				.println(modele + " ravitaillé de " + quantite + " unités (nouveau niveau : " + niveauCarburant + ")");
	}

	public double getKmTotal() {
		return kmTotal;
	}

	// toString by using source
	@Override
	public String toString() {
		return super.toString() + " {"
		        + moteur + ", carburant="
		        + String.format("%.1f", niveauCarburant) + "}";
	}
}
