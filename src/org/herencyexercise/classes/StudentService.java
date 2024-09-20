package org.herencyexercise.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.herencyexercise.exceptions.CourseNotFoundException;
import org.herencyexercise.exceptions.StudentNotFoundException;

public class StudentService {
	
	   private HashMap<String, Course> courseList = new HashMap<>();

	   private HashMap<String, Student> students = new HashMap<>();

	   private HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();


	    public StudentService()
	    {
	        courseList.put( "Math", new Course( "Math", 10, "Aurelio Baldor" ) );
	        courseList.put( "Physics", new Course( "Physics", 10, "Albert Einstein" ) );
	        courseList.put( "Art", new Course( "Art", 10, "Pablo Picasso" ) );
	        courseList.put( "History", new Course( "History", 10, "Sima Qian" ) );
	        courseList.put( "Biology", new Course( "Biology", 10, "Charles Darwin" ) );
	    }
	    
	    
	    public void putStudent(String id, Student student) {
	    	
	    	students.put(id, student);
	    	System.out.println("El estudiante: "+student.getName()+" fue ingresado con número de id: "+student.getId());
	  
	    }
	    

	    public void enrollStudents( String courseName, String studentID )
	    throws CourseNotFoundException, StudentNotFoundException{
	    	
	    	
	       if(!courseList.containsKey(courseName)) {
	    	  throw new CourseNotFoundException(courseName);
	       }
	       
	       if(!students.containsKey(studentID)) {
		       throw new StudentNotFoundException(studentID);
		   }
	    	
	    	
	    	Course course = courseList.get( courseName );
		    	
			if ( !coursesEnrolledByStudents.containsKey( studentID ) )
			  {
			     coursesEnrolledByStudents.put( studentID, new ArrayList<>() );
			  }
			     coursesEnrolledByStudents.get( studentID ).add( course );	        
	    }

	    public void unEnrollStudents( String courseName, String studentID )
	    {
	        Course course = courseList.get( courseName );

	        if ( coursesEnrolledByStudents.containsKey( studentID ) )
	        {
	            coursesEnrolledByStudents.get( studentID ).remove( course );
	        }
	    }

	    public void showEnrolledStudents(String courseId){
	        //TODO implement using collections loops
	    	
	    	Course curso = courseList.get(courseId);
	   
	    	System.out.println("Los alumnos inscritos en el curso son: ");  
	    	for (Entry<String, List<Course>> entry: coursesEnrolledByStudents.entrySet()) {
	    		
	    		if(entry.getValue().contains(curso)) {
	    		    System.out.println(students.get(entry.getKey()).getName());  		    
	    		    
	    		}	
	    	}
	    }

	    public void showAllCourses(){
	        //TODO implement using collections loops
	    	for(String c: courseList.keySet() ) {
	    		
	    		System.out.println(c);
	    		
	    	}
	    }
}
