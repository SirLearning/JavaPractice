package Language.LanguageBasics;

import static java.lang.System.*;

public class ArrayDemo {
    static int sv = 10;
    public static void main(String[] args) {
        int[] anArray;
        int[] anotherArray = {
                10, 20, 30,
                40, 50, 60,
                70, 80, 90, 100
        };
        int[][] multidimensionalArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9, 10}
        };
        String[][] multidimenstionalArrayString = {
                {"a", "b", "c"},
                {"d", "e", "f"},
                {"g", "h", "i"}
        };
        anArray = new int[10];

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        ArrayDemo arrayDemo = new ArrayDemo();
        out.println("show the static variable: " + arrayDemo.sv);

        out.println("Element at index 0: " + anArray[0]);
        out.println("Element at index 1: " + anArray[1]);
        out.println("Element at index 2: " + anArray[2]);
        out.println("Element at index 3: " + anArray[3]);
        out.println("Elements in another array: " + anotherArray[0]);
        out.println("Elements in multidimensional array: " + multidimensionalArray[0][0]);
        out.println("length of multidimensional array: " + multidimensionalArray.length);

        // array copy
        int[] copyTo = new int[7];
        arraycopy(anArray, 0, copyTo, 3, 4);
        for (int coffee : copyTo) {
            out.print(coffee + " ");
        }
        out.println();

        int[] copyToR = java.util.Arrays.copyOfRange(anArray, 0, 1);
        for (int coffee : copyToR) {
            out.print(coffee + " ");
        }
        out.println();

        out.println(java.util.Arrays.toString(anArray));
    }
}
