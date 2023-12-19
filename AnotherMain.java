import java.util.Scanner;

public class AnotherMain {
    public static void warmup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        if (num % 5 == 0) System.out.println("it does");
        else System.out.println("it doesn't");
    }

    public static void q1() {
        Scanner scanner = new Scanner(System.in);
        String kid1 = scanner.next();
        String kid2 = scanner.next();
        String kid3 = scanner.next();

        if (kid1.compareTo(kid2) < 0 && kid2.compareTo(kid3) < 0) {
            System.out.println(kid1 + " " + kid2 + " " + kid3);
        } else if (kid2.compareTo(kid1) < 0 && kid1.compareTo(kid3) < 0) {
            System.out.println(kid2 + " " + kid1 + " " + kid3);
        } else if (kid3.compareTo(kid1) < 0 && kid1.compareTo(kid2) < 0) {
            System.out.println(kid3 + " " + kid1 + " " + kid2);
        } else if (kid2.compareTo(kid3) < 0 && kid3.compareTo(kid2) < 0) {
            System.out.println(kid2 + " " + kid3 + " " + kid1);
        } else if (kid3.compareTo(kid2) < 0 && kid2.compareTo(kid1) < 0) {
            System.out.println(kid3+ " " + kid2 + " " + kid1);
        } else if (kid1.compareTo(kid3) < 0 && kid3.compareTo(kid2) < 0) {
            System.out.println(kid1+ " " + kid3 + " " + kid2);
        }
        System.out.println("HEY");
    }

    public static void q2() {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println(sentence.length());
    }

    public static void q3() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        if (word.charAt(0) == word.charAt(2)) {
            System.out.println("Palindrom");
        } else {
            System.out.println("Not a palindrom");
        }
    }

    public static void q4() {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(word.charAt(2) + "" + word.charAt(1) + word.charAt(0));
    }
}