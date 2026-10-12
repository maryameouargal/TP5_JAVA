package com.example.tp.test;

import java.util.Scanner;

import com.example.tp.entities.Article;
import com.example.tp.entities.Bibliotheque;
import com.example.tp.entities.Document;
import com.example.tp.entities.Livre;
import com.example.tp.entities.Revue;

public class Test {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//      lire  depuis scanner 
        System.out.print("Donnez la capacite de la bibliotheque : ");
        int n = sc.nextInt();
        sc.nextLine();

        Bibliotheque biblio = new Bibliotheque(n);

//      initialiser  
        Livre l1 = new Livre("beautiful venom", "rina knet ", "978-2-07-040850-4", 96);
        Revue r1 = new Revue("Science & Vie", "Collectif", 6, 2024);
        biblio.ajouter(l1);
        biblio.ajouter(r1);

        System.out.println("Bibliotheque initialisee avec 2 documents.");

//      menu 
        int choix = -1;
        while (choix != 0) {
            System.out.println();
            System.out.println("MENU");
            System.out.println("1. Ajouter un document");
            System.out.println("2. Afficher tous les documents");
            System.out.println("3. Supprimer un document");
            System.out.println("4. Chercher un document par numero");
            System.out.println("5. Afficher les auteurs");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:
                    ajouterMenu(sc, biblio);
                    break;

                case 2:
                    biblio.afficherDocuments();
                    break;

                case 3:
                    System.out.print("Numero d'enregistrement a supprimer : ");
                    int numSup = sc.nextInt();
                    sc.nextLine();
                    Document d = biblio.document(numSup);
                    if (d == null) {
                        System.out.println("Aucun document avec ce numero.");
                    } else if (biblio.supprimer(d)) {
                        System.out.println("Document supprime : " + d);
                    } else {
                        System.out.println("Suppression impossible.");
                    }
                    break;

                case 4:
                    System.out.print("Numero d'enregistrement a chercher : ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    Document found = biblio.document(num);
                    if (found == null) {
                        System.out.println("Aucun document avec ce numero.");
                    } else {
                        System.out.println("Trouve : " + found);
                    }
                    break;

                case 5:
                    biblio.afficherAuteurs();
                    break;

                case 0:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide.");
            }
        }

        sc.close();
    }

//  sous-menu pour ajouter un document 
    private static void ajouterMenu(Scanner sc, Bibliotheque biblio) {
        System.out.println("Type de document :");
        System.out.println("1. Livre");
        System.out.println("2. Revue");
        System.out.println("3. Article");
        System.out.print("Votre choix : ");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.print("Titre : ");
        String titre = sc.nextLine();
        System.out.print("Auteur : ");
        String auteur = sc.nextLine();

        Document doc = null;

        switch (type) {
            case 1:
                System.out.print("ISBN : ");
                String isbn = sc.nextLine();
                System.out.print("Nombre de pages : ");
                int pages = sc.nextInt();
                sc.nextLine();
                doc = new Livre(titre, auteur, isbn, pages);
                break;

            case 2:
                System.out.print("Mois : ");
                int mois = sc.nextInt();
                System.out.print("Annee : ");
                int annee = sc.nextInt();
                sc.nextLine();
                doc = new Revue(titre, auteur, mois, annee);
                break;

            case 3:
                System.out.print("Journal : ");
                String journal = sc.nextLine();
                System.out.print("Volume : ");
                int volume = sc.nextInt();
                sc.nextLine();
                doc = new Article(titre, auteur, journal, volume);
                break;

            default:
                System.out.println("Type invalide.");
                return;
        }

        if (biblio.ajouter(doc)) {
            System.out.println("Document ajoute : " + doc);
        } else {
            System.out.println("Ajout impossible (bibliotheque pleine).");
        }
    }
}
