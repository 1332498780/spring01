package cn.hzy.demo.model;

public class IdCard {

	private int id;
	private Student student;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	@Override
	public String toString() {
		return "[id="+id+",student:"+student+"]";
	}
}
