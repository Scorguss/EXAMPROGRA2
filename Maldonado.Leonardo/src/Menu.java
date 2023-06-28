import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            opcion = mostrarMenu(scanner);

            switch (opcion) {
                case 1:
                    System.out.println("1. Visualizar Alumnos");
                    break;
                case 2:
                    System.out.println("2. Visualizar Materias");
                    break;
                case 3:
                    System.out.println("3. Visualizar Horario");
                    break;
                case 4:
                    System.out.println("4. Visualizar Horario de una Materia");
                    break;
                case 0:
                    System.out.println("0. Salir");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static int mostrarMenu(Scanner scanner) {
        System.out.println("===== MENÚ =====");
        System.out.println("1. Visualizar Alumnos");
        System.out.println("2. Visualizar Materias");
        System.out.println("3. Visualizar Horario");
        System.out.println("4. Visualizar Horario de una Materia");
        System.out.println("0. Salir");
        System.out.print("Selecciona una opción: ");
        return scanner.nextInt();
    }
}
