package system;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;


@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String StudentName;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "class_student", 
	joinColumns = { @JoinColumn(name = "student_id", referencedColumnName = "id") }, 
	inverseJoinColumns = {@JoinColumn(name = "class_id", referencedColumnName = "id") })
	private Classes classRoom;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public Student(String studentName) {
		super();
		StudentName = studentName;
	}
	public Student() {
		super();
		
	}
	public Classes getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(Classes classRoom) {
		this.classRoom = classRoom;
	}
	
	
	
}
