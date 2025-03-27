public class Main {
    public static void main(String[] args) {
        ComputerStore store = new ComputerStore();

        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Asus Monitor");
        p1.setCategory("Monitor");
        p1.setPrice(2500.00);
        p1.setStockQuantity(15);
        store.addProduct(p1);

        Customer c1 = new Customer();
        c1.setId(1);
        c1.setFirstName("Ali");
        c1.setLastName("Yılmaz");
        c1.setEmail("ali@example.com");
        c1.setIsLoyalCustomer(true);
        store.addCustomer(c1);

        Product[] orderProducts = {p1};
        int[] quantities = {2};
        Order order = store.createOrder(c1, orderProducts, quantities);
        order.applyDiscount();
        store.updateStockAfterOrder(order);
        order.displayDetails();
    }
}