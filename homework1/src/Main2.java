import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String word1 = sc.next();
        System.out.print("Enter the second word: ");
        String word2 = sc.next();
        sc.close();

        int word1Length = word1.length();
        int word2Length = word2.length();

        if (word1Length % 2 != 0 || word2Length % 2 != 0) {
            System.out.println("Both words must have an even number of letters.");
        } else {
            int halfLength = word1Length / 2;
            String firstHalfWord1 = word1.substring(0, halfLength);
            String secondHalfWord2 = word2.substring(halfLength);

            String newWord = firstHalfWord1 + secondHalfWord2;
            System.out.println("The new word is: " + newWord);
        }
    }
}