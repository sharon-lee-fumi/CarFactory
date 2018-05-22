package pointclickcare.lish.carfactory;

public interface CarFactory {
    Handle createHandle();
    Windshield createWindshield();
    Wheel createWheel();
    Tire createTire();
    Frame createFrame();
    Lights createLights();
    Engine createEngine();
}
