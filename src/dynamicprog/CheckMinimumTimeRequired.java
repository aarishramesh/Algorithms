package dynamicprog;

/**
 * Problem : Minimum time required to finish tasks such that two consecutive tasks cannot be skipped
 * 
 * Solution : Dynamic programming is employed
 * 
 * Space complexity: O(1)
 * Time complexity: O(N)
 * 
 *
 */
public class CheckMinimumTimeRequired {
    public static void main(String[] args) {
        int[] testArr = {5, 4, 2, 1, 10};
        int inc = testArr[0];
        int exc = 0;
        int incNew = 0; 
        for (int i = 1; i < testArr.length; i++) {
            incNew = testArr[i] + Math.min(inc, exc);
            exc = inc;

            inc = incNew;
        }
        System.out.println("Minimum time meeting the condition :: " + Math.min(inc, exc));
    }
}
