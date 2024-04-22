import java.util.Scanner;

public class LimpiarTelefono {
    public static void main(String[] args) throws Exception {

        String phone;
        Scanner scan = new Scanner(System.in);
        String phone2 = "";

        System.out.println("Indicame tu teléfono, da igual el formato porque yo te lo convierto.");
        phone = scan.nextLine();

        for (int i = 0; i<phone.length();i++){

            if (Character.isDigit(phone.charAt(i))) {
                phone2 += phone.charAt(i);
            }

        }
        // System.out.println(" ");
        if (phone2.length()!=9) {
            System.out.println("Creo que esto no es un teléfono, indicalo nuevamente. Me sale el número:");
        }
        else{
            System.out.println("Tu telefono es:");
        }
        
        System.out.println(phone2);
        scan.close();
    }
}
