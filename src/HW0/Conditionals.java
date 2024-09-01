package HW0;

public class Conditionals {

    public static void main(String[] args) {
        int x = 5;

        if (x < 10)
            x += 10;
        if (x < 10)
            x += 10;

        System.out.println(x);
    }

    public static void main(String[] args) {
        int x = 5;

        if (x < 10) {
            System.out.println("I shall increment x by 10.");
            x += 10;
        }
        if (x < 10) {
            System.out.println("I shall increment x by 10.");
            x += 10;
        }

        System.out.println(x);
    }

    public static void main(String[] args) {
        int x = x-5;

        if (x < 0) {
            System.out.println("I should negate X");
            x = -x;
        }

        System.out.println(x);
    }

    public static void main(String[] args) {
        boolean pass = score >= 75;

        if (pass) {
            output("You pass CS 61B");
        }else {
            output("You are such a unbelievable loser");
        }

        if (x > y) {
            if (x > z) {
                maximum = x;
            } else {
                maximum = z;
            }
        } else if (y > z) {
            maximum = y;
        } else {
            maximum = z;
        }

        switch (month) {
            case 12:
                output("It's December.");
            case 1:
            case 2:
            case 11:
                output("It's cold.");
        }
    }

    public static void main(String[] arg) {
        int x = 9;
        if (x - 3 > 8) {
            System.out.println("x - 3 is greater than 8");
        } else {
            System.out.println("x - 3 is not greater than 8");
        }

        int dogSize = 20;
        if (dogSize >= 50) {
            System.out.println("woof!");
        } else if (dogSize >= 10) {
            System.out.println("bark!");
        } else {
            System.out.println("yip!");
        }
    }

    public static void main(String[] arg) {
        int bottles = 99;
        while (bottles > 0) {
            System.out.println(bottles + "bottles of beer on the wall");
            bottles -= 1;
        }
    }
}
/*
    boolean
}
 */