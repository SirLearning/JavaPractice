package Language.ObjectOriented;
public interface Bicycle {
    // wheel revolutiions per minute
    public void changeCadence(int newValue);
    public void changeGear(int newValue);
    public void speedUp(int increment);
    public void applyBrakes(int decrement);
    public void printStates();
}
