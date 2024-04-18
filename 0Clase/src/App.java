public class App {
    public static void main(String[] args) throws Exception {
        String frase = "Por fin Juernes!";
        System.out.println(frase);
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        System.out.println(frase.replaceAll(" ", ""));
        System.out.println(frase.replaceAll("p", "u"));

        // charAT() te muestra valor del caracter en el indice
        // char miLetra = 'A';

        System.out.println(frase.charAt(4));
        for (int i = 0; i < frase.length(); i++) {
            System.out.println("en la posición " + (i + 1) + " se encuentra la letra " + frase.charAt(i));
        }
        for (int i = 0; i < frase.length(); i++) {
            System.out.print(frase.charAt(i));
        }

    }
}
