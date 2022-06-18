package main;

import java.util.Scanner;

public class DivByZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerador, denominador, resultado;

        System.out.println("Bienvenido!\n");
        System.out.println("Ingrese el numerador:");
        numerador = scanner.nextInt();

        System.out.println("Ingrese el denominador:");
        denominador = scanner.nextInt();

        try {
            resultado = numerador / denominador;
            System.out.println("Resultado de la división: " + resultado);
        } catch (ArithmeticException ae) {
            System.out.println("No es posible la división por cero!");
        } finally {
            System.out.println("Me da lo mismo si hay o no una Excepcion");
        }


        System.out.println("Gracias por usar nuestro producto...");
    }
}
