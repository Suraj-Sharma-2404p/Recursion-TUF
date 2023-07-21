package leetcodeProblems;

import java.util.ArrayList;

class CombinationSum1 {

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;
        CombinationSum1 sol = new CombinationSum1();
        ArrayList<ArrayList<Integer>> ls = sol.combinationSum(arr, target);
        System.out.println("Combinations are: ");
        System.out.println(ls);

    }

    private void findCombinations(int ind, int[] arr, int target, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> ds) {
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombinations(ind, arr, target - arr[ind], ans, ds);
            ds.remove(ds.size() - 1);
        }
        findCombinations(ind + 1, arr, target, ans, ds);
    }

    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
}
