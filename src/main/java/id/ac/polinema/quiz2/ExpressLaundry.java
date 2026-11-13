package id.ac.polinema.quiz2;

public class ExpressLaundry extends LaundryOrder implements Deliverable {

    public ExpressLaundry(String orderiId, Customer customer, double weightKg) {
        super(orderiId, customer, weightKg);
    }
    
    public double calculatePrice() {
        if (getWeightKg() >= 0) {
            return getWeightKg() * 9000;
        }
        return 0;
    }

    @Override
    public double deliveryFee() {
        return 5000;
    }
}
