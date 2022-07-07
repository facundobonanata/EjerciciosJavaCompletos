package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        double radio = captura.nextInt();
        double area = Math.PI*Math.pow(radio, 2);
        System.out.print("el area del circulo es: "+area);

    }
}
