package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenColor(160,44,219);
		StdDraw.filledRectangle(.15, .15, .15, .15);
		StdDraw.filledRectangle(.85, .15, .15, .15);
		StdDraw.filledRectangle(.15, .85, .15, .15);
		StdDraw.filledRectangle(.85, .85, .15, .15);	
		StdDraw.setPenColor(73,44,219);
		StdDraw.filledRectangle(.5, .5, .2, .2);
		StdDraw.setPenColor(44,103,219);
		StdDraw.filledRectangle(.5, .15, .2, .15);
		StdDraw.filledRectangle(.5, .85, .2, .15);
		StdDraw.filledRectangle(.15, .5, .15, .2);
		StdDraw.filledRectangle(.85, .5, .15, .2);
		StdDraw.pause(1000);
		StdDraw.setPenColor(255,255,255);
		StdDraw.text(.5, .5, "Fluffy");
	}
}