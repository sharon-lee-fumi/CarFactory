package pointclickcare.lish.carfactory;

public class Engine1Factory implements EngineAbstractFactory{
    @Override
    public Engine createEngine() {
        Engine1 engine1 = new Engine1();
        return engine1;
    }
}
