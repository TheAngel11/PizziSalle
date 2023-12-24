package model.entities;

import model.enumerations.CrustType;
import model.enumerations.Drink;
import model.enumerations.Ingredient;
import model.enumerations.PizzaName;
import model.pizzas.PizzaFactory;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private PizzaName name;
    private PizzaFactory pizzaType;
    private List<Ingredient> extraIngredients;
    private CrustType crust;
    private Drink drink;

    public Pizza() {
        this.extraIngredients = new ArrayList<>();
    }

    public PizzaName getName() {
        return name;
    }

    public void setName(PizzaName name) {
        this.name = name;
    }

    public PizzaFactory getPizzaType() {
            return pizzaType;
    }

    public void setPizzaType(PizzaFactory pizzaType) {
            this.pizzaType = pizzaType;
    }

    public List<Ingredient> getExtraIngredients() {
        return extraIngredients;
    }

    public void setExtraIngredients(List<Ingredient> extraIngredients) {
        this.extraIngredients = extraIngredients;
    }

    public CrustType getCrust() {
        return crust;
    }

    public void setCrust(CrustType crust) {
        this.crust = crust;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public int getIngredients() {
        return pizzaType.getIngredients().size() + extraIngredients.size();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\t").append(name).append(": ");

        List<Ingredient> baseIngredients = pizzaType.getIngredients();
        builder.append("\n\t\tBase ingredients: ");
        for (Ingredient ingredient : baseIngredients) {
            builder.append(ingredient.toString());
            if(baseIngredients.indexOf(ingredient) != baseIngredients.size() - 1)
                builder.append(", ");
        }

        if (!extraIngredients.isEmpty())
            builder.append("\n\t\tExtra ingredients: ");

        int count = 0;
        for (Ingredient ingredient : extraIngredients) {
            builder.append(ingredient.toString());
            if(count != extraIngredients.size() - 1)
                builder.append(", ");
            count++;
        }
        builder.append("\n\t\tCrust: ").append(crust.toString()).append(" ");
        builder.append("\n\t\tDrink: ").append(drink.toString()).append(" ");

        return builder.toString();
    }
}
