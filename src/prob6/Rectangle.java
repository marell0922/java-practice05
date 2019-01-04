package prob6;

public class Rectangle extends Shape implements Resizable {
	
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width=width;
		this.height=height;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		width*=s;
		height*=s;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (width+height)*2;
	}

}
