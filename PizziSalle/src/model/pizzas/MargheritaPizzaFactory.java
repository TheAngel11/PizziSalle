package model.pizzas;

import model.enumerations.Ingredient;

import java.util.List;

public class MargheritaPizzaFactory implements PizzaFactory {

    @Override
    public List<Ingredient> getIngredients() {
        return List.of(Ingredient.TOMATO_SAUCE, Ingredient.CHEESE);
    }
}
