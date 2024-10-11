package LeetCodeContest.c417;

import java.util.HashSet;
import java.util.Set;

public class contest {
    /*public char kthCharacter(int k) {
        StringBuilder s = new StringBuilder("a");
        if (k == 1) return 'a';
        while (s.length() < k) {
            StringBuilder temp = new StringBuilder(s);
            for (int i=0; i<s.length(); i++) {
                if (s.charAt(i) == 'z') {
                    temp.setCharAt(i, 'a');
                }
                else {
                    temp.setCharAt(i, (char) (s.charAt(i) + 1));
                }
            }
            s.append(temp);
        }
        return s.charAt(k-1);
    }*/

    public char kthCharacter(int k) {
        return findKthCharacter(k, 0);
    }

    // Recursive helper function
    private char findKthCharacter(int k, int depth) {
        // Base case: if k == 1, return 'a' as the first character of any sequence is 'a'
        if (k == 1) return (char) ('a' + depth);

        // Calculate the length of the sequence at the current depth
        int length = 1 << depth; // 2^depth

        // If k is greater than the first half, move to the next half of the sequence
        if (k <= length) {
            return findKthCharacter(k, depth + 1);
        } else {
            // k is in the second half, map it to the first half
            return findKthCharacter(k - length, depth + 1);
        }
    }


    public int countOfSubstrings(String word, int k) {
        int count = 0;
        for (int i=0; i<= word.length()-5+k; i++) {
            int consonantcount = 0;
            Set<Character> vowels = new HashSet<>();
            vowels.add('a');
            vowels.add('e');
            vowels.add('i');
            vowels.add('o');
            vowels.add('u');
            for (int j=i; j<word.length(); j++) {
                if (word.charAt(j) == 'a' || word.charAt(j) == 'e' || word.charAt(j) == 'i' || word.charAt(j) == 'o' || word.charAt(j) == 'u') {
                    vowels.remove(word.charAt(j));
                } else {
                    consonantcount++;
                }
                if (consonantcount == k && vowels.isEmpty()) {
                    count++;
                }
                if (consonantcount > k) {
                    break;
                }
            }
        }
        return count;
    }
}
