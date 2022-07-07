package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);
        System.out.println("Escribe una frase: ");
        String frase = captura.nextLine();
        String frase2 = frase.replace(" ", "");
        System.out.println(frase2);
    }
}
