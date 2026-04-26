package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] sum = twoSum(nums,target);
        for (int i:sum){
            System.out.print(i +" ");
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int constraint = target-nums[1];
            if(map.containsKey(constraint)){
                return new int[]{map.get(constraint),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
