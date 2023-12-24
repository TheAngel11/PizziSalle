package model.pizzas;

import model.enumerations.Ingredient;

import java.util.List;

/**
 * PATTERN: Factory
 * El patron Factory es un patron de diseño creacional que permite crear objetos sin especificar la clase exacta
 * del objeto que se creara.
 * En este caso, el patron Factory se utiliza para relacionar las pizzas con sus respectivos ingredientes. La clase
 * PizzaFactory es la interfaz que indica que una pizza ha de tener un metodo que devuelva una lista de ingredientes
 * que tiene la pizza como base (sin contar los ingredientes extra). Las 24 tipos de pizzas que hay en PizzaSalle
 * (AmericanPizzaFactory, BaconCrispyPizzaFactory,...) son las clases que implementan esta interfaz y que devuelven
 * la lista de ingredientes que tiene cada pizza como base.
 * De esta manera, si en un futuro se quieren añadir nuevas pizzas, se puede crear una nueva clase que implemente la
 * interfaz PizzaFactory, y añadirla facilmente. Y a la vez, si se quieren añadir nuevas caracteristicas a las pizzas,
 * se puede añadir en esta interfaz y se añadira a todas las pizzas.
 */
public interface PizzaFactory {
    List<Ingredient> getIngredients();
}
