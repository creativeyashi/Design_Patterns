public class IphoneCharger implements MobileBattery{
    @Override
    public void turnOnMobileBattery() {
        System.out.println("turning on iphone ");
    }

    @Override
    public void chargeThePhone() {
        System.out.println("charging the mobile phone");
    }

    @Override
    public void turnOffMobileBattery() {
        System.out.println("turning off iphone");
    }
}