package Ejercicio18;

public class Serie implements Entregable{

    protected String titulo;
    protected int numeroDeTemporadas;
    protected boolean entregado;
    protected String genero;
    protected String creador;

    public static final int numeroDeTemporadasDEF=3;
    public static final boolean entregadoDEF=false;

    public final static int mayor=1;
    public final static int menor=-1;
    public final static int igual=0;

    //constructo defecto

    public Serie(){
        this.titulo= this.titulo;
        this.numeroDeTemporadas=numeroDeTemporadasDEF;
        this.entregado=entregadoDEF;
        this.genero= this.genero;
        this.creador=creador;
    }

    //titulo y creador

    public Serie(String titulo, String creador){
        this.titulo=titulo;
        this.creador=creador;
        this.numeroDeTemporadas=numeroDeTemporadasDEF;
        this.entregado=entregadoDEF;
        this.genero=genero;


        //todos los parametros
    }
    public Serie(String titulo, String creador, int numeroDeTemporadas, String genero){
        this.titulo=titulo;
        this.creador=creador;
        this.numeroDeTemporadas=numeroDeTemporadas;
        this.entregado=entregadoDEF;
        this.genero=genero;
    }

    //metodos get y sett (excpt entregado)
    public String getTitulo(){
        return titulo;
    }

    public String getCreador(){
        return creador;
    }


    public int getNumeroDeTemporadas(){
        return numeroDeTemporadas;
    }

    public String getGenero(){
        return genero;
    }

    //metodos set
    public void setGenero(String genero){
        this.genero=genero;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setCreador(String creador){
        this.creador=creador;
    }
    public void setNumeroDeTemporadas(int numeroDeTemporadas){
        this.numeroDeTemporadas=numeroDeTemporadas;
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
        if(entregar()){
            return true;
        }
        return false;
    }


    @Override
    public int compareTo(Object a) {
        Serie serie = (Serie) a;
        if(numeroDeTemporadas> serie.getNumeroDeTemporadas()){
            return 1;
        }else if (numeroDeTemporadas == serie.getNumeroDeTemporadas()){
            return 0;
        }
        return -1;
    }
    //sobreescribir metodos toString (@override)
    public String toString(){
        return "Series: \n" +
                "Titulo: " + titulo + "\n" +
                "Creador: " + creador + "\n" +
                "Numero de temporadas: " + numeroDeTemporadas + "\n" +
                "Genero: " + genero + "\n";
    }
}

