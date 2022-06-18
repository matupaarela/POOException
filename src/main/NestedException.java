package main;

import java.util.Scanner;

public class NestedException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerador, denominador, resultado;

        System.out.println("Bienvenido!\n");
        System.out.println("Ingrese el numerador:");
        numerador = scanner.nextInt();

        System.out.println("Ingrese el denominador:");
        denominador = scanner.nextInt();

        try {
            resultado = dividir(numerador, denominador);
            System.out.println("Resultado de la división: " + resultado);
        } catch (ArithmeticException ae) {
            System.out.println("No se puede dividir por cero");
        }

        System.out.println("Programa finalizado normalmente");
    }

    public static int dividir(int num, int den) throws ArithmeticException {
        return num / den;
    }
}
