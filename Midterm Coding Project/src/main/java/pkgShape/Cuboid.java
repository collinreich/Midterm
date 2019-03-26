package pkgShape;

import java.util.*;

public class Cuboid extends Rectangle{
	
	private int iDepth;
	
	public Cuboid(int width, int length, int depth) {
		super(width,length);
		
		if(depth <= 0) {
			throw new IllegalArgumentException();
		}
		
		this.iDepth = depth;
		super.setiWidth(width);
		super.setiLength(length);
	}
	
	public int getiDepth() {
		return iDepth;
	}
	
	public void setiDepth(int depth) {
		this.iDepth = depth;
	}
	
	public double volume() {
		double vol = this.iDepth * super.getiWidth() * super.getiLength();
		return vol;
	}
	
	@Override
	public double area() {
		double SA = (2*super.getiWidth()*super.getiLength())+(2*super.getiWidth()*this.iDepth)+(2*super.getiLength()*this.iDepth);
		return SA;
	}
	
	@Override
	public double perimeter() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
	
	public int compareTo(Object cuboid) {
		double compareVolume = ((Cuboid) cuboid).area();
		return (int) (this.area() - compareVolume);
	}
	
class SortByArea implements Comparator<Cuboid>{ 
	public int compare(Cuboid a, Cuboid b) {
		return (int) (a.area()-b.area());
		}
}

class SortByVolume implements Comparator<Cuboid>{
	public int compare(Cuboid a, Cuboid b) {
		return (int) (a.volume()-b.volume());
		}
}
	
}