package n2exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
	/*
	 * - Exercici 2
	 * Programa un mètode que retorna una cadena separada per comes, basada en una llista d’Integers. 
	 * Cada element ha d’anar precedit per lletra “e” si el nombre és parell, o per la lletra “o” si el nombre 
	 * és imparell. Per exemple, si la llista d’entrada és (3, 55, 44), la sortida ha de ser “o3, o55, e44”. 
	 * Imprimeix el resultat.
	 */
	
		ArrayList<Integer> numbersAlist= new ArrayList<Integer>(Arrays.asList(1,5,2,100,69));
		
		System.out.println((devuelveBusqueda(numbersAlist)));
		
	}
	
	public static String devuelveBusqueda(ArrayList<Integer> numbersAlist){
		/*
		 * Return one String with a result of: "e" (if number is even) or "o" (if number is odd) more that number of the Arryalist
		 * {1,2,3,,4} -> "o1, e2, 03, e4"
		 */
		
		String evenOdd= numbersAlist.stream()
		.map(number -> (number % 2 ==0 ? "e" + number : "o" + number))
		.collect(Collectors.joining(", "));
	
		return evenOdd;
	}
	
	
	
}
