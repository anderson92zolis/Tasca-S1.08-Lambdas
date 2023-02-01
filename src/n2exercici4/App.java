package n2exercici4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
	/*
	 *Crea una llista que contingui algunes cadenes de text i nombres.
	 *Ordena-les per:
	 *   	1)Alfabèticament pel primer caràcter. (Nota: charAt(0) retorna el codi numèric del primer  caràcter)
	 *      2)Les cadenes que contenen una "e" primer, la resta de cadenes després. Posa el codi directament a la lambda.
	 *      Modifica tots els elements de la llista que tenen una ‘a’. Modifica la ‘a’ per un ‘4’.
	 *      Mostra només els elements que són numèrics. (Encara que estiguin guardats com Strings).   

	 */
		
		ArrayList<String> arrayLTextNumbers= new ArrayList<String>(Arrays.asList("123","ander","sii","eva","ahora","333","ella","aeee"));
		
		//1) 
		System.out.println("1)Alfabèticament pel primer caràcter. (Nota: charAt(0) retorna el codi numèric del primer  caràcter)");
		sortFirstChar(arrayLTextNumbers);
		
		//2
		System.out.println("2)Les cadenes que contenen una \"e\" primer, la resta de cadenes després. Posa el codi directament a la lambda.");
		sortEFirstlaterString(arrayLTextNumbers);
	}
	
		public static void sortFirstChar(ArrayList<String>arrayLTextNumbers) {

			arrayLTextNumbers.stream()
			.sorted((firstString,secondString)-> firstString.charAt(0)-secondString.charAt(0))
			.forEach(System.out::println);
			
			}
		
		public static void sortEFirstlaterString(ArrayList<String>arrayLTextNumbers) {
			arrayLTextNumbers.stream()
			.sorted((firstString,secondString)-> firstString.contains("e") ? -1: secondString.contains("e") ? 1: 0 )
			.forEach(System.out::println);
			
			}

}
