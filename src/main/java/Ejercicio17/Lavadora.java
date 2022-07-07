package Ejercicio17;

public class Lavadora extends Electrodomesticos {

    //atributos

    private int carga;
    private final static int cargaDEF=5;

    //constructor DEF
    public Lavadora(int i, int i1, char f, String rojo){
        this.precioBase=precioBaseDEF;
        this.peso=pesoDEF;
        this.consumoEnergetico=consumoEnergeticoDEF;
        this.color=colorDEF;
        this.carga=cargaDEF;

    }

    //constructo 2 parametros


    public Lavadora(double precioBase, double peso){
        this.precioBase=precioBase;
        this.peso=peso;
        this.consumoEnergetico=consumoEnergeticoDEF;
        this.color=colorDEF;
        this.carga=cargaDEF;
    }

    //todos los parametros

    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
        super(precioBase, peso, consumoEnergetico,color);
        this.carga=carga;
    }

    //metodos get
    public int getCarga(){
        return carga;
    }

    public double precioFinal(){
        double precio = super.precioFinal();
        if(carga>30){
            precio+=50;
        }
        return precio;
    }
}
