import java.util.Scanner;

public class SimuladorV {

    public static void main (String [] args) {
            Scanner scanner = new Scanner (System.in);
            int opcion;

            do {
                Menu.mostrarMenu();
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1: Viaje.seleccionarDestino(scanner); break;

                    case 2 : System.out.println("Saliendo..."); break;

                    default: System.out.println("Opción no Válida, intente de nuevo");
                                break;
                    
                }
            } while (opcion != 2);
                scanner.close();


    }



}
