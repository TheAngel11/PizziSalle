package model.pizzas;

import model.enumerations.Ingredient;

import java.util.List;

public class VegetalPizzaFactory implements PizzaFactory{
    @Override
    public List<Ingredient> getIngredients() {
        return List.of(Ingredient.TOMATO_SAUCE, Ingredient.CHEESE, Ingredient.ONION, Ingredient.BELL_PEPPER,
            Ingredient.TOMATO_SLICES, Ingredient.ARTICHOKE, Ingredient.MUSHROOMS);
    }
}
