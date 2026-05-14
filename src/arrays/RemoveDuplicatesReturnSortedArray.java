package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesReturnSortedArray {

	public static void main(String[] args) {
		int[] arr = {9, 1, 8, 2, 7, 3, 6, 4, 5, 5, 4, 6, 3, 7, 2, 8, 1, 9};
		System.out.println(Arrays.toString(arr));
		Set<Integer> lhs = new LinkedHashSet<>();//unsorted-maintain insertion order
		Set<Integer> hs = new HashSet<>();//sorted ascending
		for(Integer num:arr) {
			lhs.add(num);
			hs.add(num);
		}
		System.out.println(lhs);
		System.out.println(hs);
		System.out.println("List: >>"+Arrays.asList(hs));
		List<Integer> list = new ArrayList<>(hs);
		List<Integer> al = new ArrayList<>(lhs);
		List<Integer> ll = new LinkedList<>(lhs);
		System.out.println(list);
		System.out.println(al);
		System.out.println(ll);
	}

}
