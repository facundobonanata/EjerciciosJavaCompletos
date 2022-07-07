package Ejercicio18;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //array de series
        Serie listaSeries [] = new Serie[5];
        //array de videojuegos
        Videojuegos listaVideojuegos[] =new Videojuegos[5];

        //array de series
        listaSeries[0]=new Serie();
        listaSeries[1]=new Serie("The Boys", "Eric Kripke", 3, "Acción" );
        listaSeries[2]=new Serie("Peaky Blinders", "Steven Knight", 6, "Historico");
        listaSeries[3]=new Serie("Mind Hunter", "Joe Penhall", 2, "Psicologico");
        listaSeries[4]=new Serie("El imprerio romano","Jeremiah Murphy Peter", 1,"Documental, Historico");

        //array de videojuegos
        listaVideojuegos[0]=new Videojuegos();
        listaVideojuegos[1]=new Videojuegos("Battlefield", 20, "Shooter","EA");
        listaVideojuegos[2]=new Videojuegos("League of legends", 400, "Moba","Tense");
        listaVideojuegos[3]=new Videojuegos("Call of Duty", 120, "Shooter","Activision");
        listaVideojuegos[4]=new Videojuegos("A Plague Tale", 20, "Aventura","Asobo Studio");

        //entregar()

        listaSeries[1].entregar();
        listaSeries[4].entregar();
        listaSeries[0].entregar();
        listaVideojuegos[3].entregar();
        listaVideojuegos[4].entregar();

        int Sentregadas=0;
        int Ventregados=0;

        for(int i=0; i<listaSeries.length;i++){
            if(listaSeries[i].isEntregado()){
                Sentregadas=Sentregadas+1;
                listaSeries[i].devolver();
            }

            if(listaVideojuegos[i].isEntregado()){
                Ventregados=Ventregados+1;
                listaVideojuegos[i].devolver();
            }
        }
        System.out.println("Hay "+Sentregadas+" series entregadas y " + Ventregados +" Videojuegos entregados");
        //System.out.println(Arrays.toString(listaVideojuegos));
        //System.out.println(Arrays.toString(listaSeries));

        //videojuego con mas horas estimadas y serie con mas temporadas

        Serie serieMayor = listaSeries[0];
        Videojuegos videojuegosMayor=listaVideojuegos[0];

        for(int i=1; i<listaSeries.length;i++){
            if(listaSeries[i].compareTo(serieMayor)==Serie.mayor){
                serieMayor=listaSeries[i];
            }
            if(listaVideojuegos[i].compareTo(videojuegosMayor)==Videojuegos.mayor){
                videojuegosMayor=listaVideojuegos[i];
            }
        }

        System.out.println(videojuegosMayor);
        System.out.println(serieMayor);
    }
}
