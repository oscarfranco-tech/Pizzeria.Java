# Pizzaneitor3000

## Objetivo

Pizzaneitor3000 es una aplicación desarrollada en Java que simula la gestión de pedidos de una pizzería mediante el uso de pilas implementadas con listas enlazadas dobles.

El proyecto permite registrar pizzas y utilizar las operaciones **Deshacer (Undo)** y **Rehacer (Redo)** para administrar los pedidos.

## Funcionalidades

* Registrar una pizza con su nombre y exactamente 3 ingredientes.
* Deshacer el último pedido registrado.
* Rehacer un pedido que haya sido deshecho.
* Mostrar el pedido actual.
* Utilizar dos pilas implementadas manualmente mediante nodos enlazados.

## Estructura del proyecto

### Pizza.java

Representa una pizza. Contiene el nombre de la pizza y un arreglo fijo de 3 ingredientes que el usuario debe digitar cuando le ponga el nombre a la pizza.

### Nodo.java

Representa cada nodo de la lista enlazada. Contiene una pizza y una referencia al siguiente nodo.

### Pila.java

Implementa la estructura de pila mediante nodos enlazados. Contiene las operaciones:

* `push()`
* `pop()`
* `peek()`
* `isEmpty()`

### GestionPedidos.java

Administra las dos pilas del sistema:

* **Pila principal:** contiene los pedidos activos.
* **Pila secundaria:** contiene temporalmente los pedidos deshechos para poder realizar Rehacer.

### Principal.java

Contiene el método `main`, el menú interactivo y la entrada de datos mediante `Scanner`.

## Menú principal

El programa presenta las siguientes opciones:

1. Registrar Pizza
2. Deshacer (Undo)
3. Rehacer (Redo)
4. Mostrar Pedido Actual
5. Salir

## Capturas de pantalla

Las evidencias del funcionamiento del programa se encuentran en la carpeta `capturas`.


## Autor

Oscar Humberto Franco Montealegre

## Tecnologías utilizadas

* Java
* Visual Studio Code
* Git
* GitHub
* Estructura de datos: Pilas mediante listas enlazadas