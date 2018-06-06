package pointclickcare.lish.carfactory;

public abstract class DecoratedColor {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
