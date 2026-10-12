package com.example.tp.entities;

public class Document {
	protected long numEnreg;
	protected String titre;
	protected String auteur;

	private static int comp = 0;

	// the constructor by using source

	public Document(String titre, String auteur) {

		this.numEnreg = ++comp;
		this.titre = titre;
		this.auteur = auteur;
	}
//  the getters by using source 

	public long getNumEnreg() {
		return numEnreg;
	}

	public String getTitre() {
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}
//  the setters by using source 

	public void setNumEnreg(long numEnreg) {
		this.numEnreg = numEnreg;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

//  la methode 
	public void afficher() {
		System.out.println(numEnreg + " - " + titre + " (" + auteur + ")");
	}

//  to string by using source 

	@Override
	public String toString() {
		return "Document [numEnreg=" + numEnreg + ", titre=" + titre + ", auteur=" + auteur + "]";
	}

}
