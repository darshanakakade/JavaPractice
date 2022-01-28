package OopsConcept;

 class parent {

	//super keywork refer parent variable method constructor
	//this keywork reffer current object
	
	 int i=10;
	
 }
 
 class child extends parent{
	 int i =20;
	 void childmethod() {
		 System.out.println("childclass varible value:"+i);
		 System.out.println("parent class variable using super keyword:" +super.i);    
	 }
	
 }

public class SuperVSThis   {	 
	 public static void main(String args[]) {
		 child c= new child();
		 c.childmethod();
	 }
	 
}
