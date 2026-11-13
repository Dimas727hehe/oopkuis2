package id.ac.polinema.quiz2;

import java.lang.foreign.ValueLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * TAHAP 4 dan 5 (collections dan SOLID): meja laundry yang menyimpan
 * dan memproses pesanan laundry.
 *
 * Lengkapi setiap method (ganti baris
 * {@code throw new UnsupportedOperationException(...)}).
 * Deklarasikan sendiri field-nya (semua private).
 *
 * Tahap 4: simpan pesanan laundry di {@code List} dan cari lewat kode
 * dengan {@code Map}. Jangan memakai array.
 * Tahap 5: pencetak struk diberikan dari luar lewat constructor. Jangan
 * membuat ConsoleReceiptPrinter di dalam kelas ini.
 */
    

public class LaundryDesk{

    private List<LaundryOrder> orders = new ArrayList<>();
    private Map<String, LaundryOrder> ordersMap = new HashMap<>();
    private ReceiptPrinter printer;
    /**
     * Membuat meja laundry kosong dan menyimpan pencetak struk yang diberikan.
     *
     * @param printer pencetak struk yang dipakai saat checkout
     */
    public LaundryDesk(ReceiptPrinter printer) {
        this.printer = printer;
    }

    /**
     * Menyimpan pesanan laundry ke daftar dan ke Map (kuncinya kode pesanan laundry).
     *
     * @param order pesanan laundry yang ditambahkan
     */
    public void add(LaundryOrder order) {
        if (order != null) {
            orders.add(order);
            ordersMap.put(order.getOrderId(),order);
        }
    }

    /**
     * Mencari pesanan laundry lewat kodenya.
     *
     * @param orderId kode yang dicari
     * @return pesanan laundry yang cocok, atau {@code null} bila tidak ada
     */
    public LaundryOrder findById(String orderId) {
        return ordersMap.get(orderId);
    }

    /**
     * @return jumlah pesanan laundry yang tersimpan
     */
    public int count() {
        return orders.size();
    }

    /**
     * @return daftar pesanan laundry menurut urutan penambahan
     */
    public List<LaundryOrder> getOrders() {
        return orders;
    }

    /**
     * Mencari pesanan laundry lewat kodenya, lalu meminta pencetak struk
     * (yang diberikan lewat constructor) mencetak kode dan harga-nya.
     * Kelas ini sendiri tidak mencetak apa pun ke layar.
     * Bila kodenya tidak ada, tidak melakukan apa-apa.
     *
     * @param orderId kode pesanan laundry yang di-checkout
     */
    public void checkout(String orderId) {
        LaundryOrder order = findById(orderId);
        if (order != null) {
            printer.print(orderId, order.calculatePrice());
        }
    }
}
