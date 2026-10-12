package com.example.tp.entities;

public class Article extends Document {
//  the attributes 
	private String journal;
	private int volume;

//  the constructor by using source 
	public Article(String titre, String auteur, String journal, int volume) {
		super(titre, auteur);
		this.journal = journal;
		this.volume = volume;
	}

//  the getters by using source 
	public String getJournal() {
		return journal;
	}

	public int getVolume() {
		return volume;
	}

//  to string by using source 
	@Override
	public String toString() {
		return super.toString() + " {Article, journal=" + journal + ", volume=" + volume + "}";
	}
}
