package model.pizzas;

import model.enumerations.Ingredient;

import java.util.List;

public class CarbonaraDeluxePizzaFactory implements PizzaFactory{
    @Override
    public List<Ingredient> getIngredients() {
        return List.of(Ingredient.TOMATO_SAUCE, Ingredient.CHEESE, Ingredient.CARBONARA_SAUCE, Ingredient.BACON,
            Ingredient.ONION, Ingredient.MUSHROOMS, Ingredient.GOAT_CHEESE, Ingredient.HONEY);
    }
}
