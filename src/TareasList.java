import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TareasList {
    public static void main(String[] args) {

        //declaramos el arraylist y resto de elementos necesarios
        List<String> tareas = new ArrayList<>();
        boolean salir = false;
        int opcion;
        Scanner sc = new Scanner(System.in);

        //empezamos con los bucles de flujo de programa
        while (!salir) {

            System.out.println("1. Añadir una tarea al final");
            System.out.println("2. Insertar una tarea en una posición");
            System.out.println("3. Eliminar una tarea por posición");
            System.out.println("4. Mostrar todas las tareas numeradas");
            System.out.println("0. Salir");
            System.out.println("Ingresa la opción que deseas ejecutar: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    //codigo para añadir una tarea nueva al final
                    System.out.println("Escribe la tarea: ");
                    String tarea = sc.nextLine();
                    tareas.add(tarea);
                    System.out.println("Tarea añadida :D");
                    break;
                case 2:
                    //codigo para añadir una tarea por índice
                    System.out.println("Escribe la tarea: ");
                    String tareaIndexada = sc.nextLine();
                    System.out.println("Asigna la posición (0-" + tareas.size() + ")");
                    int posicion = sc.nextInt();
                    sc.nextLine();

                    //codigo para comprobar que la posicion es válida
                    if (posicion >= 0 && posicion <= tareas.size()) {
                        tareas.add(posicion, tareaIndexada);
                        System.out.println("Tarea añadida :D");
                    }else{
                        System.out.println("Posición no válida");
                    }
                    break;
                case 3:
                    //codigo para eliminar por posicion
                    System.out.println("¿Qué posición quieres eliminar? (0-" + (tareas.size()-1) + "): ");
                    int posicionEliminar = sc.nextInt();
                    sc.nextLine();

                    //codigo para comprobar que la posicion es valida
                    if (posicionEliminar >= 0 && posicionEliminar < tareas.size()) {
                        tareas.remove(posicionEliminar);
                        System.out.println("Tarea eliminada :D");
                    }else{
                        System.out.println("Posición no válida");
                    }
                    break;
                case 4:
                    //comprobamos que no esta vacio y luego imprimimos
                    if (tareas.isEmpty()){
                        System.out.println("No hay tareas");
                    }else{
                        System.out.println("---TAREAS---");
                        for  (int i = 0; i < tareas.size(); i++) {
                            System.out.println(i + ". "+ tareas.get(i));
                        }
                    }
                    break;
                case 0:
                    salir = true;
                    System.out.println("Chao pescao!");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;


            }
            System.out.println();
        } sc.close();
    }
}

