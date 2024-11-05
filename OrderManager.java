import java.util.ArrayList;
import java.util.List;

/**
 * Kelas yang mengelola daftar pesanan dalam sistem.
 */
public class OrderManager {
    private List<Order> orders;

    /**
     * Konstruktor untuk inisialisasi objek OrderManager dengan daftar pesanan kosong.
     */
    public OrderManager() {
        orders = new ArrayList<>();
    }

    /**
     * Menambahkan pesanan baru ke dalam daftar pesanan.
     *
     * @param order Objek Order yang akan ditambahkan.
     */
    public void addOrder(Order order) {
        orders.add(order);
    }

    /**
     * Mengubah status pesanan berdasarkan ID pesanan.
     *
     * @param orderId ID unik dari pesanan.
     * @param status Status baru yang akan diberikan ke pesanan.
     * @return true jika pesanan ditemukan dan status berhasil diubah, false jika pesanan tidak ditemukan.
     */
    public boolean updateOrderStatus(String orderId, OrderStatus status) {
        for (Order order : orders) {
            if (order.getOrderId().equals(orderId)) {
                order.setStatus(status);
                return true;
            }
        }
        return false;
    }

    /**
     * Menghapus pesanan berdasarkan ID pesanan jika statusnya "DELIVERED" atau "CANCELLED".
     *
     * @param orderId ID unik dari pesanan.
     * @return true jika pesanan berhasil dihapus, false jika pesanan tidak ditemukan atau statusnya tidak sesuai.
     */
    public boolean removeOrder(String orderId) {
        return orders.removeIf(order -> order.getOrderId().equals(orderId) &&
                (order.getStatus() == OrderStatus.DELIVERED || order.getStatus() == OrderStatus.CANCELLED));
    }

    /**
     * Mendapatkan daftar pesanan saat ini.
     *
     * @return Daftar pesanan dalam sistem.
     */
    public List<Order> getOrders() {
        return new ArrayList<>(orders);
    }
}
