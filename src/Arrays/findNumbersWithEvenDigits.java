package Arrays;

public class findNumbersWithEvenDigits {
    public static void main (String []args) {
        int [] nums = {555,901,482,1771};
        int evenDigits = 0;
        for (int i=0;i<nums.length;i++) {
            int count = 0;
            while(nums[i] > 0) {
                count ++;
                nums[i] = nums[i]/10;
            }
            if (count%2 == 0) {
                evenDigits ++;
            }
        }
        System.out.println(evenDigits);
    }
}
