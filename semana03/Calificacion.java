import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce tu calificación (0-10): ");
        double calificacion = scanner.nextDouble();
        
        if (calificacion >= 6) {
            System.out.println("Has aprobado con una calificación de " + calificacion);
        } else {
            System.out.println("Has reprobado con una calificación de " + calificacion);
        }
    }
}
