package pointclickcare.lish.carfactory;

public class HandleFactory {
    public static Handle createHandle1() {
        return new Handle1Factory().createHandle();
    }

    public static Handle createHandle2() {
        return new Handle2Factory().createHandle();
    }
}
