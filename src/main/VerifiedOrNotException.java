package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class VerifiedOrNotException {
    public static void main(String[] args) {
        //superior();

        //Ejemplo 2: FileNotFoundException, IOException
        /*
        FileReader fileReader = new FileReader("C:\\test\\test.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        for (int i = 0; i < 3; i++) {
            System.out.println(bufferedReader.readLine());
        }

        bufferedReader.close();
        */
    }

    public static void superior() throws Exception {
        try {
            intermedio();
        } catch (Exception e) {
            throw new Exception("Metodo superior", e);
        }
    }

    public static void intermedio() throws Exception {
        try {
            inferior();
        } catch (Exception e) {
            throw new Exception("Metodo intermedio", e);
        }
    }

    public static void inferior() throws Exception {
        throw new Exception("Metodo inferior");
    }
}
