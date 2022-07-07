package Ejercicio17;

public class Television extends Electrodomesticos{

    //atributos

    private int resolucion;
    private boolean sintonizadorTDT;
    private final static int resolucionDEF=20;


    //constructor DEF

    public Television(){
        this.precioBase=precioBaseDEF;
        this.peso=pesoDEF;
        this.consumoEnergetico=consumoEnergeticoDEF;
        this.color=colorDEF;
        this.resolucion=resolucionDEF;
        this.sintonizadorTDT=false;

    }

    //2 parametros
    public Television(double precioBase, double peso, char b, String azul, boolean b1){
        this.precioBase=precioBase;
        this.peso=peso;
        this.consumoEnergetico=consumoEnergeticoDEF;
        this.color=colorDEF;
        this.resolucion=resolucionDEF;
        this.sintonizadorTDT=false;

    }

    //6 parametros

    public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }

    //metodos

    public int getResolucion(){
        return resolucion;
    }

    public boolean getSintonizadorTDT(){
        return sintonizadorTDT;
    }

    public double precioFinal(){
        double precio = super.precioFinal();
        if(getResolucion()>40){
            precio+=(precioBase*0.3);

        }
        if(getSintonizadorTDT()){
            precio+=50;
        }
        return precio;
    }





}
