package LeetcodeAmazon;

import java.util.Arrays;

public class shortestDistanceToCharacter {
    class Solution {
        public int[] shortestToChar(String S, char C) {
            int strLen = S.length();
            int[] result = new int[strLen];
            if (S == null || strLen == 0)
                return result;

            int i = 0;
            Arrays.fill(result, Integer.MAX_VALUE);

            while (i < strLen) {
                if (S.charAt(i) == C) {
                    result[i] = 0;
                    int j = 0;
                    while (j < strLen) {
                        result[j] = Math.min(result[j], Math.abs(i - j));
                        j++;
                    }
                }
                i++;
            }
            return result;
        }
    }
}
