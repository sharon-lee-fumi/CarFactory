package pointclickcare.lish.carfactory;

public class EngineFactory {
    public static Engine createEngine1() {
        return new Engine1Factory().createEngine();
    }

    public static Engine createEngine2() {
        return new Engine2Factory().createEngine();
    }

    public static Engine createEngine3() {
        return new Engine3Factory().createEngine();
    }
}
