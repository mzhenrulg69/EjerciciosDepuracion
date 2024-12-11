package FactorialMLG;
import java.util.*;
public class FactorialMLG {

	public static void main(String[] args) { //TODO:realizar cambios//
		// TODO Auto-generated method stub
		 // Crear un escáner para leer la entrada del usuario
		 Scanner scanner = new Scanner(System.in);

		 // Pedir al usuario que ingrese un número
		 System.out.print("Introduce un número para calcular su factorial: ");
		 int number = scanner.nextInt();

		 // Calcular y mostrar el factorial
		 if (number < 0) {
		     System.out.println("El factorial no está definido para números negativos.");
		 } else {
		     long factorial = 1;
		     for (int i = 1; i <= number; i++) {
		         factorial *= i; // Multiplica acumulativamente
		         System.out.println("El factorial de " + i + " es: " + factorial);
		     }
		 }

		 // Cerrar el escáner
		       scanner.close();

	}

}
