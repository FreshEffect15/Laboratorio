import java.util.Scanner;


public class Main {
    public static void main(String[] args) {



        //Ejercicio 1

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un primer num: ");

        int num1 = leer.nextInt();

        System.out.println("Ingrese un segundo num");

        int num2 = leer.nextInt();

        int var = num1;

        num1 = num2;

        num2 = var;

        System.out.println("Primer número: " + num1);

        System.out.println("Segundo número: " + num2);

        //Ejercicio 2

        System.out.println("Ingrese un número: ");

        String num = leer.next();

        System.out.println("El número tiene " + num.length() + " cifras");

        //Ejercicio 3

        System.out.println("Ingrese grados en celsius");

        Double celsius = leer.nextDouble();

        Double kelvin = celsius + 273.15;

        System.out.println("Los grados que ingreso en kelvin son: " + kelvin);

        //Ejercicio 4

        System.out.println("TABLAS DE MULTIPLICAR");

        System.out.println("Ingrese un número, se mostrará la tabla de multiplicar de este: ");

        int tabla = leer.nextInt();

        for(int i = 0 ; i <= 10 ; i++){

            System.out.println(tabla + " x " + i + " = " + tabla * i );


        }


        //Ejercicio 5

        Scanner leer = new Scanner(System.in);

        int numero;

        numero = 0;


        int terminan2 = 0;

        do {

            System.out.println("Ingrese un número, escriba un negativo para salir");

            numero = leer.nextInt();

            if (numero %10 == 2){


                terminan2 = terminan2 + 1;

            }




        }while(numero >= 0);

        System.out.println("La cantidad de números terminados en 2 que ingreso son: " + terminan2);


















    }
}