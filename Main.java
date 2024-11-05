import java.util.Date;

public class Main {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();

        // Contoh membuat dan menambahkan pesanan baru
        Order order1 = new Order("O-001", "John Doe", new Date(), OrderStatus.PENDING);
        orderManager.addOrder(order1);

        // Mengubah status pesanan
        orderManager.updateOrderStatus("O-001", OrderStatus.SHIPPED);

        // Menampilkan daftar pesanan
        for (Order order : orderManager.getOrders()) {
            System.out.println("Order ID: " + order.getOrderId() + ", Status: " + order.getStatus());
        }
    }
}
