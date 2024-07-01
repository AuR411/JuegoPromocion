package juego;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdivinaElNumero juego = new AdivinaElNumero();
        String opcion;

        do {
        	generarRenglonL();
            System.out.println("Menú de Opciones:");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            
            opcion = scanner.nextLine();

     
     switch (opcion) {
                case "1":
                    juego.jugar();
                    generarRenglonL();
                    break;
                case "2":
                	generarRenglonC();
                    System.out.println("Gracias por jugar, nos vemos en la proxima.");
                    break;
                default:
                	generarRenglonL();
                    System.out.println("Opción no valida.");
                    System.out.println("Intente de nuevo, gracias.");
            }
        } while (!opcion.equals("2"));

        scanner.close();
    }
    
    public static void generarRenglonL() {
		System.out.println("******************************\n");
		}
		
	public static void generarRenglonC() {
		System.out.println("***************\n");
		}
    
    
    
}




