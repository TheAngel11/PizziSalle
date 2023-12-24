package model;

import model.entities.Pizza;
import model.enumerations.CrustType;
import model.enumerations.Drink;
import model.enumerations.Ingredient;
import model.enumerations.PizzaName;

import java.util.List;

public class PizzaSalleBuilder implements PizzaBuilder{

    private Pizza pizza;

    public PizzaSalleBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildPizzaBase(int id, String delegation) {
        PizzaName pizzaName;

        if(id == 21) {
            pizzaName = switch (delegation) {
                case "Lleida" -> PizzaName.LLEIDA;
                case "Barcelona" -> PizzaName.BARCELONA;
                case "Tarragona" -> PizzaName.TARRAGONA;
                case "Girona" -> PizzaName.GIRONA;
                default -> PizzaName.values()[id - 1];
            };
        } else {
            pizzaName = PizzaName.values()[id - 1];
        }

        this.pizza.setName(pizzaName);
        this.pizza.setPizzaType(PizzaFactoryMapping.getFactory(pizzaName));
    }

    @Override
    public void buildCrust(int id) {
        CrustType crustType = CrustType.values()[id - 1];
        this.pizza.setCrust(crustType);
    }

    @Override
    public void buildDrink(int id) {
        Drink drink = Drink.values()[id - 1];
        this.pizza.setDrink(drink);
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }

    @Override
    public void buildIngredients(List<Integer> id) {
        for (Integer i : id) {
            Ingredient ingredient = Ingredient.values()[i - 1];
            this.pizza.getExtraIngredients().add(ingredient);
        }
    }
}
