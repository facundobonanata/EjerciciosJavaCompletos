package Ejercicio18;

public class Videojuegos implements Entregable {

    //atributos
    protected String titulo;
    protected int horasEstimadas;
    protected boolean entregado;
    protected String genero;
    protected String compania;

    private final static int horasEstimadasDEF=10;
    private final static boolean entregadoDEF = false;

    public final static int mayor=1;
    public final static int menor=-1;
    public final static int igual=0;

    //const defecto
    public Videojuegos(){
        this.titulo=titulo;
        this.horasEstimadas=horasEstimadasDEF;
        this.entregado=entregadoDEF;
        this.genero=genero;
        this.compania = compania;
    }

    //titulo y horas
    public Videojuegos(String titulo, int horasEstimadas){
        this.titulo=titulo;
        this.horasEstimadas=horasEstimadas;
        this.entregado=entregadoDEF;
        this.genero=genero;
        this.compania=compania;
    }

    //todos los atr excp entregado

    public Videojuegos(String titulo, int horasEstimadas, String genero, String compania){
        this.titulo=titulo;
        this.horasEstimadas=horasEstimadas;
        this.genero=genero;
        this.compania=compania;
        this.entregado=entregadoDEF;
    }

    public String getTitulo(){
        return titulo;
    }
    public int getHorasEstimadas(){
        return horasEstimadas;
    }
    public String getGenero(){
        return genero;
    }
    public String getCompania(){
        return compania;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setHorasEstimadas(int horasEstimadas){
        this.horasEstimadas=horasEstimadas;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public void setCompania(String compania){
        this.compania=compania;
    }



    @Override
    public boolean entregar() {
        return true;
    }

    @Override
    public boolean devolver() {
        return false;
    }

    @Override
    public boolean isEntregado() {
        if (entregar()) {
            return true;
        }
        return false;
    }

    @Override
    public int compareTo(Object a) {
        Videojuegos videoJs = (Videojuegos)a;
        if(horasEstimadas> videoJs.getHorasEstimadas()){
            return 1;
        }else if (horasEstimadas == videoJs.getHorasEstimadas()){
        return 0;
    }
        return -1;
}
    public String toString(){
        return " Videojuegos:  \n" +
                "Titulo: " + titulo + "\n" +
                "Horas estimadas: " + horasEstimadas + "\n" +
                "Genero: " + genero +"\n" +
                "Compañia: " + compania +"\n";
    }
}
