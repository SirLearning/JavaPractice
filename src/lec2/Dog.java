package lec2;

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
            System.out.println("yipyipyip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark. bark.");
        } else {
            System.out.println("woof!");
        }
    }
    public static void makeNoise() {
        System.out.println("Bark!");
    }
    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        }
        return d2;
    }
    public static String binomen = "Cani familiaris";
    public static Dog[] largerThanFourNeighbors(Dog[] dogs) {
        int loop = 4;
        int ploop = loop + 1;
        int i = 0;
        int counter = -2;
        int l = dogs.length;
        Dog[] size = new Dog[dogs.length];
        int sizeLength = -1;
        while (i < l) {
            for (int j = 0; j < ploop; j += 1, counter += 1) {
                int full = 0;
                if (i + counter >= 0) {
                    if (dogs[i + counter].weightInPounds >= dogs[i]) {
                        break;
                    } else {
                        full += 1;
                    }
                }
                if (full == loop) {
                    sizeLength += 1;
                    size[sizeLength] = dogs[i];
                }
            }
        }
        System.out.println(java.util.Arrays.toString(size));
    }
}

public class Dogsize {
    public static void main(String[] args) {
        Dog[] sizeDogs = Dog.Dog[10, 20, 30, 25, 20, 40, 10];
        Dog.largerThanFourNeighbors(sizeDogs);
    }
}