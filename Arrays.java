import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void ex1(int[] arr, int i) {
        if (arr.length > i) {
            System.out.println("Error");
        } else {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            } else {
                System.out.println(arr[i]+1);
            }
        }
    }

    public static void eq2() {
        int[] arr = { 0, 0, 0, 0, 0};
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length;i++) {
            arr[i] = scan.nextInt();
            sum+=arr[i];
        }
        System.out.println(sum/5);
    }

    public static void eq3() {
        int[] arr = { 0, 0, 0, 0, 0 };
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int lowestNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < lowestNum) {
                lowestNum = arr[i];
            }
        }
        System.out.println(lowestNum);
    }

    public static void eq4(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] % 2 == 1 && arr[i-1] % 2 == 1) {
                System.out.println(arr[i] + " " + arr[i-1]);
            }
        }
    }

    public static boolean eq5(int choice) {
        Random random = new Random();
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100-1) + 1;
            if (arr[i] == choice) {
                return true;
            }
        }
        return false;
    }

    public static void eq6() {
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
        }
        for (int i = 0; i < arr.length-1; i++) {
            if ((arr[i] + arr[i+1]) % 2 == 0)
            {
                System.out.println(arr[i] + " " + arr[i+1]);
            }
        }
    }

    public static void eq7() {
        int[] arr = new int[10];
        Random random = new Random();
        int biggestNumber = -2147483647;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt();
            if (biggestNumber < arr[i]) {
                biggestNumber = arr[i];
            }
        }
        arr[9] = biggestNumber;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int eq8(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int beforeSum = 0;
            int afterSum = 0;
            for (int j = 0; j <= i; j++) {
                beforeSum += arr[j];
            }
            for (int z = i;  z < arr.length; z++) {
                afterSum += arr[z];
            }
            if (beforeSum == afterSum) return i;
        }
        return -1;
    }

    public static int eq9(String[] arr, char c) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].charAt(j) == c) sum++;
            }
        }
        return sum;
    }
}
