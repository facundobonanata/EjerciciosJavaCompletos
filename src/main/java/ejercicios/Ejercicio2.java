package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);
        System.out.print("Ingrese el numero1: ");
        int numero1 = Integer.parseInt(captura.nextLine());
        System.out.print("Ingrese el numero2: ");
        int numero2 = Integer.parseInt(captura.nextLine());

        if(numero1 > numero2){
            System.out.print("El numero1 es mayor");
        }
        else if (numero1 < numero2){
            System.out.print("El numero 2 es mayor");

        }else{
            System.out.print("Son iguales");
        }



    }
}
