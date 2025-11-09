package TwoPointers;

public class String_Compression {
    public static void main(String[] args) {
        char[] c = {'a','a','b','b','c','c','c'};
        int res = compress(c);
        for(int i=0;i< res;i++) {
            System.out.println(c[i]);
        }
    }

    private static int compress(char[] chars) {
        int index = 0; // Position to write in chars array
        int left = 0; // Pointer to traverse the array

        while (left < chars.length) {
            char currentChar = chars[left];
            int count = 0;

            // Count consecutive repeating characters
            while (left < chars.length && chars[left] == currentChar) {
                count++;
                left++;
            }

            // Write the character
            chars[index++] = currentChar;

            // Write the count if greater than 1
            if (count > 1) {
                // Convert count to string and write each digit
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}
