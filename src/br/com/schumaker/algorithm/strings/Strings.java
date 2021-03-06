
package br.com.schumaker.algorithm.math;

import java.util.stream.IntStream;

/**
 *
 * @author hudson schumaker
 */
public final class Strings {
    
    public enum Sort {
        ASC, DESC
    }

    private Strings() {
        throw new AssertionError("Cannot be instantiated");
    }
    
    public static void sortArrayByLength(String[] strs, Sort direction) {
        if (strs == null || direction == null || strs.length == 0) {
            // or throw IllegalArgumentException
            return;
        }

        if (direction.equals(Sort.ASC)) {
            Arrays.sort(strs, Comparator.comparingInt(String::length));
        } else {
            Arrays.sort(strs, Comparator.comparingInt(String::length).reversed());
        }
    }
    
    public static String removeWhiteSpaces(String str) {
        if (str == null || str.isEmpty()) {
            // or throw IllegalArgumentException
            return "";
        }
        return str.replaceAll("\\s", "");
    }

    public static boolean isPalindromeV1(String str) {
        if (str == null || str.isBlank()) {
            // or throw IllegalArgumentException
            return false;
        }

        int left = 0;
        int right = str.length() - 1;

        while (right > left) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static boolean isPalindromeV2(String str) {
        if (str == null || str.isBlank()) {
            // or throw IllegalArgumentException
            return false;
        }

        int n = str.length();

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindromeV3(String str) {
        if (str == null || str.isBlank()) {
            // or throw IllegalArgumentException
            return false;
        }

        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static boolean isPalindromeV4(String str) {
        if (str == null || str.isBlank()) {
            // or throw IllegalArgumentException
            return false;
        }

        return IntStream.range(0, str.length() / 2)
                .noneMatch(p -> str.charAt(p) != str.charAt(str.length() - p - 1));
    }
}
