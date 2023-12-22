package model;

import persistence.CustomerSQL;

public class Model {

    private CustomerSQL customerSQL;
    public Model() {
        customerSQL = new CustomerSQL();
        customerSQL.createCustomersTable();
    }

        public String getDelegation() {
            String[] delegations = {"Barcelona", "Tarragona", "Lleida", "Girona"};
            int random = (int) (Math.random() * delegations.length);
            return delegations[random];
        }

        public void setCustomerData(String name, String surname1, String surname2, int phone, String address, boolean isFirstOrder, String delegation) {
            Customer customer = new Customer(name, surname1, surname2, phone, address, isFirstOrder, delegation);
            // save the customer data in the database
                customerSQL.saveCustomer(customer);
        }
}
