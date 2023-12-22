package controller;

import model.Model;
import view.View;

public class Controller {
       private final Model model;
       private final View view;

        public Controller(Model model, View view) {
                this.model = model;
                this.view = view;
        }

        public void run() {
            view.showTitle();
            String delegation = fillCustomerData();

            selectPizza(delegation);
        }

        private String selectDelegation() {
            // Select a delegation randomly Barcelona, Tarragona, Lleida, or Girona
            String delegation = model.getDelegation();
            view.showMessage("Thank you! You will receive your order from " + delegation + " delegation.\n");
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
            int pizzaId, extraIngredientId = 0, crustTypeId;

            view.showPizzaMenu();
            addDelegationSpecialPizza(delegation);
            view.showMessage("Please select the number of the pizza you want to order: ");
            pizzaId = view.askForInteger();
                //view.showMessage("You have selected the following pizza: ");
                //view.showMessage("\t\t" + pizzaId + ". " + model.getPizza(pizzaId).getName());
            while (extraIngredientId != 22) {
                view.showExtraIngredientsMenu();
                extraIngredientId = view.askForInteger();
                if (extraIngredientId != 22) {
                    //view.showMessage("You have selected the following extra ingredient: ");
                    //view.showMessage("\t\t" + extraIngredientId + ". " + model.getExtraIngredient(extraIngredientId).getName());
                }
            }

            view.showCrustTypeMenu();
            crustTypeId = view.askForInteger();


        }

        private void addDelegationSpecialPizza(String delegation) {
            // Add the delegation special pizza to the order
            switch (delegation) {
                case "Barcelona":
                    view.showMessage("\t\t21. Barcelona (Onion, beef, brie, ham & olives)\n");
                    break;
                case "Girona":
                    view.showMessage("\t\t21. Girona (Beef, ham, mushrooms, chicken & olives)\n");
                    break;
                case "Tarragona":
                    view.showMessage("\t\t21. Tarragona (Tuna, prawns, onion, ham & olives)\n");
                    break;
                case "Lleida":
                    view.showMessage("\t\t21. Lleida (BBQ Sauce, beef, chicken, mushrooms & olives)\n");
                    break;
            }
            view.showMessage("\n\t\t22. None\n\n");
        }
}
