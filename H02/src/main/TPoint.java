package main;

import java.awt.*;

public class TPoint extends Point {

	public void print(){
		System.out.printf("P: (%d, %d)\n", x, y);
	}

	public TPoint(){
		x = 0;
		y = 0;
	}
	
	public TPoint(int X, int Y){
		x = X;
		y = Y;
	}
	
	public void offset(int a){
		x += a;
		y += a;
	}
	
	public void offset(int X, int Y){
		x += X;
		y += Y;
	}
	
	public TPoint convert(Point p){
		return new TPoint(p.x, p.y);
	}
	
	public TPoint pos(){	
		return convert(MouseInfo.getPointerInfo().getLocation());
	}
	
	private static final long serialVersionUID = 1L;
}
