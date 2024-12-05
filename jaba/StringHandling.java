public class StringHandling {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java StringHandling <string1> <string2>");
            return;
        }

        String str1 = args[0];
        String str2 = args[1];

        // Length
        System.out.println("Length of String 1: " + str1.length());
        System.out.println("Length of String 2: " + str2.length());

        // Concatenation
        System.out.println("Concatenation: " + str1.concat(str2));

        // Character Extraction
        System.out.println("Character at index 2 in String 1: " + str1.charAt(2));

        // String Comparison
        System.out.println("Are strings equal? " + str1.equals(str2));
        System.out.println("Comparison ignoring case: " + str1.equalsIgnoreCase(str2));

        // String Index
        System.out.println("Index of 'a' in String 1: " + str1.indexOf('a'));

        // Substring
        System.out.println("Substring of String 1 from index 1 to 4: " + str1.substring(1, 4));

        // Replace
        System.out.println("Replacing 'a' with 'x' in String 1: " + str1.replace('a', 'x'));

        // Lowercase and Uppercase
        System.out.println("String 1 in lowercase: " + str1.toLowerCase());
        System.out.println("String 1 in uppercase: " + str1.toUpperCase());

        // Trim
        String str3 = "   Trimmed String   ";
        System.out.println("Original: [" + str3 + "]");
        System.out.println("Trimmed: [" + str3.trim() + "]");
    }
}
