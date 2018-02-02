package hr.java;

public class Rectangle {
	private String type;
	private int height;
	public Rectangle(String type) {
		this.type=type;
	}
	public Rectangle(String type, int height) {
		this.type=type;
		this.height=height;
	}
	void draw() {
		System.out.println(type+" Rectangle with height="+height);
	}
}
