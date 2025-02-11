package week01Day02;

public class LearnOperators {
    public static void main(String[] args) {
        //Arithmetic Operators
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Addition of a and b is: " + c);
        int d = a - b;
        System.out.println("Subtraction of a and b is: " + d);
        int e = a * b;
        System.out.println("Multiplication of a and b is: " + e);
        int f = b / a;
        System.out.println("Division of a and b is: " + f);
        int g = b % a;
        System.out.println("Modulus of a and b is: " + g);

        //Relational Operators
        System.out.println("a is equal to b: " + (a == b));
        System.out.println("a is not equal to b: " + (a != b));
        System.out.println("a is greater than b: " + (a > b));
        System.out.println("a is less than b: " + (a < b));
        System.out.println("a is greater than or equal to b: " + (a >= b));
        System.out.println("a is less than or equal to b: " + (a <= b));

        //Logical Operators
        boolean h = true;
        boolean i = false;
        System.out.println("h && i: " + (h && i));
        System.out.println("h || i: " + (h || i));
        System.out.println("!(h && i): " + !(h && i));

        //Assignment Operators
        int j = 10;
        int k = 20;
        j += k;
        System.out.println("j += k: " + j);
        j -= k;
        System.out.println("j -= k: " + j);
        j *= k;
        System.out.println("j *= k: " + j);
        j /= k;
        System.out.println("j /= k: " + j);
        j %= k;
        System.out.println("j %= k: " + j);

        //Unary Operators
        int l = 10;
        int m = 20;
        int n = 0;
        System.out.println("l++: " + l++);
        System.out.println("++m: " + m++);

        int t = 2;
        System.out.println(t++ + t-- + ++t);

    }
}
