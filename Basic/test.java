package Basic;
import java.util.*;

public class test {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input N
        int n = sc.nextInt();

        // Input array elements and populate a HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Input target element
        int target = sc.nextInt();

        // Function call to find and print triplets using HashMap
        findTriplets(map, target);
    }

    static void findTriplets(HashMap<Integer, Integer> map, int target) {
        for (int num1 : map.keySet()) {
            for (int num2 : map.keySet()) {
                int num3 = target - num1 - num2;

                if (map.containsKey(num3)) {
                    // Check for duplicates
                    if ((num1 < num2 && num2 < num3)) {
                        // Print the triplet
                        System.out.println(num1 + ", " + num2 + " and " + num3);
                    }
                }
            }
        }
    }

}