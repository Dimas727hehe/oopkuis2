package id.ac.polinema.quiz2;

public class ExpressLaundry extends LaundryOrder implements Deliverable {
    ExpressLaundry (String orderiId, Customer customer, double weightKg) {
        super(orderiId, customer, weightKg);
    }
    public double calculatePrice(){
        if (weightKg >= 0) {
            return weightKg * 9000;
        }
        return 0;
    }

    @Override
    public double deliveryFee() {
        return 5000;
    }
}
