package leetcodeProblems;

public class SubsetOfAnArray {
    static void subset(int[] arr){
        int n = arr.length;
        int limit = (int) Math.pow(2,n);
        for(int i = 0 ; i< limit;i++){
            String set = "";
            int temp = i;

            for(int j = arr.length-1;j>= 0; j--){
                int rem = temp % 2;
                temp = temp /2;

                if(rem == 0){
                    set = "" +set;
                }else {
                    set = arr[j]+set;
                }
            }
            System.out.println(set);

        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        subset(arr);
    }
}
