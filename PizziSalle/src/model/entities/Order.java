package model.entities;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<Pizza> pizzas;

    public Order() {
        this.pizzas = new ArrayList<>();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    @Override
    public String toString() {
        if(pizzas.isEmpty()) return "\nNo pizzas in order\n";

        StringBuilder sb = new StringBuilder();
        sb.append("\n-------------- ORDER -------------- \n");
        sb.append("CUSTOMER: ").append(customer.toString()).append("\n");
        sb.append("PIZZAS: \n");
        for (Pizza pizza : pizzas) {
            sb.append(pizza.toString()).append("\n");
        }
        return sb.toString();
    }
}
