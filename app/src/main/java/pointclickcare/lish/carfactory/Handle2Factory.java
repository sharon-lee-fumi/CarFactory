package pointclickcare.lish.carfactory;

public class Handle2Factory implements HandleAbstractFactory{
    @Override
    public Handle createHandle() {
        Handle2 handle2 = new Handle2();
        return handle2;
    }
}
