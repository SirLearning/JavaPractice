public class Dog {
    // instance variable
    public int weightInPounds;
    // Constructor
    public Dog(int stratingWeight) {
        weightInPounds = stratingWeight;
    }
    // non-statc method, a.k.a. instance method
    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yipyipyip!")
        } else if (weightInPounds < 30) {
            System.out.println("bark. bark.")
        } else {
            System.out.println("woof!");
        }
    }
    public static void makeNoiseS() {
        System.out.println("Bark!");
    }
    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        }
        return d2;
        
    }
}
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
        dogs[0] = new Dog(20);
        dogs[0].makeNoise();
        // static invocation
        Dog.makeNoiseS();
        // non-static invocation
        maya = new Dog(100);
        maya.makeNoise();
    }
}