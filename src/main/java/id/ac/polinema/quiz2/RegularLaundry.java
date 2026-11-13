package id.ac.polinema.quiz2;

public class RegularLaundry extends LaundryOrder {
    public RegularLaundry (String orderiId, Customer customer, double weightKg) {
        super(orderiId, customer, weightKg);
    }
    public double calculatePrice(){
        if (getWeightKg() >= 0) {
            return getWeightKg() * 6000;
        }
        return 0;
    }
}
