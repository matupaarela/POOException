package main;

public class NestedException2 {
    public static void main(String[] args) {
        try {
            superior();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
