package n1exercici8;

public class Main {

	public static void main(String[] args) {
		/*
		 * - Exercici 8 Crea una Functional Interface que contingui un mètode anomenat
		 * reverse(). Aquest mètode ha de rebre i ha de retornar un String. En el main()
		 * de la classe principal, injecta a la interfície creada mitjançant una lambda,
		 * el cos del mètode, de manera que torni la mateixa cadena que rep com a
		 * paràmetre però al revés. Invoca la instància de la interfície passant-li una
		 * cadena i comprova si el resultat és correcte.
		 */

		FuntionalInterface reverseString = word -> {
			StringBuilder stringSB = new StringBuilder(word);
			return stringSB.reverse().toString();
		};
		String wordToReverse = "KRAKEN";
		String reverseWord = reverseString.reverse(wordToReverse); // mediante el método reverse de la IntFunc.
		System.out.println("Using FuncInt:  " + reverseWord);

	}

	/*
	 * public static String reverse(String string) { return Stream.of(string)
	 * .map(word->new StringBuilder(word).reverse())
	 * .collect(Collectors.joining(" ")); }
	 */

}
