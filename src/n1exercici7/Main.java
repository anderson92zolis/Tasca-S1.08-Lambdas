package n1exercici7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {	
	/*
	 * - Exercici 6
	 * Crea una llista amb nombres i cadenes de text i ordena la llista amb les cadenes de 
	 * més curta a més llarga.
	 */
		
		List<String> myNumbers = Arrays.asList("1","2","A","BB","CCC","DDDD","1","FFFF","LLLLL");
		
		myNumbers.stream()
		.sorted((String o1,String o2)-> o2.length()-o1.length())
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
	}
}
