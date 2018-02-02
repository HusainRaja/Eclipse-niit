package hr.java;

import java.util.List;

public class NewSquare {
	List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	void draw() {
		System.out.println("co-ordinates using lists:");
		for(Point point:points) {
			System.out.println("point : ( "+point.getX()+" , "+point.getY()+" )");
		}
	}
}
