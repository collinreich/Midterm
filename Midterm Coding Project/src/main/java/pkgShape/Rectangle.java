package pkgShape;

public class Rectangle extends Shape {
	
	private int iWidth;
	
	private int iLength;
	
	public Rectangle(int width, int length) {
		if(width <= 0 || length <= 0){
			throw new IllegalArgumentException();
		}
		this.iWidth = width;
		this.iLength = length;
	}
	
	public int getiWidth() {
		return iWidth;
	}
	
	public void setiWidth(int width) {
		this.iWidth = width;
	}
	
	public int getiLength() {
		return iLength;
	}
	
	public void setiLength(int length) {
		
		this.iLength = length;
	}
	
	public double area() {
		double Area = this.iWidth * this.iLength;
		return Area;
	}
	
	public double perimeter() {
		double perim = (2*iWidth)+(2*iLength);
		return perim;
	}
	
	public int compareTo(Object rectangle) {
		double compareArea = ((Rectangle) rectangle).area();
		return (int) (this.area() - compareArea);
	}

}
