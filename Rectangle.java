public class Rectangle {
	Point A;
	double length;
	double width;
	
	public Rectangle (Point a, double l, double w) {
		A = a;
		length = l;
		width = w;
	}
	public double perimeter() {
		return 2*length + 2*width;
	}
	public double area() {
		return length*width;
	}
	public boolean isSquare() {
		return length == width;
	}
}
