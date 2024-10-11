package LeetCodeContest.Contest412;

import java.util.Arrays;

public class Contest {
    public static void main(String[] args) {
        Contest contest = new Contest();

        //Final Array State After K Multiplication Operations I (Solved)
        int[] nums  = {2,1,3,5,6};
        System.out.println(Arrays.toString(contest.getFinalState(nums, 5, 2)));


        //Count Almost Equal Pairs I
        /*int[] nums = {565382,199505,145784,234283,887001,159100,770321,514131,159509,382865,119500,602410,965017,6673,513141,102460,147584,147584,642010,750188,66315,727120,513141,76603,592687,492736,880701,159100,246010,875569,66703,727021,531141};
        int count = 0;
        for (int i=0; i<nums.length-1; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if(contest.almostEqual(nums[i], nums[j]))
                    count++;
            }
        }
        System.out.println(count);*/
    }

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int i=0; i<k; i++) {
            int index = returnMinValueIndex(nums);
            nums[index] = nums[index] * multiplier;
        }
        return nums;
    }

    public int returnMinValueIndex(int[] nums) {
        int index = 0;
        int smallest = nums[0];
        for (int i=1; i<nums.length; i++) {
            if (nums[i] < smallest) {
                smallest = nums[i];
                index = i;
            }
        }
        return index;
    }

    public boolean almostEqual(int a, int b) {
        if (a == b) return true;
        if (a < 10 && b < 10) return false;
        boolean aIsGreater = a > b;
        String aString = String.valueOf(a);
        String bString = String.valueOf(b);
        for (int i=0; i < (aIsGreater ? aString.length()-1 : bString.length()-1) ; i++) {
            for (int j=i+1; j < (aIsGreater ? aString.length() : bString.length()); j++) {
                StringBuilder temp = aIsGreater ? new StringBuilder(aString) : new StringBuilder(bString);
                char tempChar = temp.charAt(i);
                temp.setCharAt(i, temp.charAt(j));
                temp.setCharAt(j, tempChar);
                if ((a > b ? bString : aString).contentEquals(temp)) return true;
                //if ((a > b ? bString : aString).equals(getValueWithoutZeros(temp))) return true;
                /*int tempInt = Integer.parseInt(new String(temp));
                int smallerInt = aIsGreater ? b : a;
                if (tempInt == smallerInt) return true;
                if (tempInt % smallerInt == 0) return true;*/
                if (Integer.parseInt(new String(temp)) % (Math.min(a, b)) == 0) return true;
            }
        }
        return false;
    }

    public String getValueWithoutZeros(StringBuilder stringBuilder) {
        String s = "";
        int startIndex = -1;
        int lastIndex = -1;
        for (int i=0; i< stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) != '0') {
                if (startIndex == -1)
                    startIndex = i;
                lastIndex = i;
            }
        }
        return stringBuilder.substring(startIndex, lastIndex+1);
    }
}
