package repaso;

import java.util.Scanner;

public class Ejercicio102 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Introduzca el nombre de la persona");
            String nombre = sc.nextLine();

            int edad = -1;

            while(edad < 18) {
                System.out.println("Introduzca la edad");
                try {
                    edad = sc.nextInt();
                    if (edad < 18)
                        System.out.println(nombre + " tiene que ser mayor de edad");
                    else if(edad > 65)
                        System.out.println(nombre + " lleva jubilada desde hace: " + Integer.toString(edad - 65) + " anhos");
                    else if(edad == 65)
                        System.out.println(nombre + " se jubila este anho");
                    else
                        System.out.println(nombre + " se va a jubilar dentro de: " + Integer.toString(65 - edad) + " anhos");

                }catch (Exception e) {
                    System.out.println("Error en el valor introducido");
                    sc.nextLine();
                }

            }
            sc.close();
        }
    }



