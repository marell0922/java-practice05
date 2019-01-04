package prob6;

public class RectTriangle extends Shape {
	
	private double width;
	private double height;
	
	public RectTriangle(double width, double height) {
		this.width=width;
		this.height=height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (width*height)/2;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return Math.sqrt(Math.pow(width, 2.0)+Math.pow(height, 2.0))+width+height;
	}

}
