/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema004;

public class Problema004 {

 
    public static void main(String[] args) {

        int denominador = 1;
        int signo = 1;
        double incremento = 0;
        int limite = 15;
        String mensaje = "";

        while (denominador <= limite) {
            double termino = signo * (1.0 / denominador);
            incremento = incremento + termino;

            if (signo == 1 && denominador == 1) {
                mensaje = String.format("%s1", mensaje);
            } else if (signo == 1) {
                mensaje = String.format("%s + 1/%d", mensaje, denominador);
            } else {
                mensaje = String.format("%s - 1/%d", mensaje, denominador);
            }

            signo = signo * -1;
            denominador = denominador + 2;
        }

        System.out.printf("%s\n", mensaje);
        System.out.printf("Resultado = %.6f\n", incremento);
    }
}
