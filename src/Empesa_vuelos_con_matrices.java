import java.util.Scanner;

public class Empesa_vuelos_con_matrices {

    public static void main(String[] args) {

        // Cargar la matriz con la cantidad de asientos de cada vuelo
        int vuelos[][] = new int[6][3];

        // Filas destino, columnas horarios
        Scanner teclado = new Scanner(System.in);

        // Cargamos la matriz
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese la cantidad de asientos para el destino " + i + " horario: " + j);
                vuelos[i][j] = teclado.nextInt();
            }
        }

        // Venta de asientos
        Scanner teclado2 = new Scanner(System.in);
        String flag_salida = "";
        int destino, horarios, asientos;

        while (!flag_salida.equalsIgnoreCase("finish")) {

            System.out.println("Ingrese el numero de destino: ");
            destino = teclado2.nextInt();

            System.out.println("Ingrese el horario del vuelo: ");
            horarios = teclado2.nextInt();

            System.out.println("Ingrese la cantidad de asientos: ");
            asientos = teclado2.nextInt();

            if (destino >= 0 && destino <= 5) {

                if (horarios >= 0 && horarios <= 2) {

                    if (vuelos[destino][horarios] >= asientos) {
                        System.out.println("Su reserva fue realizada con exito");
                        vuelos[destino][horarios] = vuelos[destino][horarios] - asientos;
                    } else {
                        System.out.println("No hay asientos disponibles");
                    }

                } else {
                    System.out.println("Horario no existente, ingrese un horario entre 0 y 2");
                }

            } else {
                System.out.println("Destino no existente, ingrese entre 0 y 5");
            }

            System.out.println("Desea continuar reservando, ingrese finish para terminar o cualquier tecla para seguir");
            flag_salida = teclado2.next();
        }
    }
}