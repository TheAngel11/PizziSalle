package model.pizzas;

import model.enumerations.Ingredient;

import java.util.List;

public class GironaPizzaFactory implements PizzaFactory{
    @Override
    public List<Ingredient> getIngredients() {
        return List.of(Ingredient.TOMATO_SAUCE, Ingredient.CHEESE, Ingredient.BEEF, Ingredient.HAM,
            Ingredient.MUSHROOMS, Ingredient.CHICKEN, Ingredient.OLIVES);
    }
}
