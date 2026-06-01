import java.util.*;

public class stringmanipulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("+============STRING MANIPULATION=================+");
            System.out.println("|0. Exit                                          |");
            System.out.println("|1. Search for a number                           |");
            System.out.println("|2. Repeat user input until correct password      |");
            System.out.println("|3. Find vowels and consonants in a paragraph     |");
            System.out.println("|4. Count specific number in a series             |");
            System.out.println("|5. Count of positive, negative and 0s in a series|");
            System.out.println("|6. Palindrome                                    |");
            System.out.println("|7. Reverse of a String                           |");
            System.out.println("|8. Reverse of a number                           |");
            System.out.println("+=================================================+");
            System.out.print("Enter choice: ");
            int choice = input.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting program...");
                    return;
                case 1:
                    searchnum(input);
                    break;
                case 2:
                    correctPass(input);
                    break;
                case 3:
                    vowelsCons(input);
                    break;
                case 4:
                    count(input);
                    break;
                case 5:
                    count2(input);
                    break;
                case 6:
                    isPalindrome(input);
                    break;
                case 7:
                    reverse(input);
                    break;
                case 8:
                    reverse2(input);
                    break;
                default:
                    System.out.println("INVALID CHOICE!");
            }
        }
    }

    public static void searchnum(Scanner input) {
        System.out.print("Enter the number you want to search: ");
        int n = input.nextInt();
        System.out.print("Enter how many numbers you will input: ");
        int j = input.nextInt();
        boolean found = false;

        for (int i = 1; i <= j; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();
            if (num == n) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number " + n + " found.");
        } else {
            System.out.println("Number " + n + " not found.");
        }
    }

    public static void correctPass(Scanner input) {
        input.nextLine(); // clear buffer
        String pass;
        do {
            System.out.print("Enter password: ");
            pass = input.nextLine();
        } while (!pass.equals("Secret123"));

        System.out.println("Access Granted!");
    }

    public static void vowelsCons(Scanner input) {
        input.nextLine(); // clear buffer
        int vowels = 0;
        int consonants = 0;
        System.out.print("Enter a string: ");
        String passage = input.nextLine().toLowerCase();

        for (int i = 0; i < passage.length(); i++) {
            char ch = passage.charAt(i);
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Total vowels: " + vowels);
        System.out.println("Total consonants: " + consonants);
    }

    public static void count(Scanner input) {
        int c = 0;
        System.out.print("Enter number you want to count: ");
        int num = input.nextInt();
        System.out.print("How many numbers will you enter: ");
        int count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();
            if (number == num) {
                c++;
            }
        }

        System.out.println("Number " + num + " appeared " + c + " times.");
    }

    public static void count2(Scanner input) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        System.out.print("How many numbers will you enter: ");
        int count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();
            if (number > 0)
                positive++;
            else if (number < 0)
                negative++;
            else
                zero++;
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);
    }

    public static void isPalindrome(Scanner input) {
        input.nextLine(); // clear buffer
        String reverse = "";
        System.out.print("Enter a string: ");
        String str = input.nextLine().replaceAll("\\s+", "").toLowerCase();

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (reverse.equals(str)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
    }

    public static void reverse(Scanner input) {
        input.nextLine(); // clear buffer
        String reverse = "";
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        System.out.println("Reversed string: " + reverse);
    }

    public static void reverse2(Scanner input) {
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        System.out.println("Reversed number: " + reverse);
    }
}
//DONSIESSSSSSS!!!!!!!!