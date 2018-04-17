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
import java.io.*;

public class Ex04 {

    /**
     * Este método ejecuta ordenes "peligrosas", que lanzan excepciones y además
     * son de tipo <strong>unchecked</strong>, pero no
     * las intenta capturar con un catch... así que debe declararlas con la cláusula
     * <code>throws</code> en la signatura.
     * @throws IOException 
     */
    public void badMethod() throws IOException {
        // Hacemos que se presente la excepción con un nombre de fichero no válido.
        PrintWriter p = new PrintWriter(new FileWriter("****prueba"));
        p.println("Hola mundo");
        p.close();
    }

    public void run() {
        System.out.print("A");
        try {
            badMethod();   // produce excepción
            System.out.print("B");
        } catch (IOException ex) {
            System.out.print("C"); // la capturamos
        } finally {
            System.out.print("D"); // el finally se ejecuta siempre
        }
        System.out.print("E"); // el método sigue porque la excepción ha sido capturada

    }

    public static void main(String[] args) {
        new Ex04().run();
    }

}
