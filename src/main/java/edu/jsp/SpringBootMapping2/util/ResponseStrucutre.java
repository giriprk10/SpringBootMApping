package edu.jsp.SpringBootMapping2.util;

public class ResponseStrucutre<G> {
	private int id;
	  private String message;
	  private G data;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public G getData() {
		return data;
	}
	public void setData(G data) {
		this.data = data;
	}
	
}
