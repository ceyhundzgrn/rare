import java.util.Date;

public class Order {
    private int id;
    private Customer customer;
    private Product[] products;
    private int[] quantities;
    private Date orderDate;
    private String status;

    public Order(int id, Customer customer, Product[] products, int[] quantities) {
        this.id = id;
        this.customer = customer;
        this.products = products;
        this.quantities = quantities;
        this.orderDate = new Date();
        this.status = "New";
    }

    public double calculateTotalValue() {
        double total = 0;
        for (int i = 0; i < products.length; i++) {
            total += products[i].getPrice() * quantities[i];
        }
        return total;
    }

    public void applyDiscount() {
        if (customer.isLoyalCustomer()) {
            System.out.println("Loyal customer discount applied.");
        }
    }

    public void displayDetails() {
        System.out.println("Order ID: " + id);
        customer.displayInfo();
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + status);
        for (int i = 0; i < products.length; i++) {
            System.out.println("Product: " + products[i].getName() + ", Quantity: " + quantities[i]);
        }
        System.out.println("Total: " + calculateTotalValue() + " TL");
    }

    public int getId() { return id; }
    public void setStatus(String status) { this.status = status; }
}