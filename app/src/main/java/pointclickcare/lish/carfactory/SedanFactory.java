package pointclickcare.lish.carfactory;

public class SedanFactory implements CarAbstractFactory {
    @Override
    public Car createCar() {
        Sedan sedan = new Sedan();

        sedan.engine = EngineFactory.createEngine1();
        sedan.frame = FrameFactory.createFrame1();
        sedan.handle = HandleFactory.createHandle1();
        sedan.wheel = WheelFactory.createWheel1();
        return sedan;
    }
}
