import java.util.HashMap;

public class TwoSum {
	static int[] a = {0, 0};
	public static int[] two(int[] numbers, int target){
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for (int i = 0; i < numbers.length; i++) {
			if (!map.containsKey(numbers[i])) {
				map.put(target-numbers[i], i);
			}
			if (map.containsKey(numbers[i])) {
				int idx = map.get(numbers[i]);
				a[0] = idx + 1;
				a[1] = i + 1;
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};
		int sum = 10;
		int[] b = two(array, sum);
		for (int i : b) {
			System.out.println(i);
		}
	}
}
