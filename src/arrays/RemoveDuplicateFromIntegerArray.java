package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromIntegerArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 4, 5, 2, 4, 3, 2};
		
		Set<Integer> hs = new HashSet<>();
		for(int i=0; i<arr.length; i++) {
			hs.add(arr[i]);
		}
		System.out.println(hs);
		List<Integer> list = new ArrayList<>(hs);
		System.out.println(list);
		
		mostEfficientWayConstructorPassing();
		arrayModificationZeroObjectOverhead();
	}
	
	public static void mostEfficientWayConstructorPassing() {
		int[] arr = {1, 4, 5, 2, 4, 3, 2};

		// Use LinkedHashSet to preserve original insertion order
		Set<Integer> set = new LinkedHashSet<>();
		for (int num : arr) {
		    set.add(num);
		}

		// Convert directly to List using the constructor
		List<Integer> list = new ArrayList<>(set);
		System.out.println(list);
	}
	
	public static void arrayModificationZeroObjectOverhead() {
		int[] arr = {1, 4, 5, 2, 4, 3, 2}; // Must be sorted - without sorting result [1, 4, 5, 2, 4, 3, 2]
		Arrays.sort(arr);
		int uniqueCount = 0;
		for (int i = 0; i < arr.length; i++) {
		    if (i == 0 || arr[i] != arr[i - 1]) {
		        arr[uniqueCount++] = arr[i];
		    }
		}

		// Trim the array to the exact number of unique elements
		int[] result = Arrays.copyOf(arr, uniqueCount);
		System.out.println(Arrays.toString(result));
	}

}
