package pkgTestShape;

import pkgShape.Rectangle;
import pkgShape.Cuboid;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;


public class ShapeTest {
	
	@Test
	public void Rectangle_Constructor_and_Getter_Test() {
		final int testW = 10;
		final int testL = 15;
		Rectangle rec = new Rectangle(10,15);
		int resultW = rec.getiWidth();
		int resultL = rec.getiLength();
		assertEquals(testW,resultW);
		assertEquals(testL,resultL);
	}
	
	@Test
	public void Rectangle_Setter_Test() {
		final int testW = 20;
		final int testL = 30;
		Rectangle rec = new Rectangle(10,15);
		rec.setiWidth(20);
		rec.setiLength(30);
		int resultW = rec.getiWidth();
		int resultL = rec.getiLength();
		assertEquals(testW,resultW);
		assertEquals(testL,resultL);
	}
	
	@Test
	public void Rectangle_Exception_Test1() {
		boolean thrown = false;
		try {
			Rectangle rec = new Rectangle(-10,15);
		}
		catch(IllegalArgumentException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	@Test
	public void Rectangle_Exception_Test2() {
		boolean thrown = false;
		try {
			Rectangle rec = new Rectangle(10,-15);
		}
		catch(IllegalArgumentException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	@Test
	public void Rectangle_Area_Test() {
		double testArea = 50;
		Rectangle rec = new Rectangle(5,10);
		double result = rec.area();
		assertEquals(testArea,result,0);
	}
	
	@Test
	public void Rectangle_Perimeter_Test() {
		double testPerim = 30;
		Rectangle rec = new Rectangle(5,10);
		double result = rec.perimeter();
		assertEquals(testPerim, result, 0);
	}
	
	@Test
	public void Rectangle_compareTo_Test() {
		int test = -100;
		Rectangle rec1 = new Rectangle(5,10);
		Rectangle rec2 = new Rectangle(10,15);
		int result = rec1.compareTo(rec2);
		assertEquals(test,result);
	}
	
	@Test
	public void Cuboid_Constructor_and_Getter_Test() {
		final int testWidth = 6;
		final int testLength = 7;
		final int testDepth = 8;
		Cuboid cube = new Cuboid(6,7,8);
		int resultWidth = cube.getiWidth();
		int resultLength = cube.getiLength();
		int resultDepth = cube.getiDepth();
		assertEquals(testWidth, resultWidth);
		assertEquals(testLength, resultLength);
		assertEquals(testDepth, resultDepth);
	}

	@Test
	public void Cuboid_Setter_Test() {
		final int testDepth = 15;
		Cuboid cube = new Cuboid(5,8,20);
		cube.setiDepth(15);
		int resultDepth = cube.getiDepth();
		assertEquals(testDepth, resultDepth);
	}
	
	@Test
	public void Cuboid_Exception_Test() {
		boolean thrown = false;
		try {
			Cuboid cube = new Cuboid(10,15,-5);
		}
		catch(IllegalArgumentException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	@Test
	public void Cuboid_Area_Test() {
		double testArea = 262;
		Cuboid cube = new Cuboid(5,8,7);
		double resultArea = cube.area();
		assertEquals(testArea,resultArea,0);
	}
	
	@Test
	public void CuboidVolumeTest() {
		double testVolume = 400;
		Cuboid cube = new Cuboid(5,8,10);
		double resultVolume = cube.volume();
		assertEquals(testVolume,resultVolume,0);
	}
	
	@Test
	public void Cuboid_Perimeter_Test() {
		boolean thrown = false;
		try {
			Cuboid cube = new Cuboid(10,15,5);
			cube.perimeter();
		}
		catch(UnsupportedOperationException e) {
			thrown = true;
		}
		assertTrue(thrown);
	}
	
	@Test
	public void Cuboid_compareTo_Test() {
		int test = -750;
		Cuboid cube1 = new Cuboid(5,10,15);
		Cuboid cube2 = new Cuboid(10,15,20);
		int result = cube1.compareTo(cube2);
		assertEquals(test,result);
	}
	
	@Test
	public void SortByArea_Test() {
		ArrayList<Cuboid> listModify = new ArrayList<Cuboid>();
		ArrayList<Cuboid> listSorted = new ArrayList<Cuboid>();
		
		listModify.add(new Cuboid(3,3,3));
		listModify.add(new Cuboid(2,2,2));
		listModify.add(new Cuboid(1,1,1));
		
		listSorted.add(new Cuboid(1,1,1));
		listSorted.add(new Cuboid(2,2,2));
		listSorted.add(new Cuboid(3,3,3));
		
		SortByArea sorter = new SortByArea();
		Collections.sort(listModify, sorter);
		
		assertTrue(listModify == listSorted);
	}
	
	@Test
	public void SortByVolume_Test() {
		ArrayList<Cuboid> listModify = new ArrayList<Cuboid>();
		ArrayList<Cuboid> listSorted = new ArrayList<Cuboid>();
		
		listModify.add(new Cuboid(3,3,3));
		listModify.add(new Cuboid(2,2,2));
		listModify.add(new Cuboid(1,1,1));
		
		listSorted.add(new Cuboid(1,1,1));
		listSorted.add(new Cuboid(2,2,2));
		listSorted.add(new Cuboid(3,3,3));
		
		SortByVolume sorter = new SortByVolume();
		Collections.sort(listModify, sorter);
		
		assertTrue(listModify == listSorted);
	}
}

