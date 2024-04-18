import java.util.Scanner;

public class AnalizarTextCase {
    public static void main(String[] args) throws Exception {

        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Indicame una frase y te diré si está en mayusculas o minusculas.");
        String frase = scan.nextLine();

        int mayuscula = 0;
        int minuscula = 0;
        int espacios = 0;
        
        for (int i = 0; i<frase.length();i++){
            if ((Character.isUpperCase(frase.charAt(i)))) {
                mayuscula++;
            }
            else if (' ' == (frase.charAt(i))) {
                espacios++;
            }
            else{
                minuscula++;
            }
        }
        if ((mayuscula+espacios)==frase.length()) {
            System.out.println("Tu frase está toda en mayusculas.");
        }
        else if ((minuscula+espacios)==frase.length()){
            System.out.println("Tu frase está toda en minúsculas.");
        }
        else{
            System.out.println("Tu frase contiene caracteres en mayúsculas y minúsculas.");
        }
        scan.close();
    }
}
