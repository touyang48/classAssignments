import java.util.Scanner;


public class MainFile {

    public static void main(String args[]) {
        // scanner reads input from the command line through various methods
        Scanner scanner = new Scanner(System.in);

//      methodOne(20);
        System.out.println(methodTwo(25));

        // prompt and read a string
        System.out.print("Enter your name: ");
        String username = scanner.next();

        // prompt and read an int
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println(String.format("Hello %s, your age is %d", username, age));

        if (age >= 16) {
            System.out.println("You are old enough to drive");
        } else {
            System.out.println("You are not old enough to drive");
        }
        if (age >= 18) {
            System.out.println("You are old enough to vote");
        } else {
            System.out.println("You are not old enough to vote");
        }
        if (age >= 21) {
            System.out.println("You are old enough to drink");
        } else {
            System.out.println("You are not old enough to drink");
        }
        if (age >= 35) {
            System.out.println("You are old enough to be President");
        } else {
            System.out.println("You are not old enough to be President");
        }
        if (age >= 55) {
            System.out.println("You can join AARP");
        } else {
            System.out.println("You cannot join AARP");
        }
        if (age >= 67) {
            System.out.println("You can start drawing Social Security");
        } else {
            System.out.println("You cannot start drawing Social Security");
        }

        System.out.print("Employment Status:");
        String employed = scanner.next();

        switch (employed) {
            case "E":
            case "e":
                System.out.println("You are Employed.");
                break;

            case "U":
            case "u":
                System.out.println("You are Unemployed.");
                break;

            case "S":
            case "s":
                System.out.println("You are Students.");
                break;

            default:
                System.out.println("You are Unknown.");

        }

        System.out.print("Do you own a vehicle?");
        String vehicle = scanner.next();

        switch (vehicle) {
            case "C":
            case "c":
                System.out.println("You have a Car.");
                break;

            case "T":
            case "t":
                System.out.println("You have a Truck.");
                break;

            case "S":
            case "s":
                System.out.println("You have a SUV.");
                break;

            case "N":
            case "n":
                System.out.println("Do not own a vehicle.");
                break;
        }

        int[] myArray = new int[30];

        for (int i = 0; i < myArray.length; i++) myArray[i] = i;

        for (int twoArray : myArray)
            System.out.println("Enhanced for:" + twoArray);

        int third = 2;

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = third;
            third += 2;

            for (int twoArray : myArray)
                System.out.println("Enhanced for:" + twoArray);
        }

        for (int i = 29; i >= 0; i--) {
            System.out.print(myArray[i] + " ");

        }

        int i = 29;
        while (i >= 0) {
            System.out.print(myArray[i] + " ");
            i--;
        }

        i++;
        while (i < 30) {
            System.out.println(myArray[i] + " ");
            i++;
        }

        char ch;
        do {

            System.out.println("Enter your name: ");
            username = scanner.next();

            System.out.println("Enter your age: ");
            age = scanner.nextInt();

            System.out.println("Do you want to answer the question again? Enter 'y' or 'n' ");
            ch = scanner.next().charAt(0);

            System.out.println(String.format("Hello %s, your age is %d", username, age));
        } while (ch == 'y');
    }

//    public static void methodOne(int play) {
//        int[] myArray = new int[30];
//        for (int i = 0; i < myArray.length; i++) myArray[i] = i;
//
//        for(int eachIndex: myArray){
//            if (eachIndex == play) {
//                break;
//            }
//            if(eachIndex % 2 == 0) {
//                System.out.println(eachIndex);
//
//            } else if(eachIndex % 2 != 0) {
////                System.out.println(eachIndex);
//                continue;

    public static int methodTwo(int odd) {
        int[] myArray = new int[30];
        for (int i = 0; i < myArray.length; i++) myArray[i] = i;
        int evenSum = 0;

        for (int oddIndex : myArray) {
            if (oddIndex % 2 != 0) {
                System.out.println(oddIndex);
            } else if (oddIndex % 2 == 0) {
                evenSum += oddIndex;
            }
            if (oddIndex == odd) break;
        }
        return evenSum;


    }
}




