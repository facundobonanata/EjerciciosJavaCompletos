package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese un dia: ");
        String diaSemana = captura.nextLine();
        switch(diaSemana){
            case "Lunes": case "Martes": case "Miercoles": case "jueves": case "Viernes":
                System.out.println("Dia laboral");
                break;
            case "Sabado": case "Domingo":
                System.out.println("Dia no laboral");
                break;
            default:
                System.out.println("Dia invalido");
        }
    }
}
