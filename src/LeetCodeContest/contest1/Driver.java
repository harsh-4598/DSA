package LeetCodeContest.contest1;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Arrays.sort(new Integer[]{1,2,3,4,5},Comparator.reverseOrder());
        /*int[][] grid = {{0,1,2}, {3,4,5},{6,7,8}};
        NeighborSum n = new NeighborSum(grid);
        System.out.println(n.adjacentSum(5));
        System.out.println(n.diagonalSum(8));*/
        /*int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));*/
        String [] message =  {"hello","world","leetcode"};
        String [] bannedWords  =  {"world","hello"};
        System.out.println(reportSpam(message, bannedWords));

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeSum;
        Set<List<Integer>> set = new HashSet<>();
        for (int i=0; i<nums.length-2; i++) {
            for (int j=i+1; j<nums.length-1; j++) {
                int sum = 0;
                for (int k=j+1; k<nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0) {
                        List<Integer> l = new ArrayList<>(List.of(nums[i], nums[j], nums[k]));
                        Collections.sort(l);
                        set.add(l);
                    }
                }
            }
        }
        return threeSum =new ArrayList<>(set);
    }


    public static   boolean reportSpam(String[] message, String[] bannedWords) {
        if (message.length < 2) return false;
        //boolean reportSpam = false;
        int countSpam = 0;
        //size - O(length of banned words)
        Set<String> set = new HashSet<>();
        //time - O(length of banned words)
        Collections.addAll(set, bannedWords);
        //time - O(length of message)
        for (String mes : message) {
           if (set.contains(mes))
               countSpam++;
           if (countSpam == 2)
               return true;
        }
        return false;
    }




}
