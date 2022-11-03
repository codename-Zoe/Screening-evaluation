import java.util.*;

public class CandyDivision {
	
	public static int[] divide_candy(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				list.add(i-1);
			}
		}
		
		int[] result = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}

	public static void main(String[] args) {
		int n = 25;
		System.out.println(divide_candy(n).toString());
	}

}
