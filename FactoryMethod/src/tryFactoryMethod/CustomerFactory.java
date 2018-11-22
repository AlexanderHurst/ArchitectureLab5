package tryFactoryMethod;

public class CustomerFactory {

    public static Customer getCustomer(String type) {
        if (type.equals("First Time Customer")) {
            Customer customer = new FTCustomer();
            return customer;
        }
        if (type.equals("Regular Customer")) {
            Customer customer = new RegCustomer();
            return customer;
        }
        if (type.equals("Senior Citizen Customer")) {
            Customer customer = new SCCustomer();
            return customer;
        }
        Customer customer = new FTCustomer();
        return customer;
    }
}
