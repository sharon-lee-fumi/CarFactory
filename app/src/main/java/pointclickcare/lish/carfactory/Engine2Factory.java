package pointclickcare.lish.carfactory;

public class Engine2Factory implements EngineAbstractFactory{
    @Override
    public Engine createEngine() {
        Engine2 engine2 = new Engine2();
        return engine2;
    }
}
