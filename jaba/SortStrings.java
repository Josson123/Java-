public class SortStrings {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java SortStrings <string1> <string2> ...");
            return;
        }

        String[] strings = args;

        // Manual sorting using bubble sort
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = 0; j < strings.length - i - 1; j++) {
                if (strings[j].compareTo(strings[j + 1]) > 0) {
                    // Swap strings[j] and strings[j + 1]
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }

        // Output sorted strings
        System.out.println("Strings in alphabetical order:");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
