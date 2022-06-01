package listOfTasks;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
                {5,8,11,14},
                {19,24,27,10},
                 {27,40,55,60}};
		int [] odd=new int [a.length];
		int []even=new int [a.length]; 
		int totalEven=0;
        int totalOdd=0;
        for (int i=0;i<a.length;i++){
        	odd[i]=0;
        	even[i]=0;
            for (int j=0;j<a[i].length;j++) {
            	if(a[i][j]%2==0) {
                    even[i]+=a[i][j];
                    
                }else {
                	odd[i]+=a[i][j];
                }
        }
     
        }for (int b:odd) {
       	 totalOdd+=b;
        }for (int b:even) {
       	 totalEven+=b;
        }
        System.out.println("The sum of odd numbers is "+totalOdd);
		System.out.println("The sum of even numbers is "+totalEven);
	}

}
