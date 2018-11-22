package tryObserver;

class TestObserver {
    public static void main(String[] args) {
        Store amazon = new Store("amazon", 0.5f);
        Customer john = new Customer("John", "amazon");
        Customer josh = new Customer("Josh", "amazon");
        john.register(amazon);
        amazon.register(josh);
        amazon.setDiscount("black friday", 0.7f);
        john.unregister(amazon);
        amazon.unregister(josh);
        amazon.setDiscount("festival", 0.5f);
        john.register(amazon);
        amazon.setDiscount("christmas", 0.02f);
    }
}