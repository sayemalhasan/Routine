package com.tm5.Batch;

public class Batch {
	private int batchId;
	private String batchName;
	private int totalStudents;
	
	protected Batch() {}

	public int getBatchId() {
		return batchId;
	}

	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}

	public String getBatchName() {
		return batchName; 
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public int getTotalStudents() {
		return totalStudents;
	}

	public void setTotalStudents(int totalStudents) {
		this.totalStudents = totalStudents;
	}

	public Batch(int batchId, String batchName, int totalStudents) {
		this.batchId = batchId;
		this.batchName = batchName;
		this.totalStudents = totalStudents;
	}
	
	
	
}
