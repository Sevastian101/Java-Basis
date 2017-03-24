/**
 * Created by sodobescu on 3/24/2017.
 */
public class MainClass {


public static void main(String args[]){

	DataUtils d=new DataUtils();
   int[] array1=new int[10];

    array1=d.retutnArray(1,2,10);
	d.printArray(array1);
	array1=d.fillArray(array1);
	d.printArray(array1);
	array1=d.sortArray(array1);
	d.printArray(array1);
}
}
