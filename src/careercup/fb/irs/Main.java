package careercup.fb.irs;

public class Main {

    private static final String SPACE = " ";

    // http://www.careercup.com/question?id=5717567253512192
    public static void main(String[] args) {
        String input = "We wish you a merry Christmass";
        String reversedString = reverseString(input);
        String output = reverseWords(reversedString);
        System.out.println(output);
    }

    private static String reverseString(String input) {
        char[] inputAsArray = input.toCharArray();
        int start = 0, end = inputAsArray.length - 1;
        reverse(start, end, inputAsArray);
        return new String(inputAsArray);
    }

    private static String reverseWords(String reversed) {
        char[] reversedAsArray = reversed.toCharArray();
        int startIndex = 0;
        int endIndex = reversed.indexOf(SPACE);
        final int lastSpace = reversed.lastIndexOf(SPACE);
        while (endIndex != -1) {
            reverse(startIndex, endIndex - 1, reversedAsArray);
            startIndex = ++endIndex;
            if (startIndex - 1 == lastSpace) {
                endIndex = reversed.length();
            } else {
                endIndex = reversed.indexOf(SPACE, startIndex);
            }
        }
        return new String(reversedAsArray);
    }

    private static void reverse(int start, int end, char[] inputAsArray) {
        while (start < end) {
            char temp = inputAsArray[start];
            inputAsArray[start] = inputAsArray[end];
            inputAsArray[end] = temp;
            start++;
            end--;
        }
    }

}
