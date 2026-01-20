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
            System.out.println("---Introduce una opción---");
            System.out.println("1. Añadir un email nuevo");
            System.out.println("2. Mostrar todos los mails registrados");
            System.out.println("3. Comprobar registro de mail");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    //codigo para añadir y comprobar mails
                    System.out.println("Introduce el mail: ");
                    if (emails.add(sc.nextLine())) {
                        System.out.println("Añadido con éxito");
                    }else{
                        System.out.println("El mail existe");}
                    break;
                case 2:
                    //bucle con un print para verlos todos
                    for(String e : emails){
                        System.out.println(e);
                    }
                    break;
                case 3:
                    //codigo para comprobar que se contiene el mail
                    System.out.println("introduce el mail a comprobar");
                    String emailAComprobar = sc.nextLine();
                    if (emails.contains(emailAComprobar)){
                        System.out.println("El mail existe en el sistema");
                    }else{
                        System.out.println("El mail no existe en el sistema");
                    }
                    break;
                case 0:
                    salir = true;
                    System.out.println("Chao pescao!");
                    break;
            }
        }
        sc.close();
    }
}



