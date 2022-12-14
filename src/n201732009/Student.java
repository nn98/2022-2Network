package n201732009;

import java.io.Serializable;

public class Student implements Serializable {
	 private static final long serialVersionUID = 1L;
	String studentNo;
	String name;
	Student(String studentNo,String name) {
		this.studentNo=studentNo;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", name=" + name + "]";
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}