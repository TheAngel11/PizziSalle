package model;

public class Customer {
        private String name;
        private String surname1;
        private String surname2;
        private int phone;
        private String address;
        private boolean isFirstOrder;
        private String delegation;

        public Customer() {
        }

        public Customer(String name, String surname1, String surname2, int phone, String address, boolean isFirstOrder, String delegation) {
                this.name = name;
                this.surname1 = surname1;
                this.surname2 = surname2;
                this.phone = phone;
                this.address = address;
                this.isFirstOrder = isFirstOrder;
                this.delegation = delegation;
        }

        public String getName() {
                return name;
        }

        public String getSurname1() {
                return surname1;
        }

        public String getSurname2() {
                return surname2;
        }

        public int getPhone() {
                return phone;
        }

        public String getAddress() {
                return address;
        }

        public boolean isFirstOrder() {
                return isFirstOrder;
        }

        public String getDelegation() {
                return delegation;
        }
}

