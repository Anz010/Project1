package listOfTasks;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int[][] num3 = {{13,15,17,11},{985, 98, 55, 44, 5}};
	    int sum = 0;
	    int[] sumOfRow = new int[num3.length];
	    
	    for(int a = 0; a<num3.length; a++) {
	        sumOfRow[a] = 0;
	      for(int b =0; b<num3[a].length; b++) {
	        sumOfRow[a] += num3[a][b];
	    }
	      
	    
	}
	    for(int c = 0; c<sumOfRow.length; c++) {
	      
	      sum += sumOfRow[c];
	    }
	    
	    System.out.println("Total values of elements is " + sum);
	    
	    System.out.println();
	} 

}
