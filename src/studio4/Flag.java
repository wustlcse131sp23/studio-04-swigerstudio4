package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		//creating colors
		Color purple = new Color(200, 0, 255);
		
		
		//drawing flag
		StdDraw.setPenColor(Color.red);
		StdDraw.square(0.3, 0.75, .1);
		
		StdDraw.setPenColor(Color.orange);
		StdDraw.square(0.35, 0.7, .1);
		
		StdDraw.setPenColor(Color.yellow);
		StdDraw.square(0.4, 0.65, .1);
		
		StdDraw.setPenColor(Color.green);
		StdDraw.square(0.45, 0.6, .1);
		
		StdDraw.setPenColor(Color.blue);
		StdDraw.square(0.5, 0.55, .1);
		
		StdDraw.setPenColor(purple);
		StdDraw.square(0.55, 0.5, .1);
		
		StdDraw.setPenColor(Color.magenta);
		StdDraw.square(0.6, 0.45, .1);
		
		
		//box
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(Color.black);
		StdDraw.rectangle(0.45, 0.6, 0.44, .3);
		
	}
}