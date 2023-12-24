package model.pizzas;

import model.enumerations.Ingredient;

import java.util.List;

public class TexasPizzaFactory implements PizzaFactory{
    @Override
    public List<Ingredient> getIngredients() {
        return List.of(Ingredient.TOMATO_SAUCE, Ingredient.CHEESE, Ingredient.BBQ_SAUCE, Ingredient.ONION,
            Ingredient.TOMATO_SLICES, Ingredient.CHICKEN);
    }
}
