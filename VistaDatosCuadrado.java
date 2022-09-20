import java.util.Scanner;

public class VistaDatosCuadrado {

    public static double pideLado() {
        //Scanner entrada = new Scanner(System.in); // <--- Al pasarle el Scanner al try(){ }catch(){ } se declara, inicializa y cierra automaticamente
        String ent;
        double lado = 0;
        boolean textIN = false;
        

        do {

            try (Scanner entrada = new Scanner(System.in)) {

                do {

                    System.out.println("¿Cual es la medida del lado?");
                    ent = entrada.nextLine();
                    try {
                        lado = Double.parseDouble(ent);
                    } catch (Exception e) {
                        lado = 0;
                        System.out.println("===> Debes escribir un NUMERO <===");
                    }

                    if( lado < 0) {
                        System.out.println("Debes escribir un numero decimal ===>POSITIVO<===");
                    }

                } while (lado <= 0);
                
            } catch (Exception e) {
                textIN = true;
            }

        } while (textIN == true);
        
        return lado;


        /* // Este codigo tiene un error de bucle infinito
        Scanner entrada = new Scanner(System.in);
        do {

            try {
                System.out.println("Cual es la medida del lado");
                lado = entrada.nextDouble();
            } catch (Exception e) {
                System.out.println("Lo que escribiste no es valido");
            }
            if (lado < 0) {
                System.out.println("Debes escribir un numero decimal ===>POSITIVO<===");
            }
            
        } while (lado < 0);
        */
        
        //entrada.close(); //<--- Si se cierra es scanner entra en un bucle infinito si no le das un numero.
    }

}
