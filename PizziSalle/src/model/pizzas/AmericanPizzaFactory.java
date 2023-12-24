package model.pizzas;

import model.enumerations.Ingredient;

import java.util.List;

public class AmericanPizzaFactory implements PizzaFactory{

    @Override
    public List<Ingredient> getIngredients() {
        return List.of(Ingredient.TOMATO_SAUCE, Ingredient.CHEESE, Ingredient.FRANKFURT, Ingredient.BACON, Ingredient.EGG);
    }
}
