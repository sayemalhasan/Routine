package com.tm5.Room;

public class Room {
	private String roomId;
	private int capacity;
	
	protected Room () {}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Room(String roomId, int capacity) {
		this.roomId = roomId;
		this.capacity = capacity;
	}
	
	
}
