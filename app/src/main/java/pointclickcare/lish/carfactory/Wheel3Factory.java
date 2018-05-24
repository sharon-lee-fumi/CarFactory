package pointclickcare.lish.carfactory;

public class Wheel3Factory implements WheelAbstractFactory{
    @Override
    public Wheel createWheel() {
        Wheel3 wheel3 = new Wheel3();
        return wheel3;
    }
}
