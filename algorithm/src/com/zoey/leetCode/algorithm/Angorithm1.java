package com.zoey.leetCode.algorithm;

import java.util.*;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Angorithm1 {
    public static void main(String[] args) {
        int[] nums=new int[]{2,7,11,15};
        int target=9;
        int[] result=twoSum(nums,target);
        for (int i : result) {
            System.out.println(result[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
//        int[] result=new int[2];
//        Map<Integer,Integer> map=new LinkedHashMap<>();
//        for (int i=0;i<nums.length;i++) {
//           map.put(i,nums[i]);
//        }
//        for(Map.Entry<Integer,Integer> value : map.entrySet()){
//            int diff=target-value.getValue();
//            Optional<Map.Entry<Integer,Integer>> diffVaule= map.entrySet().stream().filter((e)->e.getValue()==diff&&e.getKey()!=value.getKey()).findFirst();
//            if(diffVaule.isPresent()){
//                System.out.println(diffVaule.get());
//                result[0]=value.getKey();
//                result[1]=diffVaule.get().getKey();
//            }
//        }
//        return result;
    }
    public static int[] twoSum1(int[] nums, int target) {
        int[] result=new int[2];
        List<int[]> list=Arrays.asList(nums);
        for (int i=0;i<nums.length;i++) {
            int num=nums[i];
            int diff=target-num;
            for(int j=i+1;j<nums.length;j++){
                int num2=nums[j];
                if(diff==num2){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
}
