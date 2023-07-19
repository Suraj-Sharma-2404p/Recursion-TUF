package leetcodeProblems;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum {


    public static void main(String[] args) {
        int[] arr = {3,1,2};
        ArrayList<Integer> ds = new ArrayList<>();
        int sum =0;
        int n = arr.length;
        int index = 0;
        doSum(index,arr,ds,sum,n);
        Collections.sort(ds);
        System.out.println(ds);

    }

    private static void doSum(int index, int[] arr, ArrayList<Integer> ds, int sum, int n) {
        if(index == n){
            ds.add(sum);
            return;
        }
        //if we choose the element
        doSum(index+1,arr,ds,sum +arr[index],n);

        //if we do not choose the element
        doSum(index+1,arr,ds,sum,n);

    }
}
