package n1exercici5;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Crea una Functional Interface amb un mètode anomenat getPiValue() que ha de retornar un double. Des del main() de la classe principal, instància la interfície i assigna-li el valor 3.1415. Invoca el mètode getPiValue() i imprimeix el resultat.
		 */
	
		FuntionalInterface myInterfacePi = () ->3.1415;
		
		System.out.println(myInterfacePi.getPiValue());
		
		
	}

}
