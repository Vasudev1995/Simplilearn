package data;


import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import system.Classes;
import system.Student;
import system.Subjects;
import system.Teachers;


public class PersistantClass {

	public static void main(String[] args) {
		
		StandardServiceRegistry ssr= new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta= new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf= meta.getSessionFactoryBuilder().build();
		Session ss= sf.openSession();
		Transaction tr= ss.beginTransaction();
		
		Student student1= new Student("Vasudev");  
		Student student2= new Student("Prashant");  
		Student student3= new Student("Nikhil"); 
		Student student4= new Student("Ankita");
		Student student5= new Student("Rishabh");
		Student student6= new Student("Trisha");
		
		List<Student> student_A1= Arrays.asList(student1,student3,student5);
		List<Student> student_A2= Arrays.asList(student2,student4,student6);
		
	    Classes A1= new Classes("A1",student_A1);
	    Classes A2= new Classes("A2",student_A2);
	    
		//Subject List
	    Subjects p1= new Subjects("Physics",A1);
	    Subjects c1= new Subjects("Chemistry",A1);
	    Subjects m1= new Subjects("Maths",A1);
	    Subjects co= new Subjects("Computer",A1);
	    Subjects p2= new Subjects("Physics",A2);
	    Subjects b2= new Subjects("Biology",A2);
	    Subjects m2= new Subjects("Maths",A2);
	    Subjects ec= new Subjects("Economics",A2);
	    
	    //Multiple Subjects
	    List<Subjects> sb1= Arrays.asList(p1,m2);
	    List<Subjects> sb2= Arrays.asList(c1,b2);
	    
	    //Single Subjects
	    List<Subjects> sb3= Arrays.asList(m1);
	    List<Subjects> sb4= Arrays.asList(co);
	    List<Subjects> sb5= Arrays.asList(p2);
	    List<Subjects> sb6= Arrays.asList(ec);
	    
	    Teachers Naveen= new Teachers("Mr.Naveen Kumar",sb1);
	    Teachers Arvindh= new Teachers("Mr.Arvindh Pathak",sb2);
	    Teachers Harpreet= new Teachers("Mr.Harpreet Singh",sb3);
	    Teachers Tanmay= new Teachers("Mr.Tanmay Singh",sb4);
	    Teachers Samantha= new Teachers("Mr.Samantha Biswas",sb5);
	    Teachers Sushmita= new Teachers("Mrs.Sushmita Basu",sb6);
	    
	    
	    ss.save(Naveen);
	    ss.save(Arvindh);
	    ss.save(Harpreet);
	    ss.save(Tanmay);
	    ss.save(Samantha);
	    ss.save(Sushmita);
	    
	    
	    
		tr.commit();
		ss.close();
		sf.close();
		
		
		
	}

}
