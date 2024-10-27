package lab4;

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
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if(!(obj instanceof Rectangle)) {
			return false;
		}
		Rectangle r = (Rectangle)obj;
		return A.equals(r.A) && length == r.length && width == r.width;
	}
	@Override
	public int hashCode() {
		return (int)(A.x+A.y+length+width);
	}
}
