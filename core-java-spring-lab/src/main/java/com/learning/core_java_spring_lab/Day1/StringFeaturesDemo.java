package corejava.Day1;

public class StringFeaturesDemo {
    public static void main(String[] args) {
        String json = """
            {
              "name":"%s",
              "age":%d
            }""";
        String finalJson = json.formatted("Tejas", 30);
        System.out.println(finalJson);
        String s1 = "   \n";
        validateString(s1);
    }

    private static void validateString(String s1) {
        System.out.println("isBlank: "+s1.isBlank());//checks if the string has only white spaces or is actually blank (ie: only spaces)
        System.out.println("isEmpty: "+s1.isEmpty()); //checks if the length of string == 0
        System.out.println("strip: "+s1.strip());//removes all leading and trailing white spaces also removes unicode white spaces
        System.out.println("trim: "+s1.trim());//removes all leading and trailing white spaces
        String s2 = "Ha";
        System.out.println(s2.repeat(5)); // repeats the string with teh given count
    }
}
