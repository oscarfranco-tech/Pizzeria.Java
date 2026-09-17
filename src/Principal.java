import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GestionPedidos gestion = new GestionPedidos();

        int opcion;

        do {
            System.out.println("\n==============================");
            System.out.println("       PIZZANEITOR3000");
            System.out.println("==============================");
            System.out.println("1. Registrar Pizza");
            System.out.println("2. Deshacer (Undo)");
            System.out.println("3. Rehacer (Redo)");
            System.out.println("4. Mostrar Pedido Actual");
            System.out.println("0. Salir");
            System.out.println("==============================");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    registrarPizza(scanner, gestion);
                    break;

                case 2:
                    gestion.deshacer();
                    break;

                case 3:
                    gestion.rehacer();
                    break;

                case 4:
                    gestion.mostrarPedidoActual();
                    break;

                case 0:
                    System.out.println("Gracias por utilizar Pizzaneitor30000.");
                    break;

                default:
                    System.out.println("Opcion  invalida.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    // Solicita al usuario los datos de la pizza.
    public static void registrarPizza(Scanner scanner, GestionPedidos gestion) {

        System.out.print("\nIngrese el nombre de la pizza: ");
        String nombre = scanner.nextLine();

        // Arreglo fijo de exactamente 3 ingredientes.
        String[] ingredientes = new String[3];

        for (int i = 0; i < ingredientes.length; i++) {
            System.out.print("Ingrese el ingrediente " + (i + 1) + ": ");
            ingredientes[i] = scanner.nextLine();
        }

        // Se crea el objeto Pizza con su nombre y sus 3 ingredientes.
        Pizza pizza = new Pizza(nombre, ingredientes);

        // Se registra la pizza en la pila principal.
        gestion.registrarPizza(pizza);
    }
}