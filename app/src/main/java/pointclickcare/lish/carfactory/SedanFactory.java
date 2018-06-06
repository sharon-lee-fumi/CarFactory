package pointclickcare.lish.carfactory;

public class SedanFactory implements CarAbstractFactory {
    @Override
    public Car createCar() {
        Sedan sedan = new Sedan();
        Red red = new Red();
        RedCarDecorator sedanRed = new RedCarDecorator(sedan, red);
        sedanRed.engine = EngineFactory.createEngine1();
        sedanRed.frame = FrameFactory.createFrame1();
        sedanRed.handle = HandleFactory.createHandle1();
        sedanRed.wheel = WheelFactory.createWheel1();
        return sedanRed;
    }
}
