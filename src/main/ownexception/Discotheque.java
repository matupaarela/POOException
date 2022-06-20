package main.ownexception;

import java.util.Scanner;

public class Discotheque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();

        valid(edad);

        System.out.println("Proceso finalizado");
    }

    public static void valid(int edad) throws AdultException {
        if (edad < 18)
            throw new AdultException();
        else
            System.out.println("Bienvenido a la Disco");
    }
}
