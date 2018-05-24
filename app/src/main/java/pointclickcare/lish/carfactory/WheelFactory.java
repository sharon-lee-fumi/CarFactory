package pointclickcare.lish.carfactory;

public class WheelFactory {
    public static Wheel createWheel1()
    {
        return new Wheel1Factory().createWheel();
    }

    public static Wheel createWheel2()
    {
        return new Wheel2Factory().createWheel();
    }

    public static Wheel createWheel3()
    {
        return new Wheel3Factory().createWheel();
    }
}
