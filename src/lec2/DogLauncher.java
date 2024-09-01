package lec2;

public class DogLauncher {
    public static void main(String[] args) {
        Dog smallDog;   // declaration
        new Dog(20);    // instantiation
        smallDog = new Dog(5);  // instantiation and assignment
        Dog hugeDog = new Dog(150); // decaration, stantiation, and assignment
        smallDog.makeNoise();
        hugeDog.makeNoise();    // invocation, use a member of hugeDog
        // arrays of objects
        Dog[] dogs = new Dog[2];    // creates an array of Dogs of size 2
        dogs[0] = new Dog(8);
        dogs[1] = new Dog(20);
        dogs[0].makeNoise();
        // static invocation
        Dog.makeNoiseS();
        // non-static invocation
        Dog maya = new Dog(100);
        maya.makeNoise();
    }
}