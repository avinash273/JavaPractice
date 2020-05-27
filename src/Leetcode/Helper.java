package Leetcode;

public class Helper extends print {

    public static void main(String[] args) {
        /**
         * Was updating from Java8 to Java11, hence for version check.
         * System.out.println(System.getProperty("java.version"));
         * System.out.println(System.getProperty("java.runtime.version"));
         * System.out.println(System.getProperty("java.home"));
         * System.out.println(System.getProperty("java.vendor"));
         * System.out.println(System.getProperty("java.vendor.url"));
         * System.out.println(System.getProperty("java.class.path"));
         */

        System.out.println("Leetcode.Helper function to call all functionalities");
        /*
        //To get GCD
        EuclidGCD EuclidGCD = new EuclidGCD();
        System.out.println("GCD is " + EuclidGCD.getGCD(20, 4));

        //HashMap word count in String
        String sentence = "Hi I am avinash. What is your name again. I said I am avinash shanker. Sorry your name once more, its avinash. Okay!";
        HashMaps HashMaps = new HashMaps();
        System.out.println(HashMaps.wordCount(sentence));

        //Longest substring
        longestSubstring longestSubstring = new longestSubstring();
        longestSubstring.lengthOfLongestSubstring("pwwkew");

        //Leetcode.anagram
        anagram anagram = new anagram();
        anagram.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
         */

        //Binary Search
        BinarySearch BinarySearch = new BinarySearch();
        print("Binary Search");
        BinarySearch.doBinarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 8);

        //Sum of max K
        kMaxSum kMaxSum = new kMaxSum();
        print(kMaxSum.maxSum(new int[]{8, 2, 3, 4, 9, 6, 7, 1, 5}, 2));

        //Move Zeros
        moveZeros moveZeros = new moveZeros();
        print("print move zeros", moveZeros.moveZeros(new int[]{8, 0, 3, 0, 9, 0, 7, 1, 5}));

        //save boats
        saveBoats saveBoats = new saveBoats();
        print(saveBoats.saveBoats(new int[]{1, 1, 2, 2, 2, 2, 2, 3}, 3));
    }
}
