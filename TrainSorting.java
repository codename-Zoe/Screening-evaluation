import java.util.*;

public class TrainSorting {
	
	public static int trainSorting(int n, int[] trains) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(trains[0]);
		
		for(int i = 1; i < n; i++) {
			if(trains[i] > list.get(0)) {
				list.add(0, trains[i]);
			}else if(trains[i] < list.get(0)) {
				list.add(list.size(), trains[i]);
				if(list.get(list.size()-1) > list.get(list.size()-2)) {
					list.remove(i-1);
				}
			}
		}		
		return list.size();
	}

	public static void main(String[] args) {
		int n = 6;
		int[] trains = {10, 2, 12, 20, 3, 8};
		System.out.println(trainSorting(n, trains));

	}

}
