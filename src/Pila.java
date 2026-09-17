public class Pila {

    // El tope apunta al primer nodo de la pila
    private Nodo tope;

    // Constructor de la pila
    public Pila() {
        tope = null;
    }

    // push(): agrega una pizza en el tope de la pila
    public void push(Pizza pizza) {

        // Se crea un nuevo nodo que contiene la pizza
        Nodo nuevo = new Nodo(pizza);

        // El nuevo nodo apunta al antiguo tope
        nuevo.siguiente = tope;

        // El nuevo nodo se convierte en el nuevo tope
        tope = nuevo;
    }

    // pop(): elimina y devuelve la pizza que está en el tope
    public Pizza pop() {

        // Verificamos si la pila está vacía
        if (isEmpty()) {
            return null;
        }

        // Guardamos la pizza del nodo que está en el tope
        Pizza pizza = tope.pizza;

        // El tope pasa a ser el siguiente nodo
        tope = tope.siguiente;

        // Devolvemos la pizza que retiramos
        return pizza;
    }

    // peek(): muestra la pizza que está en el tope sin eliminarla
    public Pizza peek() {

        if (isEmpty()) {
            return null;
        }

        return tope.pizza;
    }

    // isEmpty(): comprueba si la pila está vacía
    public boolean isEmpty() {
        return tope == null;
    }
}