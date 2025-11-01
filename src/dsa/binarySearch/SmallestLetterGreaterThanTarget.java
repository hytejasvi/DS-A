package dsa.binarySearch;

public class SmallestLetterGreaterThanTarget {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length-1;
        int res = -1;
        while(start <= end) {
            int mid = (end + start)/2;
            if(letters[mid] > target) {
                res = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return res == -1 ? letters[0] : letters[res];
    }


    public static void main(String[] args) {
        char[] letters = {'x','x','y', 'y'};
        char target = 'z';
        char res = nextGreatestLetter(letters, target);
        System.out.println(res);
    }
}
