package com.generation;
import java.util.Scanner;

public class Main {

    public static void main(String[]args){
        //Ciclo for. Ejercicio
        Scanner sc =new Scanner(System.in);
        //System.out.println("Ingresa la posición del número que quieres de la serie de Fibonacci");
        //int numero = sc.nextInt();
        /*System.out.println("Tablas de multiplicar");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero+"x"+i+"="+(numero*i));
        }*/
        //El break se utiliza para detener en un punto la ejecución del ciclo
        //continue se utiliza para detener momentaneamente el flujo de ejecucion y lo reanuda cuando la condición pasa
        /*System.out.println("----Serie de Fibonacci----");
        int esperado=0;
        int actual=1;
        int anterior=1;
        for (int i = 0; i <numero; i++) {
            if(i==0){
                esperado=0;
            }else if (i==1||i==2) {
                esperado=1;
            }else{
                esperado=actual+anterior;
                anterior=actual;
                actual=esperado;
            }
            System.out.println("Posición "+i+" : "+esperado);
        }*/

        //ciclo While
        /*
            while(condicion){
                codigo
            }
        */
        /*int numerosecreto=23;
        System.out.println("Adivina el número secreto. Ingresa un número");
        int numerouser=sc.nextInt();

        while(numerouser!=numerosecreto){
            System.out.println("Adivina el número secreto. Ingresa un número");
            numerouser=sc.nextInt();
        }
        System.out.println("Felicidades, adivinaste el número secreto"
        */

        //do While
        /*
        do{
            codigo
        }while(condicion);
        */
        /*
        int numerosecreto=45;
        int numerouser;
        do{
            System.out.println("Adivina el número secreto. Ingresa un número");
            numerouser=sc.nextInt();
        }while(numerouser!=numerosecreto);
        System.out.println("Felicidades, adivinaste el numero secreto");
        */
        //número factorial
        System.out.println("Hola usuario, por favor ingresa un número al que le quieras sacar el factorial");
        int base=sc.nextInt();
        int multiplo=1;
        int resultado=1;
        do{
            System.out.println(resultado+"x"+multiplo);
            resultado*=multiplo;
            multiplo++;
        }while (base>=multiplo);
        System.out.print("="+resultado);
    }
}
