import java.util.Scanner;

public class AdivinaColor {
    public static void main(String[] args) throws Exception {

        String color = "amarillo";
        String colorElegido;
        boolean validar = false;
        Scanner scan = new Scanner(System.in);
        int contador = 0;

        while (!validar) {

            System.out.println("Indicame un color para comprobar si es el mismo que estoy pensando:");
            colorElegido = scan.nextLine().toLowerCase();
            contador++;
            if (colorElegido.equals(color)) {
                System.out.println("Enhorabuena! Estabamos pensando en el "+color+" has necesitado solo "+contador+" intentos.");
                validar=true;
            }
            else{
                System.out.println("Lo siento! Prueba otra vez a ver si aciertas.");
                System.out.println("---------------------------------------------------------------------------------------------");
            }

        }
        scan.close();
    }
}
