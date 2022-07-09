public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new Samsung();

        phone.turnOnMobile();
        phone.chargeStatus();
        phone.turnOffMobile();

        System.out.println("------------------------");

        MobileBattery charger = new IphoneCharger();

        MobilePhone newCharger = new Adapter(charger);

        newCharger.turnOnMobile();
        newCharger.chargeStatus();
        newCharger.turnOffMobile();

    }
}

