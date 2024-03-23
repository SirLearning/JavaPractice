package Language.ObjectOriented.exercises;

public class opterators {
    public static void main(String[] args) {
        int i = 3;
        i++;
        System.out.println(i); // "4"
        ++i;
        System.out.println(i); // "5"
        System.out.println(++i); // "6"
        System.out.println(i++); // "6"
        System.out.println(i); // "7"

        int value1 = 1;
        int value2 = 2;
        if (value1 == value2) {
            System.out.println("value1 == value2");
        }
        if (value1 != value2) {
            System.out.println("value1 != value2");
        }
        if (value1 > value2) {
            System.out.println("value1 > value2");
        }
        if (value1 < value2) {
            System.out.println("value1 < value2");
        }
        if (value1 <= value2) {
            System.out.println("value1 <= value2");
        }

        int value3 = 1;
        int value4 = 2;
        if((value3 == 1) && (value4 == 2)) {
            System.out.println("value3 is 1 AND value4 is 2");
        }
        if((value3 == 1) || (value4 == 1)) {
            System.out.println("value3 is 1 OR value4 is 1");
    }
}
