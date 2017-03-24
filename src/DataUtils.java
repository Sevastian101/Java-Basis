
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by sodobescu on 3/24/2017.
 */
public class DataUtils {


	public DataUtils() {
	}

	public int[] retutnArray(int num1, int num2, int size) {


		int[] myarray = new int[size];
		if (size >= 2) {
			myarray[0] = num1;
			myarray[1] = num2;
		}
		if (size > 1) {
			myarray[0] = num1;
		}
		return myarray;

	}


	public int[] fillArray(int[] arraya) {
		int[] arrayb = new int[arraya.length];
		for (int i = 0; i < arraya.length; i++)
			arrayb[i] = ThreadLocalRandom.current().nextInt(-100, 101);
		return arrayb;
	}

	public void printArray(int[] arraya) {

		for (int i = 0; i < arraya.length; i++)
			System.out.print(arraya[i] + " ");

		System.out.println();
	}

	public int[] sortArray(int[] arraya) {
		boolean flag = true;
		while (flag) {
			flag = false;

			for (int i = 0; i < arraya.length; i++)
				if (i<arraya.length-1 && arraya[i] > arraya[i + 1] ) {
					int temp = arraya[i];
					arraya[i] = arraya[i + 1];
					arraya[i + 1] = temp;
					flag = true;
				}
		}

		return arraya;
	}

}
