import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int testCases = Integer.parseInt(input.nextLine());

            for (int testcase = 0; testcase < testCases; testcase++) {
                String in = input.nextLine();
                String word1 = in.substring(0, in.indexOf("|"));
                String word2 = in.substring(in.indexOf("|") + 1);

                boolean isAnagram = true;

                if (word1.equals(word2)) {
                    isAnagram = false;
                } 
                else if (word1.length() != word2.length()) {
                    isAnagram = false;
                } 
                else {
                    char[] a1 = word1.toCharArray();
                    char[] a2 = word2.toCharArray();
                    Arrays.sort(a1);
                    Arrays.sort(a2);
                    isAnagram = Arrays.equals(a1, a2);
                }

                if (isAnagram) {
                    System.out.println(word1 + "|" + word2 + " - ANAGRAM");
                } else {
                    System.out.println(word1 + "|" + word2 + " - NOT AN ANAGRAM");
                }
            }
        }
    }
}
