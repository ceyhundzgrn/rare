public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private boolean isLoyalCustomer;

    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public boolean isLoyalCustomer() { return isLoyalCustomer; }

    public void setId(int id) { this.id = id; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setEmail(String email) { this.email = email; }
    public void setIsLoyalCustomer(boolean isLoyalCustomer) { this.isLoyalCustomer = isLoyalCustomer; }

    public void displayInfo() {
        System.out.println("Customer ID: " + id);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Loyal Customer: " + (isLoyalCustomer ? "Yes" : "No"));
    }
}