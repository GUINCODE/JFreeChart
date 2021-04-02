package com.guilab.service;

import java.util.ArrayList;

import com.guilab.dao.Application_DAO;
import com.guilab.domaine.Eleves;

public class Service {
	 Application_DAO DAO=new Application_DAO();
	 
	public ArrayList<Eleves> serviceAffiche(){
		 ArrayList<Eleves> list = DAO.recuperListEleve();
           return list;
	}
   
   public ArrayList<Double> lesMoyennes(){
	   ArrayList<Double> lesMoyennes =DAO.recuperMoyenne();
	   return lesMoyennes;
	   
   }
}
