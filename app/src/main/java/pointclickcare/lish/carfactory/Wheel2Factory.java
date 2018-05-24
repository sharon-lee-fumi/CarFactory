package pointclickcare.lish.carfactory;

public class Wheel2Factory implements WheelAbstractFactory{
    @Override
    public Wheel createWheel() {
        Wheel2 wheel2 = new Wheel2();
        return wheel2;
    }
}
