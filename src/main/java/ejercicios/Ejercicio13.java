package ejercicios;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Ejercicio13 {
    public static void main(String[] args){
        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("La fecha actual es: " + fecha.format(LocalDateTime.now()));
    }
}
