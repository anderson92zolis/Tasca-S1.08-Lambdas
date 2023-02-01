package n3exercici1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		/*
		 * Exercici 1
		 * Crea una classe Alumne amb els atributs: Nom, edat, curs i nota.		 * 
		 * Omple una llista amb 10 alumnes 
		 * 1)Mostra per pantalla el nom i l’edat de cada alumne/a. 
		 * 2)Filtra la llista per tots els alumnes que el seu nom comença per ‘a’. Assigna a aquests alumnes a
		 *	 	una altra llista i mostra per pantalla la nova llista (tot amb lambdes).
		 * 3)Filtra i mostra per pantalla els alumnes que tenen una nota de 5 o superior.
		 * 4)Filtra i mostra per pantalla els alumnes que tenen un nota de 5 o més, i que
		 * 		no són de PHP. 
		 * 5)Mostra tots els alumnes que fan JAVA i són majors d’edat.
		 */

		ArrayList<Alumne> alumnes = new ArrayList<>();

		alumnes.add(new Alumne("KEVIN", 19, "JAVA", 9f));
		alumnes.add(new Alumne("ANDERSON", 19, "PYTHON", 9.10f));
		alumnes.add(new Alumne("MARTA", 13, "PHP", 8.0f));
		alumnes.add(new Alumne("DAVE", 55, "R", 7.0f));
		alumnes.add(new Alumne("CHRIS", 22, "PHP", 9.5f));
		alumnes.add(new Alumne("FRANK", 32, "MONGO", 5.5f));
		alumnes.add(new Alumne("ROYCE", 42, "REACT", 8.0f));
		alumnes.add(new Alumne("ROBERTO", 30, "EXCEL", 4.0f));
		alumnes.add(new Alumne("ISABELL", 23, "MATLAB", 4.0f));
		alumnes.add(new Alumne("ANDY", 21, "C++", 6.0f));
		
		System.out.println("1)Mostra per pantalla el nom i l’edat de cada alumne/a.");
		printNameEdad(alumnes);
		
		System.out.println("2)Filtra la llista per tots els alumnes que el seu nom comença per ‘a’. Assigna a aquests alumnes a una altra llista i mostra per pantalla la nova llista (tot amb lambdes).");
		for(Alumne alumne : startWithChartName(alumnes)) {
			System.out.println("\t Alumnes que el seu nom comença per ‘a’ : "+ alumne );
			};
		
		System.out.println("3)Filtra i mostra per pantalla els alumnes que tenen una nota de 5 o superior.");
		filterNotaOverEqualsFive(alumnes);
		
		System.out.println("4)Filtra i mostra per pantalla els alumnes que tenen un nota de 5 o més, i que no són de PHP.");
		filterNotaOverEqualsFiveNotPHPcourse(alumnes);
		
		System.out.println("5)Mostra tots els alumnes que fan JAVA i són majors d’edat.");
		filterByCourseJavaAndAdult(alumnes);

	}
	
		public static void printNameEdad(ArrayList<Alumne> alumnes) {
			alumnes.stream()
				.forEach(alumne->System.out.println("\t name . "+ alumne.getNom() +" age. "+ alumne.getEdat()));
		}
		
		public static List<Alumne> startWithChartName(ArrayList<Alumne> alumnes) {
			List<Alumne> filterNamesByA = alumnes.stream()
					.filter(alumne-> alumne.getNom().startsWith("A"))
					.collect(Collectors.toList());   			 // Arrays.asList(): convert Array to ArrayList
			return filterNamesByA;
		}
		
		public static void filterNotaOverEqualsFive(ArrayList<Alumne> alumnes) {
			alumnes.stream()
					.filter(alumne-> alumne.getNota()>= 5)
					.forEach(alumne-> System.out.println("\tnota de 5 o superior: " + alumne));
			
		}
		
		
		public static void filterNotaOverEqualsFiveNotPHPcourse(ArrayList<Alumne> alumnes) {
			alumnes.stream()
					.filter(alumne-> alumne.getNota()>= 5 && !alumne.getCurs().equals("PHP") )
					.forEach(alumne-> System.out.println("\tnota de 5 o superior  i que no són de PHP: " + alumne));
			
			}
		
		public static void filterByCourseJavaAndAdult(ArrayList<Alumne> alumnes) {
			alumnes.stream()
					.filter(alumne-> alumne.getCurs().equals("JAVA") && alumne.getEdat()>=18)
					.forEach(alumne-> System.out.println("\tfan JAVA i són majors d’edat: " + alumne));
			
			}

}
