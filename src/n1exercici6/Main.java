package n1exercici6;

import java.util.Arrays;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		/*
		 * - Exercici 6 Crea una llista amb nombres i cadenes de text i ordena la llista
		 * amb les cadenes de més curta a més llarga.
		 */

		List<String> myNumbers = Arrays.asList("2", "5", "si", "6", "7", "hol", "1", "que", "pasa");

		myNumbers.stream()
		.sorted((o1, o2) -> o1.length() - o2.length())
		.forEach(System.out::println);

	}
}
