package Ejercicio16;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        System.out.println("Introducir nombre: ");
        String nombre = captura.nextLine();
        System.out.println("Introducir edad: ");
        int edad = captura.nextInt();
        System.out.println("Introducir sexo");
        char sexo = captura.next().charAt(0);
        System.out.println("introducir peso: ");
        double peso = captura.nextDouble();
        System.out.println("Introducir altura");
        int altura = captura.nextInt();

        //3 obj Persona
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona(); //establecer  (set)//

        persona3.setNombre("Fernando");
        persona3.setEdad(27);
        persona3.setSexo('H');
        persona3.setPeso(80);
        persona3.setAltura(182);

        persona2.setAltura(175);
        persona2.setPeso(70);

        System.out.println("Persona1 \n");
        System.out.println(persona1.toString());
        mayorDeEdad(persona1);
        mostrarPeso(persona1);

        System.out.println("Persona 2 \n");
        System.out.println("Ingrese nombre: ");
        System.out.println("Ingrese sexo: ");

        System.out.println("Ingrese edad: ");

        System.out.println(persona2.toString());
        mayorDeEdad(persona2);
        mostrarPeso(persona2);


        System.out.println("Persona3  \n");
        System.out.println(persona3.toString());
        mayorDeEdad(persona3);
        mostrarPeso(persona3);



//p metodos comprobar SEXO, edad y IMC//
    }

    /*public static void determSexo(Persona persona){
        char sexo = persona.determinarSexo();
*/

    public static void mayorDeEdad(Persona persona) {
        if (persona.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

    //mostrar el peso//
    public static void mostrarPeso(Persona persona){
        double IMC   = persona.calcularIMC();
        if (IMC == -1) {
            System.out.println("Esta delgado");
        } else if (IMC == 0) {
            System.out.println("Esta en su peso ideal");
        } else if (IMC == 1) {
            System.out.println("Tiene sobrepeso");
        }
    }
}



