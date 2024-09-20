package org.herencyexercise.exceptions;

public class StudentNotFoundException extends Exception{
    
	public StudentNotFoundException( String studentID )
    {
        super( "Student not found!" );
    }
	
}
