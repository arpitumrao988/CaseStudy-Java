package ecommerceplateform;



class Order {
    int orderId;
    String customerName;
    String productCategory;
    int quantity;
    double amount;
    String orderDate;

    public Order(int orderId, String customerName,
                 String productCategory,
                 int quantity, double amount,
                 String orderDate) {

        this.orderId = orderId;
        this.customerName = customerName;
        this.productCategory = productCategory;
        this.quantity = quantity;
        this.amount = amount;
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return orderId + " " + customerName + " " +
                productCategory + " " + amount;
    }
}
