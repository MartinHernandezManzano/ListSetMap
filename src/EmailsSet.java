import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class EmailsSet {
    public static void main(String[] args) {
        //declaramos los elementos necesarios
        Scanner sc = new Scanner(System.in);
        Set<String> emails = new HashSet<>();
        int opcion;
        boolean salir = false;

        //empezamos con los bucles de flujo del programa
        while (!salir) {
            System.out.println("1. Añadir un email nuevo");
            System.out.println("2. Mostrar todos los mails registrados");
            System.out.println("3. Comprobar registro de mail");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    salir = true;
                    System.out.println("Chao pesaco!");
                    break;
            }
        }
        sc.close();
    }
}

