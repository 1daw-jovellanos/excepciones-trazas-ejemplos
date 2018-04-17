package excepciones;

public class Ex01 {

    public void run() {
        System.out.print("A");
        try {
            int b = 0;
            int c = 3 / b; // Produce ArithmeticException al dividir por 0
            System.out.print("B"); // no se hace
        } catch (RuntimeException ex) { // Se captura aquí
            System.out.print("C");
        } finally {
            // El finally se hace siempre
            System.out.print("D");
        }
        // Como la excepción ha sido retirada por el catch, el método
        // continua
        System.out.print("E");
    }

    public static void main(String[] args) {
        new Ex01().run();
    }

}
