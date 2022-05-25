package VectorAssignment;

public class StudentPojo {
	private long regno;
	private String name;
	private int age;
	private String email;
	
	public long getRegno() {
		return regno;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public void setRegno(long regno,String name,int age,String email) {
		this.regno = regno;
		this.name=name;
		this.age=age;
		this.email=email;
	}
}
