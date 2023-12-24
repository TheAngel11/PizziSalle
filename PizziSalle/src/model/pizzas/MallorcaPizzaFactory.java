package model.pizzas;

import model.enumerations.Ingredient;

import java.util.List;

public class MallorcaPizzaFactory implements PizzaFactory{
    @Override
    public List<Ingredient> getIngredients() {
        return List.of(Ingredient.TOMATO_SAUCE, Ingredient.CHEESE, Ingredient.GOAT_CHEESE, Ingredient.EMMENTAL,
            Ingredient.CHEDDAR, Ingredient.BRIE, Ingredient.SOBRASSADA, Ingredient.OLIVES);
    }
}
