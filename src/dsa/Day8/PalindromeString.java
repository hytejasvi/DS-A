package dsa.Day8;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        //String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        String s2 = s.replaceAll("//s+", "").replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int left = 0, right = s2.length()-1;
        while(left < right) {
            if(s2.charAt(left) != s2.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
