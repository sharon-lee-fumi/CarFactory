package pointclickcare.lish.carfactory;

public class SUVFactory implements CarAbstractFactory {
    @Override
    public Car createCar() {
        SUV suv = new SUV();

        suv.engine = new Engine2();
        suv.frame = new Frame2();
        suv.handle = new Handle1();
        suv.wheel = new Wheel2();

        return suv;
    }
}
