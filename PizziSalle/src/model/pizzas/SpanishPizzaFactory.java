package model.pizzas;

import model.enumerations.Ingredient;

import java.util.List;

public class SpanishPizzaFactory implements PizzaFactory{
    @Override
    public List<Ingredient> getIngredients() {
        return List.of(Ingredient.TOMATO_SAUCE, Ingredient.CHEESE, Ingredient.JAMON_SERRANO, Ingredient.BRIE,
            Ingredient.OLIVES, Ingredient.MUSHROOMS);
    }
}
