package pointclickcare.lish.carfactory;

public class SportsCarFactory implements CarFactory{
    @Override
    public Handle createHandle() {
        return new SedanSuvSportsHandle();
    }

    @Override
    public Windshield createWindshield() {
        return new Windshield() {
            @Override
            public String windshield() {
                return "SportsCar windshield";
            }
        };
    }

    @Override
    public Wheel createWheel() {
        return new Wheel() {
            @Override
            public String wheel() {
                return "SportsCar wheel";
            }
        };
    }

    @Override
    public Tire createTire() {
        return new Tire() {
            @Override
            public String tire() {
                return "SportsCar tire";
            }
        };
    }

    @Override
    public Frame createFrame() {
        return new Frame() {
            @Override
            public String frame() {
                return "SportsCar frame";
            }
        };
    }

    @Override
    public Lights createLights() {
        return new Lights() {
            @Override
            public String lights() {
                return "SportsCar lights";
            }
        };
    }

    @Override
    public Engine createEngine() {
        return new Engine() {
            @Override
            public String engine() {
                return "SportsCar engine";
            }
        };
    }
}
