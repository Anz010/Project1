package listOfTasks;

public class Task9 {

	public static void main(String[] args) {
		int[] num9 = {1,245,6546,656,23};
	    int max = num9[0];
	    int min = num9[0];
	    int max1 = num9[0];
	    for(int a=1; a<num9.length; a++) {
	      if(max>num9[a]) {
	      } else {
	      max = num9[a];
	      }
	    }
	    System.out.println(max + " is the largest number");
	    
	    for(int num:num9) {
	      if(min<num) {
	      } else {  
	        min=num;
	      }
	    }
	    System.out.println(min + " is the smallest number");
	    System.out.println();
	}
	    
	    
	    
	}


