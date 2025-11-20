/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema002;

/**
 *
 * @author UTPL
 */
public class Problema002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero = 2;
        int valor_suma = 4;
        String mensaje = "";

        while (numero <= 110) {
            mensaje = String.format("%s\n%s", mensaje, numero);
        
            numero = numero + valor_suma;
            valor_suma = valor_suma + 2;

        }
        System.out.printf("%s\n", mensaje);
    }

}