package Arrays;

public class findMaxConsecutiveOnes {
    public static void main (String []args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int consecutive = 0;
        int maxconsecutive = 0;
        for (int num : nums) {
            if (num == 1) {
                consecutive += 1;
                if (consecutive > maxconsecutive) {
                    maxconsecutive = consecutive;
                }
            } else {
                consecutive = 0;
            }
        }
        System.out.println("MaxConsecutiveOnes: "+maxconsecutive);
    }
}
