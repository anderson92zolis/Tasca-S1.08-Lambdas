package n1exercici3;

import java.util.ArrayList;

public class Month {

	public static void main(String[] args) {
		/*
		 * Exercici 3
		 * Crea una llista amb els noms dels mesos de l’any. Imprimeix tots els elements
		 * de la llista amb una lambda.
		 */
		
		
		ArrayList<String> ArrayMonth= new ArrayList<String>();
		
		ArrayMonth.add("January");
		ArrayMonth.add("February");
		ArrayMonth.add("March");
		ArrayMonth.add("April");
		ArrayMonth.add("May");
		ArrayMonth.add("Jun");
		ArrayMonth.add("July");
		ArrayMonth.add("August");
		ArrayMonth.add("September");
		ArrayMonth.add("October");
		ArrayMonth.add("November");
		ArrayMonth.add("December");
		
		ArrayMonth.forEach(month-> {
			System.out.println("Months of the year: " +month);
			});
		

	}

}
