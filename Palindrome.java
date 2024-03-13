import java.util.Stack;

public class Main {

    public static boolean isPalindrome(String inputString) {
        Stack<Character> charStack = new Stack<>();
        fillStack(inputString, charStack);
        return inputString.equalsIgnoreCase(buildReverse(charStack));
    }

    private static void fillStack(String inputString, Stack<Character> charStack) {
        for (int i = 0; i < inputString.length(); i++) {
            charStack.push(inputString.charAt(i));
        }
    }

    private static String buildReverse(Stack<Character> charStack) {
        StringBuilder result = new StringBuilder();

        while (!charStack.isEmpty()) {
            result.append(charStack.pop());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String[] testCases = {
                "A",
                "level",
                "hello world",
                "No 'x' in Nixon",
                "racecar",
                "radar",
                "A man a plan a canal Panama",

        };

        for (String testCase : testCases) {
            System.out.println("Is \"" + testCase + "\" a palindrome? " + isPalindrome(testCase));
        }
    }
}