package leetcodeProblems;

import java.util.ArrayList;

public class AllPermutationOfAnArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        ArrayList<Integer> ds = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        permutations(nums,ds,ans,freq);
        System.out.println(
                ans

        );
    }

    private static void permutations(int[] nums, ArrayList<Integer> ds, ArrayList<ArrayList<Integer>> ans, boolean[] freq) {
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0 ; i < nums.length ;i++){
            if (!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                permutations(nums,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }

    }
}
