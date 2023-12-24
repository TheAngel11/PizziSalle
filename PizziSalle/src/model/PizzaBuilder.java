package model;

import model.entities.Pizza;

import java.util.List;

/**
 * PATTERN: Builder
 * El patron builder es un patron de diseño creacional que permite crear objetos complejos paso a paso de forma
 * que puedas personalizar su creacion.
 * En este caso, el patron builder se utiliza para crear pizzas. La clase PizzaBuilder es la interfaz que define
 * los pasos a seguir para crear una pizza, y la clase PizzaSalleBuilder es la clase que implementa esta interfaz
 * y que crea la pizza como lo hace actualmente PizziSalle. De esta manera, si en un futuro se quiren añadir otras
 * formas de crear pizzas, se puede crear una nueva clase que implemente la interfaz PizzaBuilder, y añadirla facilmente.
 * En nuestro caso, la pizza se crea con una base (que se refiere al tipo de pizza sin ingredientes extra), una masa,
 * unos ingredientes, y una bebida. Pero se podria cambiar facilmente para que se creara de otra manera.
 */

public interface PizzaBuilder {
    void buildPizzaBase(int id, String delegation);
    void buildCrust(int id);
    void buildIngredients(List<Integer> id);
    void buildDrink(int id);
    Pizza getPizza();
}
