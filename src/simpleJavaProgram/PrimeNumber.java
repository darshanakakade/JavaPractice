//prime number 2,3,5,7,11,13,17,    the number that can be divideby itself only.

package simpleJavaProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=10,i; //to check weather prime or not
   int flag=0;
		
   if (n==0||n==1) {
	   System.out.println("number is not prime");
   }
   else{
	 for(i=2;i<n;i++)  
	 {
		 if(n%i==0)
		 {
			 System.out.println("number is non prime");
			 flag=1;
			 break;
		 }
	 } 	   
   }
   if (flag==0)  {
	   System.out.println(n+" number is prime");
   }
		
		
		
	}

}
