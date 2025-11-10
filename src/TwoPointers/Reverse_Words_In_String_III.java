package TwoPointers;

public class Reverse_Words_In_String_III {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String res = reverseWords(s);
        System.out.println(res);
    }

    private static String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(String s2: s1) {
            StringBuilder sb = new StringBuilder(s2);
            res.append(sb.reverse()).append(" ");
        }
        return res.toString().trim();
    }
}
