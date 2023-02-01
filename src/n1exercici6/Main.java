package n1exercici6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		/*
		 * - Exercici 6 Crea una llista amb nombres i cadenes de text i ordena la llista
		 * amb les cadenes de més curta a més llarga.
		 */

		List<String> myNumbers = Arrays.asList("2", "5", "si", "6", "7", "hol", "1", "que", "pasa");

		myNumbers.stream().sorted((String o1, String o2) -> o1.length() - o2.length()).collect(Collectors.toList())
				.forEach(System.out::println);

	}
}
