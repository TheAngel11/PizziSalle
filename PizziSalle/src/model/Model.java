package model;

import model.entities.Customer;
import model.entities.Order;
import model.entities.Pizza;
import persistence.CustomerSQL;

public class Model{
    private Order order;
    private CustomerSQL customerSQL;
    public Model() {
        customerSQL = new CustomerSQL();
        customerSQL.createCustomersTable();
        order = new Order();
    }

    public String getDelegation() {
        String[] delegations = {"Barcelona", "Tarragona", "Lleida", "Girona"};
        int random = (int) (Math.random() * delegations.length);
        return delegations[random];
    }

    public void setCustomerData(String name, String surname1, String surname2, int phone, String address, boolean isFirstOrder, String delegation) {
        Customer customer = new Customer(name, surname1, surname2, phone, address, isFirstOrder, delegation);
        order.setCustomer(customer);
        customerSQL.saveCustomer(customer);
    }

    public void addPizza(Pizza pizza) {
        order.getPizzas().add(pizza);
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return this.order;
    }

    public String makeOrder() {
        return order.toString();
    }
}
