package pointclickcare.lish.carfactory;

public class Frame2Factory implements FrameAbstractFactory{
    @Override
    public Frame createFrame() {
        Frame2 frame2 = new Frame2();
        return frame2;
    }
}
