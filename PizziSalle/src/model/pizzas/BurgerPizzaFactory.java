package model.pizzas;

import model.enumerations.Ingredient;

import java.util.List;

public class BurgerPizzaFactory implements PizzaFactory{

    @Override
    public List<Ingredient> getIngredients() {
        return List.of(Ingredient.TOMATO_SAUCE, Ingredient.CHEESE, Ingredient.MINIBURGERS, Ingredient.EGG,
            Ingredient.BACON, Ingredient.ONION);
    }
}
