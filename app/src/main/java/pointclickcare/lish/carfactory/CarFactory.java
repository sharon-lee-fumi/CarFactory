package pointclickcare.lish.carfactory;

public class CarFactory {
    public static Car createSedan() {
        return new SedanFactory().createCar();
    }

    public static Car createSUV() {
        return new SUVFactory().createCar();
    }

    public static Car createPickup() {
        return new PickupFactory().createCar();
    }

    public static Car createSportsCar() {
        return new SportsCarFactory().createCar();
    }

    // another style to create product with abstract factory
    // Car newCar = CarFactory.createCar(new SedanFactory());
    public static Car createCar(CarAbstractFactory factory) {
        return factory.createCar();
    }
}
