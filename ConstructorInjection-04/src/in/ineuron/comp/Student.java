package in.ineuron.comp;


public class Student {

	private Integer Sno; 
	private String sname;
	private String saddressString ;
	private Float  sage ;
	
	static {
		System.out.println("student class is loading boss...");
	}
	
	
	
	public Student(Integer sno, String sname, String saddressString, Float sage) {
		super();
		Sno = sno;
		this.sname = sname;
		this.saddressString = saddressString;
		this.sage = sage;
		
		System.out.println("Student para 4 constuctor boss...");
	}



	@Override
	public String toString() {
		return "Student [Sno=" + Sno + ", sname=" + sname + ", saddressString=" + saddressString + ", sage=" + sage
				+ "]";
	}
	
	
	 
	
}
