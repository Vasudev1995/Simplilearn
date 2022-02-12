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
public class Teachers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String TeacherName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "subject_teachers", 
	joinColumns = { @JoinColumn(name = "teacher_id", referencedColumnName = "id") }, 
	inverseJoinColumns = {@JoinColumn(name = "subject_id", referencedColumnName = "id") })
	private List<Subjects> subjects;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeacherName() {
		return TeacherName;
	}
	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}
	public List<Subjects> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}
	public Teachers(String teacherName, List<Subjects> subjects) {
		super();
		TeacherName = teacherName;
		this.subjects = subjects;
	}
	public Teachers() {
		super();
		
	}
	
	
	
	
	

	
	

}
