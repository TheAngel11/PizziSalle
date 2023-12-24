package controller;

import model.*;
import view.View;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
            this.model = model;
            this.view = view;
    }

    public void run() {
        LimitStrategy pizzaLimit = new PizzaLimitStrategy();

        view.showTitle();
        String delegation = fillCustomerData();
        boolean addPizza = true;

        while (addPizza) {
            selectPizza(delegation);
            if (!pizzaLimit.isLimitReached(model.getOrder().getPizzas().size(), 10)) {
                view.showMessage("\nWould you like to add another pizza to your order? (y/n): ");
                addPizza = view.askForChar() == 'y';
            } else {
                addPizza = false;
            }
        }

        view.showMessage(model.makeOrder());
        view.showMessage("\nThank you for ordering at Pizzi Salle! We hope to see you soon!\n\n");
    }

    private String selectDelegation() {
        String delegation = model.getDelegation();
        view.showMessage("\nThank you! You will receive your order from " + delegation + " delegation.\n\n");
        return delegation;
    }

    private String fillCustomerData() {
        String name, surname1, surname2, address;
        int phone;
        boolean isFirstOrder;
        view.showMessage("Please enter your name: ");
        name = view.askForString();
        view.showMessage("Please enter your first surname: ");
        surname1 = view.askForString();
        view.showMessage("Please enter your second surname: ");
        surname2 = view.askForString();
        view.showMessage("Please enter your phone number: ");
        phone = view.askForInteger();
        view.showMessage("Please enter your address: ");
        address = view.askForString();
        view.showMessage("Is this your first order? (y/n): ");
        isFirstOrder = view.askForChar() == 'y';

        String delegation = selectDelegation();
        model.setCustomerData(name, surname1, surname2, phone, address, isFirstOrder, delegation);

        return delegation;
    }

    private void selectPizza(String delegation) {
        int pizzaId, crustTypeId, extraIngredientId = 1,  drinkId;
        List<Integer> extraIngredientsIds = new ArrayList<>();
        PizzaBuilder pizzaBuilder = new PizzaSalleBuilder();
        LimitStrategy ingredientsLimit = new IngredientLimitStrategy();

        view.showPizzaMenu();
        addDelegationSpecialPizza(delegation);
        view.showMessage("Please select the number of the pizza you want to order: ");
        pizzaId = view.askForInteger();
        if (pizzaId <= 0 || pizzaId >= 22) {
            return;
        }

        pizzaBuilder.buildPizzaBase(pizzaId, delegation);
        int numIngredients = pizzaBuilder.getPizza().getIngredients();

        while ((extraIngredientId > 0 && extraIngredientId < 33) && !ingredientsLimit.isLimitReached(numIngredients, 10)) {
            view.showExtraIngredientsMenu();
            extraIngredientId = view.askForInteger();
            if (extraIngredientId > 0 && extraIngredientId < 33) {
                extraIngredientsIds.add(extraIngredientId);
                numIngredients++;
            }
        }

        pizzaBuilder.buildIngredients(extraIngredientsIds);

        view.showCrustTypeMenu();
        crustTypeId = view.askForInteger();
        if(crustTypeId <= 0 || crustTypeId > 3) {
            crustTypeId = 1;
        }
        pizzaBuilder.buildCrust(crustTypeId);

        view.showDrinkMenu();
        drinkId = view.askForInteger();
        if(drinkId <= 0 || drinkId > 3) {
            drinkId = 4;
        }
        pizzaBuilder.buildDrink(drinkId);

        model.addPizza(pizzaBuilder.getPizza());
    }

    private void addDelegationSpecialPizza(String delegation) {
        switch (delegation) {
            case "Barcelona" -> view.showMessage("\t\t21. Barcelona (Onion, beef, brie, ham & olives)\n");
            case "Girona" -> view.showMessage("\t\t21. Girona (Beef, ham, mushrooms, chicken & olives)\n");
            case "Tarragona" -> view.showMessage("\t\t21. Tarragona (Tuna, prawns, onion, ham & olives)\n");
            case "Lleida" -> view.showMessage("\t\t21. Lleida (BBQ Sauce, beef, chicken, mushrooms & olives)\n");
        }
        view.showMessage("\n\t\t22. None\n\n");
    }
}
