package listOfTasks;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);
		System.out.println("What will be the size of array?");
		int size=scan.nextInt();
		int array[]=new int[size];
		int sum=0;
		System.out.println("Enter values one by one");
		
		for (int i=0;i<size;i++) {
			array[i]=scan.nextInt();
			sum=sum+array[i];

		}System.out.println("Sum of the values in the array is "+sum);
		scan.close();
	} 

}
