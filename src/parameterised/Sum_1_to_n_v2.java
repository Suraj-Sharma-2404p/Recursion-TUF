package parameterised;

public class Sum_1_to_n_v2 {
	static void sum(int i , int n) {
		if(i > n) {
			System.out.println(i);
			return;
		}else {
			sum(i+1,n);
		}
	}
	public static void main(String[] args) {
		sum(1,3);
	}

}
