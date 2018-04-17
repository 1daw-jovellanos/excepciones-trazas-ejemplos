/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author victor.fernandez
 */
public class Ex02 {

    public void run() {
        System.out.print("A");
        try {
            int b = 0;
            int c = 3 / b; // produce ArithmeticException 
            System.out.print("B");
        } catch (IllegalArgumentException ex) { // los catch no la capturan
            System.out.print("C");
        } finally { 
            // el finally se hace siempre
            System.out.print("D");
        }
        // En esta linea, la excepción no ha sido capturada, así que
        // este método se interrumpe aqui, y la excepción se propaga al método
        // que ha invocado a este (el main en este caso)
        System.out.print("E");
        
    }

    public static void main(String[] args) {
        new Ex02().run();
    }

}
