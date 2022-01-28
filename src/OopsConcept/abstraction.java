package OopsConcept;

 abstract class abst{
	
	abstract void run();    
	abstract void stop();
}


public  class abstraction extends abst {
	
	  
	void run() {
		  System.out.println("I am come form abst class");// body of methhod
	  }

		@Override
		void stop() {
		 	// TODO Auto-generated method stub
		System.out.println("i am from stop method");	
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		abst a=new abstraction();   // creating reffernces
		a.run();
		a.stop();
	}


}
