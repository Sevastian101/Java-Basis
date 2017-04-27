package com.endava.Main;

import com.endava.ArrayUtils.DataUtils;

/**
 * Created by sodobescu on 3/24/2017.
 */
public class MainClass
{
	public static void main(String args[]) {

		DataUtils d = new DataUtils();
		int[] array1;

		array1 = d.returnArray(1, 10);
		d.printArray(array1);
		d.printArray(d.sortArray(d.fillArray(new int[20])));
	}
}
