package pointclickcare.lish.carfactory;

public class Frame3Factory implements FrameAbstractFactory{
    @Override
    public Frame createFrame() {
        Frame3 frame3 = new Frame3();
        return frame3;
    }
}
