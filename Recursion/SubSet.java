
package Recursion;

/**
 * SubSet
 */
public class SubSet {

    public static void findSubSet(String str, String ans, int i) {

        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
                return;
            } else {
                System.out.println(ans);
                return;
            }

        }
        // yes
        findSubSet(str, ans + str.charAt(i), i + 1);

        // no
        findSubSet(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "ABC";
        findSubSet(str, "", 0);

    }
}