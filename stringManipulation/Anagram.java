package stringManipulation;


public class Anagram {

    public static boolean areAnagrams(String str1, String str2) {
        // Check if lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Assuming ASCII characters (you can use a larger array for Unicode)
        int[] frequency = new int[256];

        // Increment frequency for characters in str1
        for (char ch : str1.toCharArray()) {
            frequency[ch]++;
        }

        // Decrement frequency for characters in str2
        for (char ch : str2.toCharArray()) {
            frequency[ch]--;
        }

        // Check if all frequencies are zero
        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";

        if (areAnagrams(str1, str2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");
        }
    }
}
