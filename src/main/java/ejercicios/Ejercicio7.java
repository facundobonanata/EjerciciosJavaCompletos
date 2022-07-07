package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);
        int numero=0;
        do{
            System.out.print("Ingrese un numero: ");
             numero = Integer.parseInt(captura.nextLine());
        }while(numero <= 0);
            System.out.print("El numero es: " + numero);

        }

        }




