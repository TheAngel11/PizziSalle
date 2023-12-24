package model.pizzas;

import model.enumerations.Ingredient;

import java.util.List;

public class BaconCrispyPizzaFactory implements PizzaFactory{
    @Override
    public List<Ingredient> getIngredients() {
        return List.of(Ingredient.TOMATO_SAUCE, Ingredient.CHEESE, Ingredient.HAM, Ingredient.CHICKEN, Ingredient.BACON);
    }
}
