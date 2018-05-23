package pointclickcare.lish.carfactory;

public class PickupFactory implements CarAbstractFactory {
    @Override
    public Car createCar() {
        PickUp pickup = new PickUp();

        pickup.engine = new Engine2();
        pickup.frame = new Frame2();
        pickup.handle = new Handle2();
        pickup.wheel = new Wheel2();

        return pickup;
    }
}
