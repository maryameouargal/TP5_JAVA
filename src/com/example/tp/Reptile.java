package com.example.tp;

public class Reptile extends Animal {
	private String typeEcailles;

//  the constructor by using source 
	public Reptile(String nom, int age, String typeEcailles) {
		super(nom, age);
		this.typeEcailles = typeEcailles;
	}

// methode 
	public void seChauffer() {
		System.out.println(nom + " se chauffe au soleil.");
	}
//  to string  by using source 

	@Override
	public String toString() {
		return super.toString() +
		           " {Reptile, écailles=" + typeEcailles + "}";
	}
	
}
