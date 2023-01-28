package n1exercici4;

import java.util.ArrayList;

public class Month {

	public static void main(String[] args) {
		/*
		 *Exercici 4
		 *Fer la mateixa impressió del punt anterior, però mitjançant method reference. 
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
		
		 
		
		MethodReference.printYearsMonths(ArrayMonth);
			
	}
	
	public class MethodReference {
		
		public static void printYearsMonths(ArrayList<String> ArrayMonth ) {
			
			ArrayMonth.forEach( 
					// Referring static method  
						System.out::println
						);
			}
	}

}
