package Main;

import Consolas.Nintendo;
import Consolas.PlayStation;
import Consolas.Xbox;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author csaul
 */
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<PlayStation> playstations = new ArrayList<PlayStation>();
        ArrayList<Xbox> xboxs = new ArrayList<Xbox>();
        ArrayList<Nintendo> nintendos = new ArrayList<Nintendo>();

        String noSerie;
        int year;
        String paisDeOrigen;
        String nombre;

        boolean bandera = true;

        // El método add añade elementos al ArrayList
        PlayStation ps = new PlayStation("play 1", "Japon", 1996, "12345df");
        playstations.add(ps);
        // Imprime el primer elemento de la lista
        System.out.println(playstations.get(0));

        // Imprimir un dato de un elemento del array list
        // hacemos uso de los getters y setters de la clase.
        System.out.println(playstations.get(0).getNombre());

        // Modificar un elemento del ArrayList
        playstations.get(0).setNombre("Nombre nuevo");
        System.out.println(playstations.get(0).getNombre());
    }
}
