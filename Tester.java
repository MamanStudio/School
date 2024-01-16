import java.util.Random;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

    }

    public static void q1(String name) {
        System.out.println("Hello " + name);
    }

    public static void q2(int number) {
        System.out.println(number/5);
    }

    public static float q3(float num1, float num2) {
        return num1*num2;
    }

    public static float q4(float num1, float num2, float num3) {
        System.out.println("Sum of all numbers: " + (num1+num2+num3));
        return (num1+num2+num3)/3;
    }

    public static void q5(int radius) {
        final double PI = 3.14;
        System.out.println("parimeter: " + (2*PI*radius));
        System.out.println("size: " + (PI*(radius*radius)));
    }

    public static double q6(int side1, int side2) {
        int side3Squared = (side1*side1) + (side2*side2);
        return Math.sqrt(side3Squared);
    }

    public static void q7(char first, char second, char third) {
        System.out.println(first + "" + second + "" + third);
    }

    public static int q8(int firstNum, int diff, int target) {
        return (firstNum + (diff-1)*target);
    }

    public static double q9(String str) {
        return Math.sqrt((str.length()));
    }

    public static String q10(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return str1;
        } else if (str2.length() > str1.length()) {
            return str2;
        } else {
            return "They are the same length";
        }
    }

    public static boolean q11(int number, String str) {
        return (str.length() == number);
    }

    public static boolean q12() {
        Random random = new Random();
        int num1 = random.nextInt(6-1) + 1;
        int num2 = random.nextInt(6-1) + 1;
        return (num1 == num2);
    }

    public static boolean q13(char c, String str) {
        for (int i = 0; i < 4; i++) {
            if (str.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }
}
