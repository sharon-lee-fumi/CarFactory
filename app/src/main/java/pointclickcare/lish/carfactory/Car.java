package pointclickcare.lish.carfactory;

public abstract class Car {
    Engine engine;
    Frame frame;
    Handle handle;
    Wheel wheel;

    @Override
    public String toString() {
        return "[" + this.getClass().getSimpleName() + "]"
                + "\nengine: " + engine.toString()
                + "\nframe: " + frame.toString()
                + "\nhandle: " + handle.toString()
                + "\nwheel: " + wheel.toString();
    }
}
