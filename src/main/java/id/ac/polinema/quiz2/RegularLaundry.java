package id.ac.polinema.quiz2;

public class RegularLaundry extends LaundryOrder {
    RegularLaundry (String orderiId, Customer customer, double weightKg) {
        super(orderiId, customer, weightKg);
    }
    public double calculatePrice(){
        if (weightKg >= 0) {
            return weightKg * 6000;
        }
        return 0;
    }
}
