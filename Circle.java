package lab4;

public class Circle {
    Point center;
    double radius;

    public Circle() {
        Point c = new Point(0,0);
        center = c;
        radius = 1;
    }
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    public Circle(double x, double y, double radius) {
        Point c = new Point(x,y);
        center = c;
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

	@Override
	public int hashCode() {
		return center.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (radius != other.radius)
			return false;
		return center.equals(other.center);
	}
}
