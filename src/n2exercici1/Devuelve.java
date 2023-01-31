package n2exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Devuelve {

	public static void main(String[] args) {
	
	/*
	 * - Exercici 1
	 * Crea una llista de cadenes amb noms propis. 
	 * Escriu un mètode que retorna una llista de totes les cadenes que comencen amb la lletra 'A'
	 *  (majúscula) i  tenen exactament 3 lletres. Imprimeix el resultat.
	 */
		
		ArrayList<String> properNounsAList= new ArrayList<String>(Arrays.asList("Andy","Hector", "JUan","ANA"));
		
		devuelveBusqueda(properNounsAList).forEach(System.out::println);
		
		
	}
	
	public static ArrayList<String> devuelveBusqueda(ArrayList<String> properNounsAList){
		/*
		 * Return one ArrayList<String> with a result of: first letter igual a "A" y la longitud no mayor a 3
		 * {"Andy","Hector", "JUan","ANA"} -> ANA
		 */
		
		ArrayList<String> lookFirstAndThree= (ArrayList<String>) properNounsAList.stream()
		.filter(cadena-> cadena.startsWith("A") && cadena.length()==3)
		.collect(Collectors.toList());
		
		return lookFirstAndThree;
	}
}
