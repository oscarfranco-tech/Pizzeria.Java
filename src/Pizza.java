public class Pizza {

    private String nombre;
    private String[] ingredientes;

    // Constructor de la clase Pizza
    public Pizza(String nombre, String[] ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    // Retorna el nombre de la pizza
    public String getNombre() {
        return nombre;
    }

    // Retorna el arreglo de ingredientes
    public String[] getIngredientes() {
        return ingredientes;
    }

    // Muestra la información de la pizza
    public void mostrarPizza() {
        System.out.println("Pizza: " + nombre);
        System.out.println("Ingredientes:");

        for (int i = 0; i < ingredientes.length; i++) {
            System.out.println((i + 1) + ". " + ingredientes[i]);
        }
    }
}