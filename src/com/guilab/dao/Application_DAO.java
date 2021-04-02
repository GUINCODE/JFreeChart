package com.guilab.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.guilab.domaine.Eleves;

public class Application_DAO {
	
	///////////
	public ArrayList<Double> recuperMoyenne(){
		ArrayList<Double> lesMoyennes= new ArrayList<>();
		String url = "jdbc:mysql://localhost/bd_gestion_note";
		String login = "root";
		String psswrd = "";
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
      
		try {
			// Etape 1: chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			// Etape 2: recuperation de la connection
			cn = DriverManager.getConnection(url, login, psswrd);
			// Etape 3 creation du statement
			st = cn.createStatement();
			String sql="SELECT moyenne from eleve";
			rs=st.executeQuery(sql);
			while (rs.next()) {
		      double moyenne=rs.getDouble(1);
		     lesMoyennes.add(moyenne);
		    }
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return lesMoyennes;
	}
	public ArrayList<Eleves> recuperListEleve() {
		
		ArrayList<Eleves> eleveTrouver =new ArrayList<>();
	
		
		String url = "jdbc:mysql://localhost/bd_gestion_note";
		String login = "root";
		String psswrd = "";
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
      
		try {
			// Etape 1: chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			// Etape 2: recuperation de la connection
			cn = DriverManager.getConnection(url, login, psswrd);
			// Etape 3 creation du statement
			st = cn.createStatement();
			String sql="SELECT * from eleve";
			rs=st.executeQuery(sql);
			while (rs.next()) {
		      
		       String nom= rs.getString(2);
		       String prenom=rs.getString(3);
		       double moyenne=rs.getDouble(4);
		       Eleves eleves=new Eleves(nom, prenom, moyenne);
		       eleveTrouver.add(eleves);
		       
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return eleveTrouver;

	}

	
	
	////////////

}
