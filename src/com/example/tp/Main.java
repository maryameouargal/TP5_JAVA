package com.example.tp;

public class Main {
	public static void main(String[] args) {
//	creer les comptes 
		Compte compte1 = new Compte(1000.0);
		CompteEpargne ce = new CompteEpargne(500.0, 3.0);
		CompteCourant cc = new CompteCourant(200.0, 300.0);

// 2. Opérations sur Compte de base
		System.out.println(compte1);
		compte1.deposer(200);
		compte1.retirer(1500);
		System.out.println(compte1);
		System.out.println();

		// 3. Opérations sur CompteEpargne
		System.out.println(ce);
		ce.appliquerInterets();
		System.out.println(ce);
		ce.retirer(100);
		System.out.println(ce);
		System.out.println();

		// 4. Opérations sur CompteCourant
		System.out.println(cc);
		cc.retirer(400);
		System.out.println(cc);
		cc.retirer(200);
		System.out.println(cc);
		System.out.println();

		// 5. Polymorphisme
		Compte poly = new CompteEpargne(100, 5);
		System.out.println(poly);

	}
}
