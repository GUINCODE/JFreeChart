package com.guilab.domaine;
	
//	package com.boraji.tutorial.jfreechart;

	import javax.swing.JFrame;


import org.jfree.chart.ChartFactory;
	import org.jfree.chart.ChartPanel;
	import org.jfree.chart.JFreeChart;
	import org.jfree.chart.plot.PlotOrientation;
	import org.jfree.data.category.CategoryDataset;
	import org.jfree.data.category.DefaultCategoryDataset;

import com.guilab.service.Service_operation;



	public class BarChart extends JFrame {

	  private static final long serialVersionUID = 1L;

	  public BarChart(String appTitle) {
	    super(appTitle);

	    // Create Dataset
	    CategoryDataset dataset = createDataset();
	    
	    //Create chart;
	    
	    JFreeChart chart=ChartFactory.createBarChart(
	        "Statisque des eleves", //Chart Title
	        "", // Category axis
	        "Moyennes en %", // Value axis
	        dataset,
	        PlotOrientation.VERTICAL,
	        true,true,true
	       );

	    ChartPanel panel=new ChartPanel(chart);
	    setContentPane(panel);
	  }

	  public CategoryDataset createDataset() {
		Service_operation opera=new Service_operation();
		double faible=opera.poucentageFaible();
		double moyen=opera.pourcentageMoyen();
		double bon=opera.poucentageBons();
		
	    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

	 
//	    dataset.setValue(Math.round(faible),"Faible(moyenne < 8)  ","eleves faible: "+Math.round(faible)+"%");
//	    dataset.setValue(Math.round(moyen),"moyen(moyenne >= 8 et < 14)  ","eleves moyens: "+Math.round(moyen)+"%");
//	    dataset.setValue(Math.round(bon),"Bons (moyenne >= 14 )  ","Bons eleves: "+Math.round(bon)+"%");

	    dataset.setValue(Math.round(faible),"Faibles("+Math.round(faible)+"%) ","");
	    dataset.setValue(Math.round(moyen),"Moyens("+Math.round(moyen)+"%) ","");
	    dataset.setValue(Math.round(bon),"Bons ("+Math.round(bon)+"%)","");

	    return dataset;
	  }

	 
	}


