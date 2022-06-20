package main.ownexception;

public class AdultException extends RuntimeException {
    // Si la persona no es mayor de edad, lanzar una excepción
    public AdultException(String str) {
        super(str + " no eres mayor de edad");
    }

    public AdultException() {
        this("Lo lamento, no puedes entrar porque");
    }
}
