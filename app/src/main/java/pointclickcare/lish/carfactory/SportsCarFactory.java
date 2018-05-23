package pointclickcare.lish.carfactory;

public class SportsCarFactory implements CarAbstractFactory {
    @Override
    public Car createCar() {
        SportsCar sportsCar = new SportsCar();

        sportsCar.engine = new Engine3();
        sportsCar.frame = new Frame3();
        sportsCar.handle = new Handle1();
        sportsCar.wheel = new Wheel3();

        return sportsCar;
    }
}
