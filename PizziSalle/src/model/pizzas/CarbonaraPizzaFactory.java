package model.pizzas;

import model.enumerations.Ingredient;

import java.util.List;

public class CarbonaraPizzaFactory implements PizzaFactory{
    @Override
    public List<Ingredient> getIngredients() {
        return List.of(Ingredient.TOMATO_SAUCE, Ingredient.CHEESE, Ingredient.CARBONARA_SAUCE, Ingredient.BACON,
            Ingredient.ONION, Ingredient.MUSHROOMS);

    }
}
