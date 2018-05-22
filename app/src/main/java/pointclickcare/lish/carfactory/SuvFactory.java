package pointclickcare.lish.carfactory;

public class SuvFactory implements CarFactory{
    @Override
    public Handle createHandle() {
        return new SedanSuvSportsHandle();
    }

    @Override
    public Windshield createWindshield() {
        return new SedanSuvWindshield();
    }

    @Override
    public Wheel createWheel() {
        return new PickupSuvWheel();
    }

    @Override
    public Tire createTire() {
        return new PickupSuvTire();
    }

    @Override
    public Frame createFrame() {
        return new PickupSuvFrame();
    }

    @Override
    public Lights createLights() {
        return new SedanSuvLights();
    }

    @Override
    public Engine createEngine() {
        return new PickupSuvEngine();
    }

}
