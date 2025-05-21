package adriangonzalez;

import java.util.Scanner;

public class AdrianGonzalez {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        System.out.println("Buenos días Ceinmark, soy Marta Gómez");
        System.out.print("Introduce un número para averiguar si es primo o no: ");
        int numero = entrada.nextInt();
        
        boolean esPrimo = true;
        System.out.print("Los divisores del número son: ");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
                if (i != 1 && i != numero) {
                    esPrimo = false;
                }
            }
        }
        System.out.println();
        if (esPrimo) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }

	}
}
