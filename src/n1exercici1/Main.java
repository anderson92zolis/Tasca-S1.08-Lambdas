 package n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		/*
		 * - Exercici 1 A partir d’una llista de Strings, escriu un mètode que retorna
		 * una llista de totes les cadenes que contenen la lletra ‘o’. Imprimeix el
		 * resultat.
		 * 
		 */

		ArrayList<String> llistaString = new ArrayList<String>(Arrays.asList("Volvo", "BMW", "Ford", "Mazda"));

		containO(llistaString).forEach(wordWithO -> {
			System.out.println("These are the words that contain 'o' :" + wordWithO);
		});

	}

	public static ArrayList<String> containO(ArrayList<String> llistaString) {

		ArrayList<String> containO = (ArrayList<String>) llistaString.stream()
				.filter(word -> word.toLowerCase().contains("o"))
				.collect(Collectors.toList());

		return containO;
	}

}
