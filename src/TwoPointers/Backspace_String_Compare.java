package TwoPointers;

public class Backspace_String_Compare {
    public static void main(String[] args) {
        String s = "a##c";
        String t = "ac";
        boolean res = backspaceCompare(s, t);
        System.out.println(res);
    }
/*
* Use two pointers starting from the end of each string.
Track how many characters to skip using skipS and skipT.
Move the pointers left, skipping characters as needed.
Compare the current valid characters. If they differ, return false.
If one string ends before the other, return false.
If both pointers reach the beginning together, return true.
* */
    private static boolean backspaceCompare2(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        int skipS = 0 , skipT = 0;

        while(i >= 0 || j >= 0) {
            while(i >= 0) {
                if (s.charAt(i) == '#') {
                    skipS++;
                    i--;
                }
                else if (skipS > 0) {
                    skipS--;
                    i--;
                }
                else break;
            }

            while(j >= 0) {
                if (t.charAt(j) == '#') {
                    skipT++;
                    j--;
                }
                else if (skipT > 0) {
                    skipT--;
                    j--;
                }
                else break;
            }

            if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) return false;
            if ((i >= 0) != (j >= 0)) return false;

            i--;
            j--;
        }
        return true;
    }

    private static boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder t1 = new StringBuilder();
        int i=0;
        for(char c: s.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                s1.append(c);
                i++;
            } else {
                if(i>0) {
                    s1.deleteCharAt(i - 1);
                    i--;
                }
            }
        }
        System.out.println(s1);
        int j=0;
        for(char c: t.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                t1.append(c);
                j++;
            } else {
                if(j >0) {
                    t1.deleteCharAt(j - 1);
                    j--;
                }
            }
        }
        return s1.toString().contentEquals(t1);
    }
}
