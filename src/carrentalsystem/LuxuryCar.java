package carrentalsystem;

public class LuxuryCar extends Car {
    public LuxuryCar(String carId, String brand, String model, double basePricePerDay) {
        super(carId, brand, model, basePricePerDay);
    }

    @Override
    public double calculatePrice(int rentalDays) {
        double base = super.calculatePrice(rentalDays);
        double surcharge = base * 0.25;
        return base + surcharge;
    }
}