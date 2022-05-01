package carrentalsystem;

public class Main {
    public static void main(String[] args) {
        CarRentalSystem system = new CarRentalSystem();
        Car car1 = new Car("C001", "Toyota", "Camry", 60.0);
        Car car2 = new LuxuryCar("C002", "BMW", "7 Series", 180.0);
        system.addCar(car1);
        system.addCar(car2);

        Customer customer = new Customer("CUS001", "John");
        system.addCustomer(customer);
        system.rentCar(car2, customer, 3);
    }
}