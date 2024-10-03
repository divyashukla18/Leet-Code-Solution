class Solution {
    public static boolean isPalindrome(int x) {
        // If the number is negative or if it ends with 0 (but is not 0 itself), it can't be a palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        // Reverse the second half of the number
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // If the number has an odd number of digits, we can get rid of the middle digit by reversedHalf / 10
        // For example, when x is 12321, at the end of the loop we have x = 12, reversedHalf = 123,
        // so we remove the last digit from reversedHalf.
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));   // true
        System.out.println(isPalindrome(-121));  // false
        System.out.println(isPalindrome(10));    // false
        System.out.println(isPalindrome(1221));  // true
    }
}
