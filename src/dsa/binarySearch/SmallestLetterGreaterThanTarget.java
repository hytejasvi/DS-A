package dsa.binarySearch;

public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c','d','f','j'};
        char target = 'j';
        char res = smallestLetterGreaterThanTarget(letters, target);
        System.out.println(res);
    }

    private static char smallestLetterGreaterThanTarget(char[] letters, char target) {
        if(target < letters[0] /*|| target >= letters[letters.length-1]*/) {
            return letters[0];
        }
        int left = 0, right = letters.length-1;
        while(left < right) {
            int mid = left+(right-left)/2;
            if(letters[mid] > target) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        System.out.println(left);
        return letters[left] > target ? letters[left] : letters[0];
    }
}
