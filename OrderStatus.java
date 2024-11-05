/**
 * Enum yang merepresentasikan status dari sebuah pesanan.
 */
public enum OrderStatus {
    PENDING,      // Pesanan baru yang belum diproses
    SHIPPED,      // Pesanan telah dikirim
    DELIVERED,    // Pesanan telah sampai di tujuan
    CANCELLED     // Pesanan telah dibatalkan
}
