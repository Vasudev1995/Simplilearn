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
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    
    private String SubjectName;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "class_subjects", 
	joinColumns = { @JoinColumn(name = "subject_id", referencedColumnName = "id") }, 
	inverseJoinColumns = {@JoinColumn(name = "class_id", referencedColumnName = "id") })
	private Classes classes;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
	public Classes getClasses() {
		return classes;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	public Subjects(String subjectName, Classes classes) {
		super();
		SubjectName = subjectName;
		this.classes = classes;
	}
	public Subjects() {
		super();
		
	}

	
	
	
	
	
	
	

	
}
