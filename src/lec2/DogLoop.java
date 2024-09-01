package lec2;

public class DogLoop {
    public DogLoop() {
    }
    public static void main(String[] args) {
        Dog smallDog = new Dog(5);
        Dog mediumDog = new Dog(25);
        Dog hugeDog = new Dog(150);

        Dog[] manyDogs = new Dog[4];
        manyDogs[0] = smallDog;
        manyDogs[1] = mediumDog;
        manyDogs[2] = hugeDog;
        manyDogs[3] = new Dog(130);

        int i = 0;
        while (i < manyDogs.length) {
            Dog.maxDog(manyDogs[i], mediumDog).makeNoise();
            i += 1;
        }
    }
}