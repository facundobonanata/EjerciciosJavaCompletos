package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(captura.nextLine());
        int iva = 21;
        double precio_final = precio + (precio * iva)/100;
        System.out.print("El precio final (iva incl.) es de: "+precio_final);

    }
}
