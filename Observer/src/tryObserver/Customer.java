package tryObserver;

class Customer extends Observer {
    public String name;
    public String store;
    public float discount;

    Customer(String name, String store) {
        this.name = name;
        this.store = store;
    }

    @Override
    public void update(float discount) {
        this.discount = discount;
        System.out.println("Name: " + this.name + "\nDiscount: " + this.discount + "\n");
    }

    public void register(Store store) {
        store.register(this);
    }

    public void unregister(Store store) {
        store.unregister(this);
    }
}