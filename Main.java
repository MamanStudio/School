import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        // question 1

        System.out.println("Please Enter a number: ");
        int num=scan.nextInt();
        if (num > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }

        // question 2

        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();
        if (num1 < num2) {
            System.out.println(num1 + " is smaller");
        } else {
            System.out.println(num2 + " is smaller");
        }

        // question 3

        System.out.println("Enter the first letter of your name: ");
        String letter1 = scan.next();
        System.out.println("Enter the second letter of your name: ");
        String letter2 = scan.next();
        System.out.println("Enter the first distance: ");
        int dis1 = scan.nextInt();
        System.out.println("Enter the second distance: ");
        int dis2 = scan.nextInt();
        System.out.println("Enter the first velocity: ");
        int v1 = scan.nextInt();
        System.out.println("Enter the second velocity: ");
        int v2 = scan.nextInt();
        if ((dis1 * v1) > (dis2 * v2)) {
            System.out.println(letter1 + " will arrive first");
        } else {
            System.out.println(letter2 + " will arrive first");
        }

        // question 4

        System.out.println("Enter the first grade: ");
        int grade1 = scan.nextInt();
        System.out.println("Enter the second grade: ");
        int grade2 = scan.nextInt();
        System.out.println("Enter the third grade: ");
        int grade3 = scan.nextInt();
        double averageGrade = (grade1 + grade2 + grade3) / 3.0;
        System.out.println("The average number is " + averageGrade);

        // question 5

        System.out.println("Enter the first number: ");
        int numOne = scan.nextInt();
        System.out.println("Enter the second number: ");
        int numTwo = scan.nextInt();
        System.out.println("Enter the third number: ");
        int numThree = scan.nextInt();
        if (numOne<numTwo && num1<numThree) {
            System.out.println(num1 + " is the smallest");
        } else if (numTwo<numOne && numTwo<numThree) {
            System.out.println(num2 + " is the smallest");
        } else if (numThree<numOne && numThree<numTwo) {
            System.out.println(numThree + " is the smallest");
        }


        // question 7
        System.out.println("Enter first number: ");
        int firstNum= scan.nextInt();
        System.out.println("Enter difference: ");
        int difference= scan.nextInt();
        int fifthNum= firstNum+(5-1)*difference;
        int tenthNum= firstNum+(10-1)*difference;
        System.out.println("The fifth number is :" + fifthNum);
        System.out.println("The tenth number is :" + tenthNum);

        // question 8
        int unit;
        int complete,remainder;
        System.out.println("Enter your number:");
        unit=scan.nextInt();
        if (unit > 0 && unit < 10) {
            System.out.println("" + 1.2 * unit);
        } else {
            if (unit == 10)
            {
                System.out.println(10);
            }
            else
            {
                if(unit > 10 && unit < 54)
                {
                    complete=unit/10;
                    remainder=unit%10;
                    System.out.println((10*complete)+(1.2*remainder));
                }
                else
                {
                    if(unit==54)
                    {
                        System.out.println(50);
                    }
                    else
                    {
                        if(unit>54&&unit<108)
                        {
                            complete=(unit-54)/10;
                            remainder=(unit-54)%10;
                            System.out.println(50+(complete*10)+(remainder*1.2));
                        }
                        else
                        {
                            if(unit==108)
                            {
                                System.out.println(100);
                            }
                            else
                            {
                                System.out.println("Error");
                            }
                        }
                    }
                }
            }
        }

        // question 9

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();
        System.out.println("What school are you in: ");
        String school = scan.nextLine();
        System.out.println("Enter the number of subjects you study: ");
        int subjects = scan.nextInt();
        System.out.printf("My name is %s, My school is %s, The number of subjects I study is %d.", fullName, school, subjects);

        // question 10
        System.out.print("Enter 3 digit number: ");
        int number = scan.nextInt();
        int digit1 = number / 100;
        int digit2 = (number % 100) / 10;
        int digit3 = number % 10;
        int digitsSum = digit1 + digit2 + digit3;
        System.out.println("The sum of the digits is: " + digitsSum);

    }
}