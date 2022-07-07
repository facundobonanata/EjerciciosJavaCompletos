package ejercicios;

import java.util.Scanner;

/*Crear un programa que pida un numero por teclado y que imprima por pantalla
los números desde el numero introducido hasta 1000 con saldos de 2 en 2.*/
public class Ejercicio14 {
    public static void main(String [] args){
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num =Integer.parseInt(captura.nextLine());
        int i = num;
        for (i=num; i<=1000; i+=2){
            System.out.println(i);
            }
        }

    }

