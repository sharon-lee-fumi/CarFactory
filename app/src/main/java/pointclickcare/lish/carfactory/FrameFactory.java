package pointclickcare.lish.carfactory;

public class FrameFactory {
    public static Frame createFrame1() {
        return new Frame1Factory().createFrame();
    }

    public static Frame createFrame2() {
        return new Frame2Factory().createFrame();
    }

    public static Frame createFrame3() {
        return new Frame3Factory().createFrame();
    }
}
