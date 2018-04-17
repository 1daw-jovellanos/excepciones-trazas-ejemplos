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
public class Ex03 {

    /**
     * Éste método lanza una excepcion IllegalArgumentException si el parámetro
     * es negativo
     */
    public int badMethod(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        return i * i;
    }

    public void run() {
        System.out.print("A");
        try {
            int b = -3;
            int c = badMethod(b); // pasamos un négativo y el metodo lanza IllegalArgumentException
            System.out.print("B"); // Esta línea ya no se hace

        } catch (IllegalArgumentException ex) {
            // Se hace este catch, porque aunque los dos concuerdan con la excepción
            // se evaluan en orden.
            System.out.print("C");
        } catch (Exception ex) {
            // Este no se hace porque es más general que el anterior, y el anterior
            // también encaja con la excepcion.
            System.out.print("D");
        } finally {
            System.out.print("E");
        }
        // Se continúa con normalidad, porque en esta línea la excepción ha sido
        // capturada.
        System.out.print("F");

    }

    public static void main(String[] args) {
        new Ex03().run();
    }

}
