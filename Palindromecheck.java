import java.util.Scanner;

public class Palindromecheck {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word or phrase to check if it is a palindrome:");
        if (isPalindrome(scan.nextLine())) {
            System.out.println("Yes, it is a palindrome.");
        } else {
            System.out.println("No, it is not a palindrome.");
        }
    }

    /**
     * a function that calls the recursive palindrome checker function
     * @param str the string that is to be checked
     * @return true if the string is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String str) {
        // make sure the palindrome checker is case-insensitive
        str = str.toLowerCase();
        // call the recursive function
        return isPalindrome(0, str.length() - 1, str);
    }

    /**
     * a recursive function to determine if a string is a palindrome
     * @param i the first index starting from the beginning of the string, of the character being checked
     * @param j the second index starting from the end of the string, of the character being checked
     * @param str the string being checked
     * @return return false if two alphabetic characters are not equal when they should be, false if all characters examined
     */

    private static boolean isPalindrome(int i, int j, String str) {

        // check if done
        if (i >= j) return true;

        // check that the characters are alphabetic before comparing
        else if (!Character.isAlphabetic(str.charAt(i))) return isPalindrome(i + 1, j, str);

        else if (!Character.isAlphabetic(str.charAt(j))) return isPalindrome(i, j - 1, str);

        // check to see if the two letters are equal
        else if (str.charAt(i) != str.charAt(j)) return false;

        // move onto the next characters in the string
        else return isPalindrome(i + 1, j - 1, str);
    }

}
