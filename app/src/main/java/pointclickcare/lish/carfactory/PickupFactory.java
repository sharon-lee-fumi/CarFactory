package pointclickcare.lish.carfactory;

public class PickupFactory implements CarFactory{
    @Override
    public Handle createHandle() {
        return new Handle() {
            @Override
            public String handle() {
                return "Pickup handle";
            }
        };
    }

    @Override
    public Windshield createWindshield() {
        return new Windshield() {
            @Override
            public String windshield() {
                return "Pickup windshield";
            }
        };
    }

    @Override
    public Wheel createWheel() {
        return new PickupSuvWheel();
    }

    @Override
    public Tire createTire() {
        return new PickupSuvTire();
    }

    @Override
    public Frame createFrame() {
        return new PickupSuvFrame();
    }

    @Override
    public Lights createLights() {
        return new Lights() {
            @Override
            public String lights() {
                return "Pickup lights";
            }
        };
    }

    @Override
    public Engine createEngine() {
        return new PickupSuvEngine();
    }
}
