package Ejercicio17;

public class Main {
    public static void main(String[] args) {

        Electrodomesticos listaElectrodomesticos[] = new Electrodomesticos[10];

        listaElectrodomesticos[0] = new Electrodomesticos(500, 80, 'A', "Verde");
        /*listaElectrodomesticos[1] = new Lavadora(150, 15);
        listaElectrodomesticos[2] = new Lavadora(20, 30, 'F', "Rojo");
        listaElectrodomesticos[3] = new Television(500, 50, 'B', "Azul", false);
        listaElectrodomesticos[4] = new Electrodomesticos(500, 100);
        listaElectrodomesticos[5] = new Lavadora(300, 80, 'D', "Rojo", 200);
        listaElectrodomesticos[6] = new Electrodomesticos(500, 100, 'A', "");
        listaElectrodomesticos[7] = new Television(100, 50, 'B', "Azul", true);*/


        double ElectrodomesticosSuma = 0;
        double TelevisoresSuma = 0;
        double LavadorasSuma = 0;

        for (int i = 0; i < listaElectrodomesticos.length; i++) {

            if (listaElectrodomesticos[i] instanceof Electrodomesticos) {
                ElectrodomesticosSuma += listaElectrodomesticos[i].precioFinal();

            }
            if (listaElectrodomesticos[i] instanceof Television) {
                TelevisoresSuma += listaElectrodomesticos[i].precioFinal();
            }
            if (listaElectrodomesticos[i] instanceof Lavadora) {
                LavadorasSuma += listaElectrodomesticos[i].precioFinal();
            }
        }
        System.out.println("La suma de los electrodocmesticos es de: " + ElectrodomesticosSuma);
        System.out.println("La suma de los televisores es de: " + TelevisoresSuma);

        System.out.println("La suma de las lavadoras es de: " + LavadorasSuma);

    }}