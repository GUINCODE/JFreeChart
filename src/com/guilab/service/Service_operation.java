package com.guilab.service;

import java.util.ArrayList;


public class Service_operation {
	
     Service service=new Service();
     ArrayList<Double> Listmoyennes =service.lesMoyennes();
     int nbrMoyenne  = Listmoyennes.size();
   
public double poucentageFaible() {
	int lesFaible = (int) Listmoyennes.stream()
	     .filter(m-> m< 8)
	     .count();
	//	calcul de pourcentage
	
	double pourcentageFaible= (double) lesFaible/nbrMoyenne * 100;
	System.out.println("Nombre d'elve faible:"+lesFaible+ ", soit: "+Math.round(pourcentageFaible)+"%");
   return pourcentageFaible;

}

public double pourcentageMoyen() {
	int  lesMoyens = (int) Listmoyennes.stream()
		     .filter(m-> m >= 8)
		     .filter(m-> m < 14)
		     .count();
//	calcul de pourcentage
	double pourcentageMoyen= (double) lesMoyens/nbrMoyenne * 100;
	System.out.println("Nombre d'elve Moyens:"+lesMoyens+ ", soit: "+Math.round(pourcentageMoyen)+"%");
	return pourcentageMoyen;
}

public double poucentageBons() {
	int  lesBons = (int) Listmoyennes.stream()
		     .filter(m-> m >= 14)
		     .count();
//	calcul de pourcentage
	double pourcentageBons=(double) lesBons/nbrMoyenne * 100;
	System.out.println("Nombre d'elve Bons:"+lesBons+ ", soit: "+Math.round(pourcentageBons)+"%");
	System.out.println("Nombre total d'elves: "+nbrMoyenne);

	return pourcentageBons;
}
}


