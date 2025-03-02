import java.util.Scanner;

class Viaje {
    static String [] planetas = {"Marte", "Júpiter", "Saturno"};
    static double [] distancias = {225, 778, 1430}; //Escala en Millones de Kilometros
    static double velocidad = 100000; // KM/H
    static double consumoCombustible = .5; //Litros por KM
    static double consumoOxigeno = 2; //Litros por Hora


    /**
     * Pide al usuario que seleccione un planeta de destino, y con esa elección,
     * calcula el viaje necesario para llegar a ese planeta.
     * @param scanner Scanner para leer la entrada del usuario.
     */ 

    static void seleccionarDestino (Scanner scanner) {
        System.out.println ("\nElige tu Planeta de Destino: ");
        for (int i = 0; i < planetas.length; i ++) {
            System.out.println((i + 1) + ". " + planetas [i] + " - " + distancias [i] + "Millones");

        }

        int eleccion = scanner.nextInt ();
        if (eleccion < 1 || eleccion > planetas.length) {
            System.out.println ("Selección no valida, ¡ingrese una opción correcta!");
            return;

        }

        calcularViaje (eleccion - 1);


    }

    static void calcularViaje(int indice) {
        double distanciaKm = distancias [indice] * 1_000_000;
        double tiempoHoras = distanciaKm / velocidad;
        double combustibleNecesario = distanciaKm * consumoCombustible;
        double oxigenoNecesario = tiempoHoras * consumoOxigeno;

        System.out.printf ("\nPlaneta Seleccionado: %s", planetas[indice]);
        System.out.printf ("\nDistancia: %.0f km", distanciaKm);
        System.out.printf ("\nTiempo Estimado: %.0f horas", tiempoHoras);
        System.out.printf("\nCombustible requerido: %.0f litros", combustibleNecesario);
        System.out.printf("\nOxígeno Requerdio: %.0f litros\n", oxigenoNecesario);

        Simulacion.simularViaje();
    }

}
