package org.herencyexercise.exceptions;

public class CourseNotFoundException extends Exception {
	public CourseNotFoundException(String courseName)
    {
        super("course not found!!");
    }
}
