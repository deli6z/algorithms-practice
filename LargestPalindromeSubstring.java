public class LargestPalindromeSubstring {
    //String reversed;

    public static void main(String[] args) {
        String original = "abcwecba";
        char[] chars = original.toCharArray();
        String reversed = "";

        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i];
        }
        int length = original.length();
        int j = length - 1;
        String palindrome1 = "";
        for (int i = 0; i <= original.length(); i++) {
            if (original.indexOf(reversed.substring(i + 1, length)) != -1) {
                palindrome1 = reversed.substring(i + 1, length);
                break;
            }
            if (original.indexOf(reversed.substring(0, j - 1)) != -1) {
                palindrome1 = reversed.substring(0, j - 1);
                break;
            }
            j--;
        }

        j = length;
        String palindrome2 = "";
        for (int i = 0; i <= original.length(); i++) {
            if (original.indexOf(reversed.substring(i, j)) != -1) {
                palindrome2 = reversed.substring(i, j);
                break;
            }
            j--;
        }

        if (palindrome1.length() > palindrome2.length()) {
            System.out.println(palindrome1);
        } else {
            System.out.println(palindrome2);
        }

    }
}
