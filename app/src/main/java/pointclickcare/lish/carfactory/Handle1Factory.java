package pointclickcare.lish.carfactory;

public class Handle1Factory implements HandleAbstractFactory{
    @Override
    public Handle createHandle() {
        Handle1 handle1 = new Handle1();
        return handle1;
    }
}
