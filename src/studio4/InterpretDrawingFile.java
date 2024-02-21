package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean isFilled = in.nextBoolean();
		StdDraw.clear();
		StdDraw.setPenColor(red, green, blue);
		double p1 = in.nextDouble();
		double p2 = in.nextDouble();
		double p3 = in.nextDouble();
		double p4 = in.nextDouble();
		if (shapeType.equals("rectangle")) {
			if (isFilled) {
				StdDraw.filledRectangle(p1, p2, p3, p4);
			} else {
				StdDraw.rectangle(p1, p2, p3, p4);
			}
		}
		if (shapeType.equals("ellipse")) {
			if(isFilled) {
				StdDraw.filledEllipse(p1, p2, p3, p4);
			}else {
				StdDraw.ellipse(p1, p2, p3, p4);
			}
		} if (shapeType.equals("triangle")) {
			double p5 = in.nextDouble();
			double p6 = in.nextDouble();
			double [] px = {p1, p3, p5};
			double [] py = {p2, p4, p6};
			if(isFilled) {
				StdDraw.filledPolygon(px, py);
			} else {
				StdDraw.polygon(px, py);
			}
		}
	}
}
