package model.pizzas;

import model.enumerations.Ingredient;

import java.util.List;

public class SixCheesesPizzaFactory implements PizzaFactory{
    @Override
    public List<Ingredient> getIngredients() {
        return List.of(Ingredient.TOMATO_SAUCE, Ingredient.CHEESE, Ingredient.MOZZARELLA, Ingredient.GOAT_CHEESE,
            Ingredient.BRIE, Ingredient.EMMENTAL, Ingredient.ROQUEFORT, Ingredient.CHEDDAR);
    }
}
