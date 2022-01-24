//number same as revers ie. 112211

package simpleJavaProgram;



public class polindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int  n=121, r ;
      int sum=0;
        	
      int temp=n;
       while(n>0) {
    	   r= n%10; //get reminder
           sum=(sum*10)+r;
           n=n/10;
       }
if(temp==sum) {
	System.out.println("number is polindrom");
}
else  
{
	System.out.println("not polindrom");
}
		
	}

}
