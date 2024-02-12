package seccion_06;

import java.util.Scanner;

public class SistemaDeCalificaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una calificación entre 0 y 10: ");
        double calificacion = scanner.nextDouble();

        switch ((int) calificacion) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("F");
                break;
            default:
                System.out.println("Valor desconocido");
                break;
        }

        scanner.close();
    }
}
