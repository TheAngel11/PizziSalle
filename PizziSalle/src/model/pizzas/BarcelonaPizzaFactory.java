package model.pizzas;

import model.enumerations.Ingredient;

import java.util.List;

public class BarcelonaPizzaFactory implements PizzaFactory{
    @Override
    public List<Ingredient> getIngredients() {
        return List.of(Ingredient.TOMATO_SAUCE, Ingredient.CHEESE, Ingredient.ONION, Ingredient.BEEF,
            Ingredient.BRIE, Ingredient.HAM, Ingredient.OLIVES);
    }
}
