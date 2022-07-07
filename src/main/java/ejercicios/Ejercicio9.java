package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String frase2 = frase.replace("a", "e");
        System.out.println("Escribe una frase: ");
        String fraseUser = captura.nextLine();
        System.out.println(frase2 + " " + fraseUser);
    }
}
