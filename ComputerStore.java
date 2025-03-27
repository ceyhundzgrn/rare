import java.util.ArrayList;

public class ComputerStore {
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private int orderCounter = 1;

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Order createOrder(Customer customer, Product[] products, int[] quantities) {
        Order newOrder = new Order(orderCounter++, customer, products, quantities);
        orders.add(newOrder);
        return newOrder;
    }

    public void updateStockAfterOrder(Order order) {
        Product[] orderedProducts = order.products;
        int[] orderedQuantities = order.quantities;
        for (int i = 0; i < orderedProducts.length; i++) {
            Product product = orderedProducts[i];
            int newStock = product.getStockQuantity() - orderedQuantities[i];
            product.setStockQuantity(newStock);
        }
    }

    public void changeOrderStatus(int orderId, String newStatus) {
        for (Order order : orders) {
            if (order.getId() == orderId) {
                order.setStatus(newStatus);
                break;
            }
        }
    }
}