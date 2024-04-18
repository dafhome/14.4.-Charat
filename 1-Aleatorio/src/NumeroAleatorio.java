import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) throws Exception {
        int numeroAleatorio;
        int num;
        int contador = 0;
        boolean validar = false;

        Scanner scan = new Scanner(System.in);

        while (!validar) {
            System.out.println("Introduce un número entre 1 y 5 a ver si aciertas el aleatorio :)");
            num = scan.nextInt();
            numeroAleatorio = (int) (Math.random() * 5 + 1);
            contador++;
            if (num == numeroAleatorio) {
                System.out.println("Enhorabuena! Has acertado, el número aleatorio era " + numeroAleatorio
                        + " y has usado " + contador + " intentos.");
                validar = true;
            } else {
                System.out.println("Ohhh! No has acertado, prueba otra vez.");
                System.out.println("--------------------------------------------------------------");
            }
        }
        scan.close();

    }
}