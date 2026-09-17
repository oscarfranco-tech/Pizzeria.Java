public class GestionPedidos {

    // Pila principal: almacena los pedidos activos.
    // Se utiliza para realizar la operación Deshacer (Undo).
    private Pila pilaPrincipal;

    // Pila secundaria: almacena temporalmente los pedidos deshechos.
    // Se utiliza para realizar la operación Rehacer (Redo).
    private Pila pilaSecundaria;

    // Constructor de GestionPedidos
    public GestionPedidos() {
        pilaPrincipal = new Pila();
        pilaSecundaria = new Pila();
    }

    // Registra una nueva pizza en la pila principal.
    public void registrarPizza(Pizza pizza) {

        pilaPrincipal.push(pizza);

        // Al registrar una nueva pizza se limpia la pila secundaria,
        // porque los pedidos deshechos anteriores ya no pueden rehacerse.
        pilaSecundaria = new Pila();

        System.out.println("Pizza registrada correctamente.");
    }

    // Deshacer: retira la última pizza de la pila principal
    // y la pasa a la pila secundaria.
    public void deshacer() {

        if (pilaPrincipal.isEmpty()) {
            System.out.println("No hay pedidos para deshacer.");
            return;
        }

        Pizza pizza = pilaPrincipal.pop();
        pilaSecundaria.push(pizza);

        System.out.println("Pedido deshecho correctamente.");
    }

    // Rehacer: retira la última pizza de la pila secundaria
    // y la devuelve a la pila principal.
    public void rehacer() {

        if (pilaSecundaria.isEmpty()) {
            System.out.println("No hay pedidos para rehacer.");
            return;
        }

        Pizza pizza = pilaSecundaria.pop();
        pilaPrincipal.push(pizza);

        System.out.println("Pedido rehecho correctamente.");
    }

    // Muestra la pizza que se encuentra en el tope
    // de la pila principal sin retirarla.
    public void mostrarPedidoActual() {

        if (pilaPrincipal.isEmpty()) {
            System.out.println("No hay pedidos activos.");
            return;
        }

        Pizza pizza = pilaPrincipal.peek();

        System.out.println("\n--- PEDIDO ACTUAL ---");
        pizza.mostrarPizza();
    }
}