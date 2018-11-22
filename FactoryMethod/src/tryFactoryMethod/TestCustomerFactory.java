package tryFactoryMethod;

class TestCustomerFactory {
    public static void main(String[] args) {
        Customer ftcustomer = CustomerFactory.getCustomer("First Time Customer");
        ftcustomer.getType();
        Customer regcustomer = CustomerFactory.getCustomer("Regular Customer");
        regcustomer.getType();
        Customer scccustomer = CustomerFactory.getCustomer("Senior Citizen Customer");
        scccustomer.getType();
    }
}
