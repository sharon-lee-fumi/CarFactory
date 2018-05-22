package pointclickcare.lish.carfactory;

public class SedanFactory implements CarFactory{
    @Override
    public Handle createHandle() {
        return new SedanSuvSportsHandle();
    }

    @Override
    public Windshield createWindshield() {
        return new SedanSuvWindshield();
    }

    @Override
    public Wheel createWheel() {
        return new Wheel() {
            @Override
            public String wheel() {
                return "Sedan wheel";
            }
        };
    }

    @Override
    public Tire createTire() {
        return new Tire() {
            @Override
            public String tire() {
                return "Sedan tire";
            }
        };
    }

    @Override
    public Frame createFrame() {
        return new Frame() {
            @Override
            public String frame() {
                return "Sedan frame";
            }
        };
    }

    @Override
    public Lights createLights() {
        return new SedanSuvLights();
    }

    @Override
    public Engine createEngine() {
        return new Engine() {
            @Override
            public String engine() {
                return "Sedan engine";
            }
        };
    }
}
