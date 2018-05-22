package pointclickcare.lish.carfactory;

public class Car {
    public static String createSedan()
    {
        SedanFactory sedan = new SedanFactory();
        return sedan.createHandle().handle() + "/" +
                sedan.createWindshield().windshield() + "/" +
                sedan.createWheel().wheel() + "/" +
                sedan.createTire().tire() + "/" +
                sedan.createFrame().frame() + "/" +
                sedan.createLights().lights() + "/" +
                sedan.createEngine().engine() + "/";
    }

    public static String createPickup()
    {
        PickupFactory pickup = new PickupFactory();
        return pickup.createHandle().handle() + "/" +
                pickup.createWindshield().windshield() + "/" +
                pickup.createWheel().wheel() + "/" +
                pickup.createTire().tire() + "/" +
                pickup.createFrame().frame() + "/" +
                pickup.createLights().lights() + "/" +
                pickup.createEngine().engine() + "/";
    }

    public static String createSUV()
    {
        SuvFactory suv = new SuvFactory();
        return suv.createHandle().handle() + "/" +
                suv.createWindshield().windshield() + "/" +
                suv.createWheel().wheel() + "/" +
                suv.createTire().tire() + "/" +
                suv.createFrame().frame() + "/" +
                suv.createLights().lights() + "/" +
                suv.createEngine().engine() + "/";
    }
    public static String createSportsCar()
    {
        SportsCarFactory sports = new SportsCarFactory();
        return sports.createHandle().handle() + "/" +
                sports.createWindshield().windshield() + "/" +
                sports.createWheel().wheel() + "/" +
                sports.createTire().tire() + "/" +
                sports.createFrame().frame() + "/" +
                sports.createLights().lights() + "/" +
                sports.createEngine().engine() + "/";
    }

}
