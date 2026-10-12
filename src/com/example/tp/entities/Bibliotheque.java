package com.example.tp.entities;

public class Bibliotheque {
//  the attributes 
    private Document[] documents;
    private int nb;

//  the constructor by using source 
    public Bibliotheque(int capacite) {
        this.documents = new Document[capacite];
        this.nb = 0;
    }

//  la methode pour afficher tous les documents 
    public void afficherDocuments() {
        if (nb == 0) {
            System.out.println("La bibliotheque est vide.");
            return;
        }
        System.out.println("La bibliotheque contient " + nb + " document(s) :");
        for (int i = 0; i < nb; i++) {
            System.out.println("  - " + documents[i]);
        }
    }

//  la methode pour ajouter un document 
    public boolean ajouter(Document doc) {
        if (nb == documents.length) {
            System.out.println("Ajout impossible : bibliotheque pleine.");
            return false;
        }
        documents[nb++] = doc;
        return true;
    }

//  la methode pour supprimer un document 
    public boolean supprimer(Document doc) {
        for (int i = 0; i < nb; i++) {
            if (documents[i] == doc) {
                for (int j = i; j < nb - 1; j++) {
                    documents[j] = documents[j + 1];
                }
                documents[--nb] = null;
                return true;
            }
        }
        return false;
    }

//  la methode pour chercher un document par son numero 
    public Document document(int numEnrg) {
        for (int i = 0; i < nb; i++) {
            if (documents[i].getNumEnreg() == numEnrg) {
                return documents[i];
            }
        }
        return null;
    }

//  la methode pour afficher la liste des auteurs 
    public void afficherAuteurs() {
        System.out.println("Auteurs presents dans la bibliotheque :");
        for (int i = 0; i < nb; i++) {
            String a = documents[i].getAuteur();
            if (a != null && !a.isEmpty()) {
                System.out.println("  - " + a);
            }
        }
    }

//  the getters by using source 
    public int getNb() { return nb; }
    public int getCapacite() { return documents.length; }
}

