package ejercicio103;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio103 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String opcion = "SI";
        ArrayList<Articulo> listaArticulos = new ArrayList<>();


        while(!opcion.equalsIgnoreCase("NO")) {
            System.out.println("Introduzca el nombre del artículo: ");
            String nombre = sc.next();

            System.out.println("Introduzca el precio");
            double precio = sc.nextDouble();

            listaArticulos.add(new Articulo(precio, nombre));

            do {
                System.out.println("Deseas seguir introduciendo articulos?");
                opcion = sc.next();
            } while (!opcion.toUpperCase().equals("SI") && !opcion.toUpperCase().equals("NO"));
        }

        double suma =0.0;

        for(Articulo articulo : listaArticulos) {
            System.out.println(articulo.toString());
            suma += articulo.getPrecio();
        }

        System.out.println("\nTotal: " + suma);
    }
}
