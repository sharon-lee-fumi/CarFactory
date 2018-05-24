package pointclickcare.lish.carfactory;

public class SportsCarFactory implements CarAbstractFactory {
    @Override
    public Car createCar() {
        SportsCar sportsCar = new SportsCar();

        sportsCar.engine = EngineFactory.createEngine3();
        sportsCar.frame = FrameFactory.createFrame3();
        sportsCar.handle = HandleFactory.createHandle1();
        sportsCar.wheel = WheelFactory.createWheel3();

        return sportsCar;
    }
}
