public class Main {

    public static void main(String[] args) {
        int firstInt = 6;
        int secondInt = 20;
        int thirdInt;
        float floating = 4.4f;
        boolean isCold = false;
        double space = 100_000_000.00;

        System.out.println(firstInt);
        System.out.println(secondInt);
        System.out.println(thirdInt);
        System.out.println(floating);
        System.out.println(isCold);
        System.out.println();

        /////////////////////////////////// Lab 2

        int totalOneAndTwo = firstInt + secondInt;
        System.out.println(totalOneAndTwo);

        int totalOneAndThree = firstInt + thirdInt;
        System.out.println(totalOneAndThree);

        System.out.println(firstInt / secondInt);

        System.out.println(firstInt % secondInt);

        int firstIntAndRemainder = firstInt + firstInt % secondInt;

        /////////////////////////////////// Lab 3

        int x = 100;
        boolean D = (x == 100);
        int y = 106;
        System.out.println(x > y);
        System.out.println(y > x);
        System.out.println(x >= y - 6);
        int z = 92;
        System.out.println(x < y < z);
        System.out.println((y > z) && (x >= y));
        System.out.println((z > y + x) && (x - y > z));

        /////////////////////////////////// Lab 4

        int n = 64;
        System.out.println((n >> 1) == n / 2);
        System.out.println((n << 1) == n * 2);

        n = n - 24;
        System.out.println((n >> 1) == n / 2);
        System.out.println((n << 1) == n * 2);

        /////////////////////////////////// Lab 5 & 6

    }

    public static void anotherMethod() {
        int method = 434;
        Integer new = 1000;

        if (method > 1000) {
            System.out.println(n + "Big Value");

            int divided = method / 2;
        } else () {
            System.out.println(divided);

        }

        /////////////////////////////////// Lab 7
        public static void playWithStrings () {
            String firstName = "Tou";
            String lastName = String.valueOf("Yang");
            System.out.println("Hello ".concat(firstName).concat(" ").concat(lastName));
            System.out.println("Hello " + firstName + " " + lastName);
            String fullName = String.valueOf(firstName.concat(" ").concat(lastName));
            System.out.println(String.format("We will be working with %s", fullName));
            System.out.println(String.format("The total length of the string %s is %d", fullName, fullName.length()));
            System.out.println(String.format("Index of the first 'o' is %d", fullName.indexOf("o")));
            System.out.println(String.format("Letter at Position 7 is %s", fullName.charAt(7)));
            System.out.println(String.format("Does it contain \"son\": %b", fullName.contains("son")));
            System.out.println(String.format("Last 4 letters of this string is: %s", fullName.substring(fullName.length() - 5)));
            System.out.println(String.format("Does the name contain an \' or a -: %b", (fullName.contains("'") || fullName.contains("-"))));

        }
    }
}


