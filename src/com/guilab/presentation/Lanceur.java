package com.guilab.presentation;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import com.guilab.domaine.BarChart;
import com.guilab.domaine.PieChart;





public class Lanceur {

	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		// TODO Auto-generated method stub
			
		System.out.println("-------------------------------------------------");
		System.out.println("affichage en kamamber ou en histogramme");
          
            System.out.println( "Pour Kamember Taper  : K " );
            System.out.println( "Pour Histogramme Taper  : H " );
            Scanner scanner = new Scanner( System.in );
            String  a = scanner.nextLine();		
      if(a.equals("K")) {   
    	System.out.println("\t affichage de Kamaber.....");
 	  SwingUtilities.invokeLater(() -> {
 		    PieChart example = new PieChart("ENSISCOLARITE");
    	      example.setSize(800, 400);
    	      example.setLocationRelativeTo(null);
    	      example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    	      example.setVisible(true);
    	    });
      }   
      
      else  if(a.equals("H")) { 
    	  System.out.println("\t \t Affichage de Histogramme en cours ....");
    	  SwingUtilities.invokeAndWait(()->{
    	      BarChart example=new BarChart("ENSISCOLARITE");
    	      example.setSize(600, 300);
    	      example.setLocationRelativeTo(null);
    	      example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    	      example.setVisible(true);
    	    });
    	  
      
      }
      
      else 
    	  System.err.println("bad request");
      
	}

	   
	

}
