package com.example.tp;

public class Mammifere extends Animal {
	protected String couleurFourrure;

//    the constructor by using source 

	public Mammifere(String nom, int age, String couleurFourrure) {
		super(nom, age);
		this.couleurFourrure = couleurFourrure;
	}

//    la methode
	public void allaiter() {
		System.out.println(nom + " allaite ses petits.");
	}
//	 to String by using source 

	@Override
	public String toString() {
		return super.toString() + " {Mammifere, fourrure=" + couleurFourrure + "}";
	}

}
