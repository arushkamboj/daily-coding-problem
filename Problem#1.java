import java.util.HashSet;
import java.util.Set;

/* * *
* This problem was recently asked by Google.

* Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

* For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

* Bonus: Can you do this in one pass?
*
*  */
public class dcpFirst {
    private static boolean findSolution(int[] input, int k){
        Set<Integer> inputSet = new HashSet<Integer>();

        for(int num : input) {
            int diff = k - num;
            if(inputSet.contains(diff)) {
                return true;
            } else {
                inputSet.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args){
        dcpFirst dcp = new dcpFirst();

        int[] input = {10,15,5,9,7};
        int k = 10;

        boolean result = dcp.findSolution(input, k);
        if(result) {
            System.out.println("Pair Exists!");
        } else {
            System.out.println("Pair Does Not Exists!");
        }
    }
}
