package net.texala;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondMaxInArray {

	public static int findSMax(int[] array)
	{
		return Arrays.stream(array).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
	}
	public static void main(String[] args) {

		int[] a = {1,2,6,8,90};
		System.out.println("The Second Heighest in Array is: "+findSMax(a));
	}

}
