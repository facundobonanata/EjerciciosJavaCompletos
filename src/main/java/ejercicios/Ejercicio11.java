package ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args){
        int a=0;
        int e=0;
        int i=0;
        int o=0;
        int u=0;
        Scanner captura = new Scanner (System.in);
        System.out.println("Ingrese una frase: ");
        String frase = captura.nextLine();
        int largo = frase.length();
        for (int x =0; x<largo; x++){
            char frase1 = frase.charAt(x);
            switch (frase1){
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("El tamaño de la frase es de " + largo + " caracteres y posee " + (a+e+i+o+u) + " vocales");
    }

}

