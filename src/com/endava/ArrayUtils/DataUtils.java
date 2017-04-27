package com.endava.ArrayUtils;
import java.util.concurrent.ThreadLocalRandom;
/**
 * Created by sodobescu on 3/24/2017.
 */
public class DataUtils
{
	public DataUtils() {
	}

	public int[] returnArray(int minNumber, int maxNumber) {
		int[] myarray;
		/**Check if the size of array is grater than 0 */
		if (minNumber + maxNumber > 0) {
			myarray = new int[minNumber + maxNumber];
		} else myarray = new int[10];
		/**Fill my array */
		for (int i = 0; i < myarray.length; i++)
			myarray[i] = ThreadLocalRandom.current().nextInt(minNumber, maxNumber);

		return myarray;
	}

	public int[] fillArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			array[i] = ThreadLocalRandom.current().nextInt(-100, 101);
		return array;
	}

	public void printArray(int[] arraya) {

		for (int i = 0; i < arraya.length; i++)
			System.out.print(arraya[i] + " ");
			System.out.println();
	}
	/**Array gets sorted with bubble sort algorithm */
	public int[] sortArray(int[] array) {
		boolean flag = true;
		while (flag) {
			flag = false;

			for (int i = 0; i < array.length; i++)
				if (i < array.length - 1 && array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					flag = true;
				}
		}
		return array;
	}
}
