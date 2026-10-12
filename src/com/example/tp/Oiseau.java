package com.example.tp;

public class Oiseau extends Animal {
	protected double envergure;

//  the constructor by using source 
	public Oiseau(String nom, int age, double envergure) {
		super(nom, age);
		this.envergure = envergure;
	}

//     methode 
	public void voler() {
		System.out.println(nom + " s'envole avec une envergure de " + envergure + " m.");
	}

//    to String  by using source 
	@Override
	public String toString() {
		return super.toString() + " {Oiseau, envergure=" + envergure + "}";
	}

}
