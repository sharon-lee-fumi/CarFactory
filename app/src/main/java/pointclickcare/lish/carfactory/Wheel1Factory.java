package pointclickcare.lish.carfactory;

public class Wheel1Factory implements WheelAbstractFactory{
    @Override
    public Wheel createWheel() {
        Wheel1 wheel1 = new Wheel1();
        return wheel1;
    }
}
