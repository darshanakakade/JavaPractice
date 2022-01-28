package OopsConcept;


interface in1{
		 void run(); 
}

interface  in2{
	   void stop();

}

class  imp implements in1,in2{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I am From in1 class and run method");
	}
	
	@Override
	public void stop() {
		System.out.println("I am from in2 class and stop method");
	}
	
}
public class simpleInterface  {

    public static void main(String args[])
    {
    	imp i=new imp();
    	i.run();
    	i.stop();
    	
    }
	
}

