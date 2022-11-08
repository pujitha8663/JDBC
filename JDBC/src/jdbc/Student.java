package jdbc;

public class Student {
	String Name;
	int id;
	double fee;
	
	public Student(String name, int id, double fee) {
		super();
		Name = name;
		this.id = id;
		this.fee = fee;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", id=" + id + ", fee=" + fee + "]";
	}
	

}
