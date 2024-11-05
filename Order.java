import java.util.Date;

/**
 * Kelas yang merepresentasikan sebuah pesanan dalam sistem toko online.
 */
public class Order {
    private String orderId;
    private String customerName;
    private Date orderDate;
    private OrderStatus status;

    /**
     * Konstruktor untuk membuat objek Order baru.
     *
     * @param orderId ID unik untuk pesanan.
     * @param customerName Nama pelanggan yang membuat pesanan.
     * @param orderDate Tanggal pembuatan pesanan.
     * @param status Status awal dari pesanan.
     */
    public Order(String orderId, String customerName, Date orderDate, OrderStatus status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.status = status;
    }

    /**
     * Mendapatkan ID pesanan.
     *
     * @return ID unik dari pesanan.
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Mendapatkan nama pelanggan.
     *
     * @return Nama pelanggan.
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Mendapatkan tanggal pembuatan pesanan.
     *
     * @return Tanggal pesanan dibuat.
     */
    public Date getOrderDate() {
        return orderDate;
    }

    /**
     * Mendapatkan status pesanan.
     *
     * @return Status saat ini dari pesanan.
     */
    public OrderStatus getStatus() {
        return status;
    }

    /**
     * Mengubah status pesanan.
     *
     * @param status Status baru yang akan diterapkan.
     */
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
