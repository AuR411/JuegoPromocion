package juego;

import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {

    private int numeroAdivinar;
    private final int intentosMaximos = 3;
    private Random random;
    private Scanner scanner;

    public AdivinaElNumero() {
        this.random = new Random();
        this.scanner = new Scanner(System.in);
    }

    public void jugar() {
        this.numeroAdivinar = random.nextInt(10) + 1; 
        generarRenglonL();
        System.out.println("Bienvenido al juego de adivinar el numero");
        System.out.println("Tenes " + intentosMaximos + " intentos para adivinar un numero entre  1 y 10.");

        boolean adivinado = false;

        for (int i = 1; i <= intentosMaximos; i++) {
        	 	generarRenglonC();
            System.out.println("Intento " + i );
            System.out.println("Ingresa un número: ");
            int intento = scanner.nextInt();

            if (intento < numeroAdivinar) {
            	generarRenglonC();
                System.out.println("Demasiado bajo.");
            } else if (intento > numeroAdivinar) {
            	generarRenglonC();
                System.out.println("Demasiado alto.");
            } else {
                System.out.println("Muy bien!!! Has adivinado el numero.");
                adivinado = true;
                break;
            }
        }

        if (!adivinado) {
        	generarRenglonL();
            System.out.println("Terminaron tus intentos.");
            System.out.println("EL numero era: " + "*"+ numeroAdivinar+ "*");
        }
    }
    
    public static void generarRenglonL() {
		System.out.println("******************************\n");
		}
    
    public static void generarRenglonC() {
		System.out.println("***************\n");
		}
    
    
}


