package com.tm5.Course;

public class Course {
	private int courseId;
	private String courseName;
	private String courseShortName;
	
	protected Course() {}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseShortName() {
		return courseShortName;
	}

	public void setCourseShortName(String courseShortName) {
		this.courseShortName = courseShortName;
	}

	public Course(int courseId, String courseName, String courseShortName) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseShortName = courseShortName;
	}
	
	
	
	

}
