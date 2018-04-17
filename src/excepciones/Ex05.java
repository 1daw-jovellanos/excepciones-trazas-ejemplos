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

public class Ex05 {

    public int badMethod() throws IOException{
        String s = "hola mundo";
        PrintWriter p = new PrintWriter(new FileWriter("prueba.txt"));
        p.println(s);
        p.close();
        return s.length() / (new java.util.Random().nextInt(100) + 11);
    }

    // sin pistas
    public void run() {
        System.out.print("A");
        try {
            
            int b = badMethod();
            System.out.print("B");
            int c = 3 / b;
            System.out.print("C");
        } catch (IOException ex) {
            System.out.print("D");
        } finally {
            System.out.print("E");
        }
        System.out.print("F");

    }

    public static void main(String[] args) {
        new Ex05().run();
    }

}
