import java.util.Random;

class Simulacion {

    static void simularViaje() {
            System.out.println("\n Inciando viaje... ");
            Random random = new Random ();
            boolean accidente= false;

            for (int i = 0; i <= 100; i += 20) {
                System.out.printf ("Progreso: %d%%\n", i);
                if (random.nextInt (100) < 15) {
                    accidente = true;
                    System.out.println ("Anomalía ...estamos procesando y solucionando el problema");

                }
                try { Thread.sleep(2000); } catch (InterruptedException e) {}
            }
            if (accidente){
                System.out.println("Llegaste a tu destino, pero estas herido y tu nave esta rota");
            } else {
                 System.out.println ("Has Llegado a tu Destino... felicitaciones!");
            }
           
    }

}
