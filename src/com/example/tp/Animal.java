package com.example.tp;

public class Animal {
	private long id;
	protected String nom;
	protected int age;

	private static int comp = 0;

//    the constructor by using source 
	public Animal(String nom, int age) {
		this.id = ++comp;
		this.nom = nom;
		this.age = age;
	}

//    the getters by using source 

	public long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public int getAge() {
		return age;
	}

//	les methodes 
	public void seDeplacer() {
		System.out.println(nom + " se déplace.");
	}
//	 to string by using source

	@Override
	public String toString() {
		return "Animal [id=" + id + ", nom=" + nom + ", age=" + age + "]";
	}

}
