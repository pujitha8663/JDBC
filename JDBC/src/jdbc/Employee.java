package jdbc;

public class Employee {
  String EmpName;
  double EmpSalary;
  int EmpId;
 public Employee(String empName, double empSalary, int empId) {
	super();
	EmpName = empName;
	EmpSalary = empSalary;
	EmpId = empId;
}
public String getEmpName() {
	return EmpName;
}
public void setEmpName(String empName) {
	EmpName = empName;
}
public double getEmpSalary() {
	return EmpSalary;
}
public void setEmpSalary(double empSalary) {
	EmpSalary = empSalary;
}
public int getEmpId() {
	return EmpId;
}
public void setEmpId(int empId) {
	EmpId = empId;
}
@Override
public String toString() {
	return "Employee [EmpName=" + EmpName + ", EmpSalary=" + EmpSalary + ", EmpId=" + EmpId + "]";
}
 
 
}
