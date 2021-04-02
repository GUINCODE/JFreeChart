package com.guilab.domaine;

public class Eleves {
private String nom;
private String prenom;
private double moyenne;
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public double getMoyenne() {
	return moyenne;
}
public void setMoyenne(double moyenne) {
	this.moyenne = moyenne;
}
public Eleves(String nom, String prenom, double moyenne) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.moyenne = moyenne;
}
@Override
public String toString() {
	return  nom + " " + prenom + " " + moyenne ;
}





}
