package pointclickcare.lish.carfactory;

public class SedanFactory implements CarAbstractFactory {
    @Override
    public Car createCar() {
        Sedan sedan = new Sedan();

        sedan.engine = new Engine1();
        sedan.frame = new Frame1();
        sedan.handle = new Handle1();
        sedan.wheel = new Wheel1();

        return sedan;
    }
}
