public class Adapter implements MobilePhone{
    MobileBattery mobileBattery;

    public Adapter(MobileBattery mobileBattery){
        this.mobileBattery = mobileBattery;
    }

    @Override
    public void turnOnMobile() {
        mobileBattery.turnOnMobileBattery();
    }

    @Override
    public void chargeStatus() {
        mobileBattery.chargeThePhone();
    }

    @Override
    public void turnOffMobile() {
        mobileBattery.turnOffMobileBattery();
    }
}