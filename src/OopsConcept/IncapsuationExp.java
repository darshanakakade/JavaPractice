package OopsConcept;
// bind code and data together 
public class IncapsuationExp {
	private int ID;

	public void setid(int empid) {
		ID = empid;
	}
	public int getid() {
		return ID;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncapsuationExp In = new IncapsuationExp();
          In.setid(101);
          System.out.println(In.getid());
	}  
	

}
