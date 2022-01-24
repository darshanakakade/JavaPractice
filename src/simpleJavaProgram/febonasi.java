//op-> 0,1,1,2,3,5,8,13

package simpleJavaProgram;

public class febonasi {
	int a=0, b=1, c , i;
	void febo() {// witout recurrion 
		
		
		
		System.out.println(a +"\n"+ b);
		
				for(i=2;i<=10;i++) {
					
					c=a+b;
					a=b;
					b=c;
					
					System.out.println(c);
				}
		 
	}

	   
	   
   
   
   
	
	
	public static void main(String args[])
	{
		
		febonasi f= new febonasi();
		
		f.febo();
		
		
	}
}
