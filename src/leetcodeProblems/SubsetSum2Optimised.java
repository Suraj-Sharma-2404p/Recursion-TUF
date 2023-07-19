package leetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSum2Optimised {


    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        List<List<Integer>> ans = subsetsWithDup(arr);
        System.out.println(ans);
    }

    public static void findSubsets(int ind, int[] arr, List<Integer> ds, List<List<Integer>> ansList) {
        ansList.add(new ArrayList<>(ds));
        for (int i = ind; i < arr.length; i++) {
            if (i != ind && arr[i] == arr[i - 1]) continue;
            ds.add(arr[i]);
            findSubsets(i + 1, arr, ds, ansList);
            ds.remove(ds.size() - 1);
        }

    }

    public static List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ansList = new ArrayList<>();
        findSubsets(0, arr, new ArrayList<>(), ansList);
        return ansList;
    }
}
