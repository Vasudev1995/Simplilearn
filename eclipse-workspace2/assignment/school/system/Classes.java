package system;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Classes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String className;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "class_student", 
	joinColumns = { @JoinColumn(name = "class_id", referencedColumnName = "id") }, 
	inverseJoinColumns = {@JoinColumn(name = "student_id", referencedColumnName = "id") })
	private List<Student> students;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Classes(String className, List<Student> students) {
		super();
		this.className = className;
		this.students = students;
	}

	public Classes() {
		super();
		
	}

	
	
	

}
