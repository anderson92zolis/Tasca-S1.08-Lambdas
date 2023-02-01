package n2exercici4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		/*
		 * Crea una llista que contingui algunes cadenes de text i nombres. Ordena-les
		 * per: 1)Alfabèticament pel primer caràcter. (Nota: charAt(0) retorna el codi
		 * numèric del primer caràcter) 2)Les cadenes que contenen una "e" primer, la
		 * resta de cadenes després. Posa el codi directament a la lambda. 3)Modifica
		 * tots els elements de la llista que tenen una ‘a’. Modifica la ‘a’ per un ‘4’.
		 * 4)Mostra només els elements que són numèrics. (Encara que estiguin guardats
		 * com Strings).
		 * 
		 */

		ArrayList<String> arrayLTextNumbers = new ArrayList<String>(
				Arrays.asList("123", "ander", "sii", "eva", "ahora", "33", "ella", "aeee", "barcelona", "3"));

		// 1)
		System.out.println(
				"1)Alfabèticament pel primer caràcter. (Nota: charAt(0) retorna el codi numèric del primer  caràcter)");
		sortFirstChar(arrayLTextNumbers);

		// 2)
		System.out.println(
				"2)Les cadenes que contenen una \"e\" primer, la resta de cadenes després. Posa el codi directament a la lambda.");
		sortEFirstlaterString(arrayLTextNumbers);

		// 3)
		System.out
				.println("3) Modifica tots els elements de la llista que tenen una ‘a’. Modifica la ‘a’ per un ‘4’. ");
		modifyA4(arrayLTextNumbers);

		// 4)
		System.out
				.println("4)Mostra només els elements que són numèrics. (Encara que estiguin guardats com Strings). ");
		showNumberOnly(arrayLTextNumbers);
	}

	public static void sortFirstChar(ArrayList<String> arrayLTextNumbers) {

		arrayLTextNumbers.stream()
			.sorted((firstString, secondString) -> firstString.charAt(0) - secondString.charAt(0))
			.forEach(System.out::println);

	}

	public static void sortEFirstlaterString(ArrayList<String> arrayLTextNumbers) {
		arrayLTextNumbers.stream()
		.sorted()
		.sorted((firstString, secondString) -> firstString.contains("e") ? -1 : secondString.contains("e") ? 1 : 0)
		.forEach(System.out::println);

	}

	public static void modifyA4(ArrayList<String> arrayLTextNumbers) {
		arrayLTextNumbers.stream()
		.sorted()
		.map(firstString -> firstString.contains("a") ? firstString.replace('a', '4'): firstString.contains("A") ? firstString.replace('A', '4') : firstString)
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}

	public static void showNumberOnly(ArrayList<String> arrayLTextNumbers) {
		arrayLTextNumbers.stream()
		.sorted()
		.filter(firstString -> firstString.matches("^[0-9]*$")) // return the Integer																					// values
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}

}
