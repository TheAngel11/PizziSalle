package model;

/**
 * PATTERN: Strategy
 * El patron Strategy es un patron de diseño de comportamiento que permite definir una familia de algoritmos,
 * encapsular cada uno de ellos, y hacerlos intercambiables.
 * En este caso, el patron Strategy se utiliza para definir una familia de estrategias de limitacion de alimentos
 * en la Pizza, ya que los recursos no son infinitos. Por una banda tenemos IngredientLimitStrategy, que limita
 * el numero de ingredientes que se pueden añadir a una pizza. Por otra banda tenemos PizzaLimitStrategy, que limita
 * el numero de pizzas que se pueden añadir a un pedido (Order). De esta manera si en un futuro se quieren limitar
 * otros alimentos, se puede crear una nueva estrategia que implemente la interfaz LimitStrategy, y añadirla facilmente
 * En nuestro caso, el limite que le pondremos es 10, pero se puede cambiar facilmente. Y mientras que no se haya
 * alcanzado el limite, se podran añadir mas ingredientes/pizzas.
 */
public interface LimitStrategy {
    boolean isLimitReached(int current, int limit);
}
