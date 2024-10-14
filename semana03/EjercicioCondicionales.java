import java.util.Scanner;

public class EjercicioCondicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            // Menú
            System.out.println("Selecciona un ejercicio a ejecutar:");
            System.out.println("1. Condicional simple anidada en una condición simple");
            System.out.println("2. Condicional simple anidada en una condición doble");
            System.out.println("3. Condicional doble anidada en una condición simple");
            System.out.println("4. Condicional doble anidada en una condición doble");
            System.out.println("5. Salir");
            System.out.print("Elige una opción (1-5): ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    // Caso 4.1: Condicional simple anidada en una condición simple
                    System.out.print("Introduce un número: ");
                    int numero1 = scanner.nextInt();
                    if (numero1 > 0) {
                        System.out.println(numero1 + " es positivo.");
                        if (numero1 % 2 == 0) {
                            System.out.println(numero1 + " es par.");
                        } else {
                            System.out.println(numero1 + " es impar.");
                        }
                    } else {
                        System.out.println(numero1 + " no es positivo.");
                    }
                    break;
                    
                case 2:
                    // Caso 4.2: Condicional simple anidada en una condición doble
                    System.out.print("Introduce un número: ");
                    int numero2 = scanner.nextInt();
                    if (numero2 >= 0) {
                        System.out.println(numero2 + " es positivo.");
                        if (numero2 % 5 == 0) {
                            System.out.println(numero2 + " es múltiplo de 5.");
                        } else {
                            System.out.println(numero2 + " no es múltiplo de 5.");
                        }
                    } else {
                        System.out.println(numero2 + " es negativo.");
                        if (numero2 % 5 == 0) {
                            System.out.println(numero2 + " es múltiplo de 5.");
                        } else {
                            System.out.println(numero2 + " no es múltiplo de 5.");
                        }
                    }
                    break;
                    
                case 3:
                    // Caso 4.3: Condicional doble anidada en una condición simple
                    System.out.print("Introduce un año: ");
                    int anio = scanner.nextInt();
                    if (anio > 0) {
                        if (anio % 4 == 0) {
                            if (anio % 100 != 0 || anio % 400 == 0) {
                                System.out.println(anio + " es un año bisiesto.");
                            } else {
                                System.out.println(anio + " no es un año bisiesto.");
                            }
                        } else {
                            System.out.println(anio + " no es un año bisiesto.");
                        }
                    } else {
                        System.out.println("Año inválido.");
                    }
                    break;
                    
                case 4:
                    // Caso 4.4: Condicional doble anidada en una condición doble
                    System.out.print("Introduce tu edad: ");
                    int edad = scanner.nextInt();
                    System.out.print("¿Eres ciudadano (sí/no)?: ");
                    String esCiudadano = scanner.next();
                    
                    if (edad >= 18) {
                        if (esCiudadano.equalsIgnoreCase("sí")) {
                            System.out.println("Eres elegible para votar.");
                        } else {
                            System.out.println("No eres ciudadano, por lo tanto no puedes votar.");
                        }
                    } else {
                        System.out.println("No tienes la edad mínima para votar.");
                        if (esCiudadano.equalsIgnoreCase("sí")) {
                            System.out.println("Aunque eres ciudadano, aún no puedes votar por tu edad.");
                        } else {
                            System.out.println("Además de no tener la edad, no eres ciudadano.");
                        }
                    }
                    break;
                    
                case 5:
                    // Salir del programa
                    System.out.println("Saliendo del programa...");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
            System.out.println();
            
        } while (opcion != 5);
        
        scanner.close();
    }
}
