package leetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    private static void findCombination(int index, int[] arr, int target, List<List<Integer>> ans,List<Integer>ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i = index;i <arr.length;i++){
            if (i > index && arr[i] == arr[i-1]) continue;   //very important other duplicates subsets are also printed used to skip recursion.
            if (arr[i]>target) break;
            ds.add(arr[i]);
            findCombination(i+1,arr,target-arr[i],ans,ds);
            ds.remove(ds.size()-1);
        }
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(0,candidates,target,ans,new ArrayList<>());
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2};
        System.out.println(combinationSum2(arr,4));
    }
}
