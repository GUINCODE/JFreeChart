package com.guilab.domaine;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import com.guilab.service.Service_operation;




/**
 * @author geeb
 */
public class PieChart extends JFrame {
  private static final long serialVersionUID = 6294689542092367723L;

  public PieChart(String title) {
    super(title);

    // Create dataset
    PieDataset dataset = createDataset();

    // Create chart
    JFreeChart chart = ChartFactory.createPieChart(
        "Statistiques des moyennes des eleves ",
        dataset,
        true, 
        true,
        false);

    //Format Label
    PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator(
        "Eleves {0} : ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
    ((PiePlot) chart.getPlot()).setLabelGenerator(labelGenerator);
    
    // Create Panel
    ChartPanel panel = new ChartPanel(chart);
    setContentPane(panel);
  }

  private PieDataset createDataset() {
	  Service_operation opera=new Service_operation();
		double faible=opera.poucentageFaible();
		double moyen=opera.pourcentageMoyen();
		double bon=opera.poucentageBons();

    DefaultPieDataset dataset=new DefaultPieDataset();
    dataset.setValue("Faible[moin de 8]", faible);
    dataset.setValue("Moyen [>=8 et <14 ]", moyen);
    dataset.setValue("Bons [>=14]", bon);
   
    return dataset;
  }
}

  