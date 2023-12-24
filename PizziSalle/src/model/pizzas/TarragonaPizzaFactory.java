package model.pizzas;

import model.enumerations.Ingredient;

import java.util.List;

public class TarragonaPizzaFactory implements PizzaFactory{
    @Override
    public List<Ingredient> getIngredients() {
        return List.of(Ingredient.TOMATO_SAUCE, Ingredient.CHEESE, Ingredient.TUNA, Ingredient.PRAWNS,
            Ingredient.ONION, Ingredient.HAM, Ingredient.OLIVES);
    }
}
