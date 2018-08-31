package pointclickcare.lish.carfactory;

public abstract class CarDecorator extends Car{
    protected DecoratedColor color;
    protected Car car;
    public CarDecorator(Car car, DecoratedColor color)
    {
        this.car = car;
        this.color = color;
    }

    @Override
    public String toString() {
        return "[" + car.getClass().getSimpleName() + "]"
                + "[" + color.toString() + "]"
                + "\nengine: " + engine.toString()
                + "\nframe: " + frame.toString()
                + "\nhandle: " + handle.toString()
                + "\nwheel: " + wheel.toString();
    }
}
