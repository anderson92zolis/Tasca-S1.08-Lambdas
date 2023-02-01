package n1exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		/*
		 * - Exercici 2 Has de fer el mateix que en el punt anterior, però ara, el
		 * mètode ha de retornar una llista amb els Strings que a més de contenir la
		 * lletra ‘o’ també tenen més de 5 lletres. Imprimeix el resultat.
		 */

		ArrayList<String> llistaString = new ArrayList<String>(
				Arrays.asList("Volvo", "BMW", "Ford", "Mazda", "BMWoooooo"));

		containO(llistaString).forEach(wordWithO -> {
			System.out.println("These are the words that contain 'o' :" + wordWithO);
		});

	}

	public static ArrayList<String> containO(ArrayList<String> llistaString) {

		ArrayList<String> containO = (ArrayList<String>) llistaString.stream()
				.filter(word -> word.toLowerCase().contains("o") && word.length() > 5).collect(Collectors.toList());

		return containO;
	}

}
