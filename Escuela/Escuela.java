package Escuela;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Suponemos que cuando un aula se ocupa, se cierra, aunque queden bancos
 * disponibles. Suponemos que las aulas en la lista están ordenadas según sus
 * capacidades, de menor a mayor.
 * 
 */
public class Escuela {

    public static void main(String[] args) {
        //Carga de la aulas
        ArrayList<Aula> aulas = new ArrayList<Aula>();
        aulas.add(new Aula("Amarillo", 30));
        aulas.add(new Aula("Verde", 35));
        aulas.add(new Aula("Azul", 40));

        Scanner scan = new Scanner(System.in);

        int valor = 0, disponibles = aulas.size();

        do {
            mostrarAulasDisponibles(aulas);
            System.out.print("Ingrese cantidad ( n < 0 para salir)> ");
            valor = scan.nextInt();

            if (valor < 0){ // Forzando el cierre.
                scan.close();
                System.out.println("Programa terminado.");
                System.exit(1);
            }

            for (Aula a : aulas) { //Recorriendo aulas disponibles
                // Si está disponible y el valor no excede su capacidad
                if (a.getDisponibilidad() && valor <= a.getBancos_total()) { 
                    a.setDisponibilidad(false); //Cerrando el aula
                    disponibles--; //Disminuyendo la cantidad disponible
                    System.out.println(String.format("\n--¡El aula \"%s\" ha sido ocupada!--", a.getNombre()));
                    break;
                }
            }            

        } while (disponibles != 0);
        
        System.out.println("\n¡¡¡Todas las aulas han sido ocupadas!!!\n Programa terminado.");
        scan.close();
    }

    /**
     * Muestra aulas disponibles -no ocupadas-
     * @param aulas
     */
    public static void mostrarAulasDisponibles(ArrayList<Aula> aulas) {
        System.out.println("\n--Capacidades máximas disponibles.--");
        for (Aula a : aulas) {
            if (a.getDisponibilidad()) 
            System.out.println(String.format("\t\"%s\": %d", a.getNombre(), a.getBancos_total()));
        }
        System.out.println("--------------------------------------");        
    }
}