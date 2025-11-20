package problema001;

import java.util.Scanner;
import java.util.Locale;

public class Problema001 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String mensaje = "Listado de Jugadores\n";   
        String mensajeEdades = "Listado de Edades\n"; 

        String nombre;
        int edad;
        String posicion;
        double estatura;
        int contador = 1;
        int suma2 = 0;
        double suma3 = 0;
        int limite = 5;

        while (contador <= limite) {
            System.out.println("Ingrese nombre del jugador");
            nombre = entrada.nextLine();

            System.out.println("Ingrese su posición");
            posicion = entrada.nextLine();

            System.out.println("Ingrese su edad");
            edad = entrada.nextInt();

            System.out.println("Ingrese su estatura");
            estatura = entrada.nextDouble();

            entrada.nextLine(); 

            suma2 = suma2 + edad;
            suma3 = suma3 + estatura;

            
            mensaje = String.format("%s%d. %s -%s-, edad %d, estatura %.2f\n",
                    mensaje, 
                    contador, 
                    nombre, 
                    posicion, 
                    edad, 
                    estatura);

            mensajeEdades = String.format("%s%d\n", 
                    mensajeEdades, 
                    edad);

            contador = contador + 1;
        }

        double promedioEdades = suma2 / limite;
        double promedioEstaturas = suma3 / limite;

        System.out.printf("%s\n%s\nPromedio de edades: %.1f\nPromedio de "
                + "estaturas: %.2f\n",
                mensaje, 
                mensajeEdades, 
                promedioEdades, 
                promedioEstaturas);

      
    }
}
