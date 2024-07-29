package LeetCode;
import java.util.*;

// https://leetcode.com/problems/two-sum/solutions/3918161/java-1ms-brute-force-hashtable-approach/

//Approach 1 --> Brute force
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        int a[] =new int[2];
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i]+nums[j]==target){
//                    a[0]=i;
//                    a[1]=j;
//                    break;
//                }
//            } 
//        }
//        return a;
//    }
// }

//Approach 2 --> HashTable
class LC_01_Two_Sum{
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer, Integer> num = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int left = target - nums[i];
            if(num.containsKey(left)){
                return new int[]{num.get(left),i};
            }
            num.put(nums[i],i);
        }
        return new int[]{};
    }
}

