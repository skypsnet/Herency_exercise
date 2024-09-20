package org.herencyexercise.main;

import org.herencyexercise.classes.Student;
import org.herencyexercise.classes.StudentService;
import org.herencyexercise.exceptions.CourseNotFoundException;
import org.herencyexercise.exceptions.StudentNotFoundException;

public class Main {

	public static void main(String[] args) {
		
		StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService

        studentService.putStudent("1030", new Student( "Carlos", "1030", 31 ));
        studentService.putStudent( "1040", new Student( "Ian", "1020", 28 ) );
        studentService.putStudent("1050", new Student( "Elise", "1020", 26 ));
        studentService.putStudent("1020", new Student( "Santiago", "1020", 33 ));
        

	}
	
}
