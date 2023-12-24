package model.pizzas;

import model.enumerations.Ingredient;

import java.util.List;

public class FourCheesesPizzaFactory implements PizzaFactory{
    @Override
    public List<Ingredient> getIngredients() {
        return List.of(Ingredient.TOMATO_SAUCE, Ingredient.CHEESE, Ingredient.MOZZARELLA, Ingredient.EMMENTAL,
            Ingredient.ROQUEFORT, Ingredient.CHEDDAR);
    }
}
