package com.example.tp.entities;

public class Livre extends Document {
	// the attributes
	private String isbn;
	private int nbPages;

	// the constructor by using source
	public Livre(String titre, String auteur, String isbn, int nbPages) {
		super(titre, auteur);
		this.isbn = isbn;
		this.nbPages = nbPages;
	}

//  the getters by using source 
	public String getIsbn() {
		return isbn;
	}

	public int getNbPages() {
		return nbPages;
	}

//  to string by using source 
	@Override
	public String toString() {
		return super.toString() + " {Livre, isbn=" + isbn + ", pages=" + nbPages + "}";
	}
}
