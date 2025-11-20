/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema003;


public class Problema003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero = 2;
        int valor_suma = 3;
        String mensaje = "";
        while (numero <= 37) {
            mensaje = String.format("%s\n%d", mensaje, numero);
        
            numero = numero + valor_suma;
            valor_suma = valor_suma + 2;
            

        }
        System.out.printf("%s\n", mensaje);
    }
    }