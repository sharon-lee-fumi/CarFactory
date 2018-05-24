package pointclickcare.lish.carfactory;

public class Engine3Factory implements EngineAbstractFactory{
    @Override
    public Engine createEngine() {
        Engine3 engine3 = new Engine3();
        return engine3;
    }
}
