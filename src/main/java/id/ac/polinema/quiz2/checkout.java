package id.ac.polinema.quiz2;

public class Checkout extends LaundryDesk {
    
    public Checkout(ReceiptPrinter printer) {
        super(printer);
    }
    public void checkout(String orderId) {
        super.checkout(orderId);
    }
}
