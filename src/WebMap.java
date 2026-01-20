import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WebMap {
    public static void main(String[] args) {

        // Mapa que guarda: nombre de página → número de visitas
        HashMap<String, Integer> webs = new HashMap<>();

        // Scanner para leer texto del usuario
        Scanner sc = new Scanner(System.in);

        boolean seguir = true;

        // Bucle principal: pide páginas hasta que se escriba "fin"
        while (seguir) {
            System.out.println("Escribe una página: ");
            String pagina = sc.nextLine();

            // Si el usuario escribe "fin", salimos del bucle
            if (pagina.equalsIgnoreCase("fin")) {
                seguir = false;
            }
            // Si la página ya existe, incrementamos su contador
            else if (webs.containsKey(pagina)) {
                webs.put(pagina, webs.get(pagina) + 1);
            }
            // Si no existe, la añadimos con valor 1
            else {
                webs.put(pagina, 1);
            }
        }

        // Mostrar todas las páginas y sus visitas
        System.out.println("Visitas registradas:");
        for (Map.Entry<String, Integer> entry : webs.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Cerramos el Scanner
        sc.close();
    }
}
