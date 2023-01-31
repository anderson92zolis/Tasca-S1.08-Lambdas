package n2exercici3;

public class App {
	
	public static void main(String[] args) {
		
	/*
	 * - Exercici 3
	 * Crea una Functional Interface que contingui un mètode anomenat operacio(). 
	 * Aquest mètode ha de retornar un float. Injecta a la interfície creada mitjançant una lambda, 
	 * el cos del mètode, de manera que es pugui transformar l’operació amb una suma, una resta, 
	 * una multiplicació i una divisió.
	 */
	
		MathInterface addition= (number1,number2)-> number1+number2;
		MathInterface subtract= (number1,number2)-> number1-number2;
		MathInterface multiply= (number1,number2)-> number1*number2;
		MathInterface division= (number1,number2)-> number1/number2;
		
		operationMethod(1,5.12f,addition,"addition");
		operationMethod(12.1f,-1,subtract,"subtract");
		operationMethod(100.12f,3,multiply,"multiply");
		operationMethod(56,2.33f,division,"division");
	
	}
	
	public static void operationMethod(float number1,float number2, MathInterface operation, String nameOperacion) {
		float result =  operation.operacio(number1,number2) ;
		System.out.printf(nameOperacion+" : %.3f\n",result);
		}

	

	
	
	
}
