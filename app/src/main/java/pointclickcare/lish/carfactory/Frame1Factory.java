package pointclickcare.lish.carfactory;

public class Frame1Factory implements FrameAbstractFactory{
    @Override
    public Frame createFrame() {
        Frame1 frame1 = new Frame1();
        return frame1;
    }
}
