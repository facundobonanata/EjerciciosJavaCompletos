package Ejercicio17;

public class Electrodomesticos {


    //precio base, color, consumo energético (A-F) y peso.
    // Indican que se podrán heredar.
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;


    //constantes
    public static final double precioBaseDEF = 100;
    public static final String colorDEF = "blanco";
    public static final char consumoEnergeticoDEF = 'F';

    protected char tipoConsumoEnergetico[] = {'A', 'B', 'C', 'D', 'E', 'F'};

    public static final double pesoDEF = 5;

    protected String coloresDisponibles[] = {"blanco", "negro", "rojo", "azul", "gris"};

    //constructor defecto (no atributos en el parentesis)
    public Electrodomesticos() {
        this.precioBase = precioBaseDEF;
        this.color = colorDEF;
        this.consumoEnergetico = consumoEnergeticoDEF;
        this.peso = pesoDEF;
    }

    //constructor precio y peso

    public Electrodomesticos(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color=colorDEF;
        this.consumoEnergetico=consumoEnergeticoDEF;
    }

    //todos los atributos

    public Electrodomesticos(double precioBase, double peso,char consumoEnergetico , String color) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
    }

    //metodos get de todos los atributos

    public double getPrecioBase() {
        return precioBase;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }


    //comprobar consumoElectrico char letra

    private char comprobarConsumoEnergetico(char letra) {
        char consumo = consumoEnergeticoDEF;
        for (char cons : tipoConsumoEnergetico) {
            if (Character.toUpperCase(letra) == cons);
            consumo = Character.toUpperCase(letra);
        }
        return consumo;
    }
    //comprobarColor(String color)

    private void comprobarColor(String color) {
        boolean colorEnc = false;
        for (int i = 0; i < coloresDisponibles.length && !colorEnc; i++) {
            if (coloresDisponibles[i].equals(color)) {
                colorEnc = true;
            }
        }
        if (colorEnc) {
            this.color = color;
        } else {
            this.color = colorDEF;
        }
    }
    //precioFinal() según el consumo energético, aumentara su precio,
    // y según su tamaño, también.

    public double precioFinal(){
        double precio=0;
        switch (consumoEnergetico) {
            case 'A':
                precio += 100;
                break;
            case 'B':
                precio += 80;
                break;
            case 'C':
                precio += 60;
                break;
            case 'D':
                precio += 50;
                break;
            case 'E':
                precio += 30;
                break;
            case 'F':
                precio += 10;
                break;
        }
        if(peso>0 && peso<19) {
            precio += 10;
        }else if(peso>=20 && peso<49) {
            precio += 50;
        }else if(peso>=50 && peso <=79) {
            precio += 80;
        }else if(peso>=80){
            precio+=100;


        }
        return precioBase+precio;
    }



    }
