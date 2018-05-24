package pointclickcare.lish.carfactory;

public class SUVFactory implements CarAbstractFactory {
    @Override
    public Car createCar() {
        SUV suv = new SUV();

        suv.engine = EngineFactory.createEngine2();
        suv.frame = FrameFactory.createFrame2();
        suv.handle = HandleFactory.createHandle1();
        suv.wheel = WheelFactory.createWheel2();

        return suv;
    }
}
