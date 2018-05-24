package pointclickcare.lish.carfactory;

public class PickupFactory implements CarAbstractFactory {
    @Override
    public Car createCar() {
        PickUp pickup = new PickUp();

        pickup.engine = EngineFactory.createEngine2();
        pickup.frame = FrameFactory.createFrame2();
        pickup.handle = HandleFactory.createHandle2();
        pickup.wheel = WheelFactory.createWheel2();

        return pickup;
    }
}
