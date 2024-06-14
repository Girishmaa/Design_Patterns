// Singleton OrderManager class
class OrderManager {
    private static OrderManager instance;

    // Private constructor to prevent instantiation
    private OrderManager() {
        // Initialize order management logic here
        System.out.println("OrderManager instance created.");
    }

    // Lazy initialization with synchronized method for thread safety
    public static synchronized OrderManager getInstance() {
        if (instance == null) {
            instance = new OrderManager();
        }
        return instance;
    }

    // Example method in OrderManager class
    public void placeOrder(String dishName, int quantity) {
        System.out.println("Placing order for " + quantity + " " + dishName);
        // Order processing logic
    }

    // Example method in OrderManager class
    public void cancelOrder(int orderId) {
        System.out.println("Canceling order with ID: " + orderId);
        // Cancel order logic
    }

    // Additional methods as needed
}

// Usage of the Singleton OrderManager
public class SingletonPattern {
    public static void main(String[] args) {
        OrderManager orderManager1 = OrderManager.getInstance();
        OrderManager orderManager2 = OrderManager.getInstance();

        // Both orderManager1 and orderManager2 refer to the same instance
        System.out.println("orderManager1 hashCode: " + orderManager1.hashCode());
        System.out.println("orderManager2 hashCode: " + orderManager2.hashCode());

        // Demonstrate order processing and cancellation
        orderManager1.placeOrder("Pizza", 2);
        orderManager2.cancelOrder(1001);
    }
}
