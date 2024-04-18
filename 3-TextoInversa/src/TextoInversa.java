import java.util.Scanner;

public class TextoInversa {
    public static void main(String[] args) throws Exception {

        String frase;
        Scanner scan = new Scanner(System.in);
        System.out.println("Indicame la frase que quieres darle la vuelta.");
        frase = scan.nextLine();

        for (int i = frase.length() - 1; i >= 0; i--) {
            System.out.print(frase.charAt(i));
        }

        System.out.println(" ");
        // System.out.println('\n')
        scan.close();
    }
}
