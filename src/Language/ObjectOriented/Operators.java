package Language.ObjectOriented;

// =    Simple assignment operator
// +    Additive operator (also used for String concatenation)
// -    Subtraction operator
// *    Multiplication operator
// /    Division operator
// %    Remainder operator
class ArithmeticDemo {
    public static void main (String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int original_result = result;

        result = result - 1;
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;

        result = result * 2;
        System.out.println(original_result + " * 2 = " + result);
        original_result = result;

        result = result / 2;
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;

        result = result + 8;
        System.out.println(original_result + " + 8 = " + result);
        original_result = result;

        result = result % 7;
        System.out.println(original_result + " % 7 = " + result);
    }

}

class ConcatDemo {
    public static void main(String[] args) {
        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString + secondString;
        System.out.println(thirdString);
    }
}

// +   Unary plus operator; indicates positive value (numbers are positive without this, however)
// -   Unary minus operator; negates an expression
// ++  Increment operator; increments a value by 1
// --  Decrement operator; decrements a value by 1
// !   Logical complement operator; inverts the value of a boolean
class UnaryDemo {
    public static void main(String[] args) {
        int result = +1;
        System.out.println(result);

        result--;
        System.out.println(result);

        // ～ is the bitwise complement operator, it inverts a bit pattern (from 0 to 1 and from 1 to 0)
        result++;
        System.out.println(result);
        System.out.println(~result);

        result = -result;
        System.out.println(result);
        System.out.println(~result);

        boolean success = false;
        System.out.println(success);
        System.out.println(!success);
    }
}

class PrePostDemo {
    public static void main(String[] args) {
        int i = 3;
        i++;
        System.out.println(i); // "4"
        ++i;
        System.out.println(i); // "5"
        System.out.println(++i); // "6"
        System.out.println(i++); // "6"
        System.out.println(i); // "7"
    }
}

// ==  Equal to
// !=  Not equal to
// >   Greater than
// >=  Greater than or equal to
// <   Less than
// <=  Less than or equal to
class ComparisonDemo {
    public static void main(String[] args) {
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
    }
}

// &&  Conditional-AND
// ||  Conditional-OR
// ? : Ternary (shorthand for if-then-else statement)
class ConditionalDemo1 {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2)) {
            System.out.println("value1 is 1 AND value2 is 2");
        }
        if((value1 == 1) || (value2 == 1)) {
            System.out.println("value1 is 1 OR value2 is 1");
        }
    }
}

class ConditionalDemo2 {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;
        System.out.println(result);
    }
}

// instanceof is a binary operator used to test if an object is of a given type
// instanceof   Compares an object to a specified type
class InstanceofDemo {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Parent obj2 = new Child();
        System.out.println("obj1 instanceof Parent: " + (obj1 instanceof Parent));
        System.out.println("obj1 instanceof Child: " + (obj1 instanceof Child));
        System.out.println("obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface));
        System.out.println("obj2 instanceof Parent: " + (obj2 instanceof Parent));
        System.out.println("obj2 instanceof Child: " + (obj2 instanceof Child));
        System.out.println("obj2 instanceof MyInterface: " + (obj2 instanceof MyInterface));
    }
}
class Parent {}
class Child extends Parent implements MyInterface {}
interface MyInterface {}

// bitwise is hard to understand
// ~   Unary bitwise complement
// <<  Signed left shift
// >>  Signed right shift
// >>> Unsigned right shift
// &   Bitwise AND
// ^   Bitwise exclusive OR
// |   Bitwise inclusive OR
class BitDemo {
    public static void main(String[] args) {
        int bitmask = 0x000F;
        int val = 0x2222;
        System.out.println(val);
        System.out.println(bitmask);
        System.out.println(val & bitmask);
        System.out.println(val | bitmask);
        System.out.println(val ^ bitmask);
        System.out.println(val >>> 4);
        System.out.println(val << 4);
        System.out.println(val >> 4);
    }
}

