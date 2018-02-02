package hr.java;

public class Square {
	private Point p1,p2,p3,p4;
	

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


	public Point getP4() {
		return p4;
	}


	public void setP4(Point p4) {
		this.p4 = p4;
	}


	void draw() {
		System.out.println("co-ordinates using individual point variables:");
		System.out.println("point A : ( "+getP1().getX()+" , "+getP1().getY()+" )");
		System.out.println("point B : ( "+getP2().getX()+" , "+getP2().getY()+" )");
		System.out.println("point C : ( "+getP3().getX()+" , "+getP3().getY()+" )");
		System.out.println("point D : ( "+getP4().getX()+" , "+getP4().getY()+" )");
	}
}
