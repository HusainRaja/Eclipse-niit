package hr.java;

public class Triangle {
	private Point p1;
	private Point p2;
	private Point p3;
	public Point getP1() {
		return p1;
	}
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	public Point getP2() {
		return p2;
	}
	public void setP2(Point p2) {
		this.p2 = p2;
	}
	public Point getP3() {
		return p3;
	}
	public void setP3(Point p3) {
		this.p3 = p3;
	}
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	void draw() {
		System.out.println(getType()+"Triangle");
		System.out.println("co-ordinates of triangle are:");
		System.out.println("point A : ( "+getP1().getX()+" , "+getP1().getY()+" )");
		System.out.println("point B : ( "+getP2().getX()+" , "+getP2().getY()+" )");
		System.out.println("point C : ( "+getP3().getX()+" , "+getP3().getY()+" )");
	}

}
