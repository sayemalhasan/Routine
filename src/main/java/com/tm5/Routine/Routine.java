package com.tm5.Routine;

public class Routine {
	private String day;
	private String periodOne;
	private String periodTwo;
	private String periodThree;
	
	protected Routine () {}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getPeriodOne() {
		return periodOne;
	}

	public void setPeriodOne(String periodOne) {
		this.periodOne = periodOne;
	}

	public String getPeriodTwo() {
		return periodTwo;
	}

	public void setPeriodTwo(String periodTwo) {
		this.periodTwo = periodTwo;
	}

	public String getPeriodThree() {
		return periodThree;
	}

	public void setPeriodThree(String periodThree) {
		this.periodThree = periodThree;
	}

	public Routine(String day, String periodOne, String periodTwo, String periodThree) {
		this.day = day;
		this.periodOne = periodOne;
		this.periodTwo = periodTwo;
		this.periodThree = periodThree;
	}
	
	
	
}
