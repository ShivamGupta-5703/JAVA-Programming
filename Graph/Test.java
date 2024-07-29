package Graph;

import java.util.*;
public class Test {
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            char[] word = sc.next().toCharArray();
            int length = word.length;
            ArrayList<Character> f = new ArrayList<>();
            Stack<Integer> upper = new Stack<>();
            Stack<Integer> lower = new Stack<>();
            for (int keys = 0; keys < length; keys++) {
                if (word[keys] == 'b') {
                    if (!lower.isEmpty()) {
                        f.set(lower.pop(), '\0');
                    }
                } else if (word[keys] == 'B') {
                    if (!upper.isEmpty()) {
                        f.set(upper.pop(), '\0');
                    }
                } else {
                    if (word[keys] >= 'a') {
                        lower.push(f.size());
                        f.add(word[keys]);
                    } else {
                        upper.push(f.size());
                        f.add(word[keys]);
                    }
                }
            }
            for (char j : f) {
                if (j != '\0') {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
 