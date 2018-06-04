package pointclickcare.lish.carfactory;

public abstract class CarDecorator extends Car{
    protected static Car coloredCar;
    public CarDecorator(Car coloredCar)
    {
        this.coloredCar = coloredCar;
    }

    @Override
    public String toString() {
        return "[" + coloredCar.getClass().getSimpleName() + "]"
                + "[" + this.getClass().getSimpleName() + "]"
                + "\nengine: " + engine.toString()
                + "\nframe: " + frame.toString()
                + "\nhandle: " + handle.toString()
                + "\nwheel: " + wheel.toString();
    }
}
