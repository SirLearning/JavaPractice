package Language.ObjectOriented;

public class ACMEBicycle implements Bicycle{

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public void changeCadence(int newValue) {
        cadence = newValue;
    }
    public void changeGear(int newValue) {
        gear = newValue;
    }
    public void speedUp(int increment) {
        speed += increment;
    }
    public void applyBrakes(int decrement) {
        speed -= decrement;
    }
    public void fraction(int wave, int time) {
        if(speed - wave * time >= 0) speed -= wave * time;
        else speed = 0;
    }
    public void printStates() {
        System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
    }

    public static void main(String[] args) {
        Bicycle bike1 = new ACMEBicycle();
        Bicycle bike2 = new ACMEBicycle();

        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();
    }
}
class MountainBike extends ACMEBicycle {
    // new fields and methods defining
    // a mountain bike would go here
    int switches = 0;
    int wave = 0;
    public void dewave() {
        if(wave - switches >= 0) wave -= switches;
        else wave = 0;
    }

    public static void main(String[] args) {
        MountainBike M1 = new MountainBike();
        MountainBike M2 = new MountainBike();

        int wave = 10;
        int time = 6;

        M1.switches = 1;
        M2.switches = 2;
        M1.speedUp(50);
        M2.speedUp(50);
        M1.wave = wave;
        M2.wave = wave;
        M1.dewave();
        M2.dewave();
        M1.fraction(M1.wave,time);
        M2.fraction(M2.wave,time);

        M1.printStates();
        M2.printStates();
    }
}
class roadBike extends ACMEBicycle {

}