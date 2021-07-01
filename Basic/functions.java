import java.io.*;
import java.util.*;

class functions {


	static class comp implements Comparator<Integer> {
		public int compare(Integer a, Integer b){
			return b - a;
		}
	}

	public static void main(String[] args) {
		

		// String functions
		// The Java String is immutable which means it cannot be 
		// changed. Whenever we change any string, a new instance 
		// is created. For mutable strings, you can use StringBuffer 
		// and StringBuilder classes.

		String str = "hello World";

		str.charAt(index);

		str.length();

		str.subString(to);
		str.subString(to, from);

		str.equals("String2");

		str.equalsIgnoreCase(String);

		str.split(regex);
		str.split(regex, limit);

		str.isEmpty();

		str.concat("!!");

		str.replace(char, char | String, String);

		str.compareTo("hello world");

		str.compareToIgnoreCase("hello World");

		str.indexOf(String | char, fromIndex);

		str.toLowerCase();

		str.toUpperCase();

		str.trim()

		str.containsEquals("hello");

		// Extras
		String s = String.join('delemiter', "words", ....);


		// Arrays 

		Integer arr[] = {1,2,3,4,7,6,5,8,9,10};

		System.out.println("List of array -> " + Arrays.asList(arr));

		System.out.println(Arrays.binarySearch(arr, 10)); // binarySearch(arr, from, to, Key)

		System.out.println(Arrays.toString(Arrays.copyOf(arr, 3))); // copyOf(from, end)

		System.out.println(Arrays.deepEquals(arr,arr));

		int arr2d[][] = {{1,2,3}};

		System.out.println(Arrays.deepHashCode(arr2d));

		System.out.println(Arrays.hashCode(arr2d));

		System.out.println(Arrays.toString(arr2d) + " Deep String  -> " + Arrays.deepToString(arr2d));

		Integer a[] = {1,2,3};
		Integer b[] = {1,2,3};
		Integer c[] = {1,2,3,4,5};

		System.out.println(Arrays.equals(a,b));
		System.out.println(Arrays.equals(a,c));

		Arrays.fill(a, 10);
		System.out.println(Arrays.toString(a));

		// System.out.println(Arrays.toString(Arrays.setAll(arr, (i) => {++i;}))); // error

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)); // sort(arr, from, to) // sort(arr, from, to, comp())  // sort(arr, comp())

		Arrays.sort(arr, new comp());
		System.out.println(Arrays.toString(arr)); 









	}

}