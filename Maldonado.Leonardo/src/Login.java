import java.util.Scanner;

public class Login {
    private static final String UserMain= "Leonardo";
    private static final String Contrasena= "brayan.maldonado@epn.edu.ec";
    private static final int IntentosMax = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;

        while (intentos < IntentosMax) {
            System.out.print("Nombre de usuario: ");
            String User = scanner.nextLine();

            System.out.print("Contraseña: ");
            String contrasena = scanner.nextLine();

            if (validarCredenciales(User, contrasena)) {
                System.out.println("Inicio de sesión exitoso. ¡Bienvenido, " + User + "!");
                
//meterle el menu aqui


                break;
            } else {
                intentos++;
                int intentosRestantes = IntentosMax - intentos;
                System.out.println("Credenciales incorrectas. Intentos restantes: " + intentosRestantes);

                if (intentos == IntentosMax) {
                    System.out.println("Número máximo de intentos alcanzado. El programa se cerrará.");
                    System.exit(0);
                }
            }
        }

        scanner.close();
    }

    private static boolean validarCredenciales(String nombreUsuario, String contrasena) {
        return nombreUsuario.equals(UserMain) && contrasena.equals(Contrasena);
    }

    public void Login() {
    }


    }






