public class Samsung implements MobilePhone{
    @Override
    public void turnOnMobile() {
        System.out.println("turning on samsung mobile...");
    }

    @Override
    public void chargeStatus() {
        System.out.println("Samsung charging is currently 70%");
    }

    @Override
    public void turnOffMobile() {
        System.out.println("turning off samsung mobile...");
    }
}