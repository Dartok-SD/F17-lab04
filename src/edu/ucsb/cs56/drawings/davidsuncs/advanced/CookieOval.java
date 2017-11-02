package edu.ucsb.cs56.drawings.davidsuncs.advanced;
import java.awt.Shape;
import java.awt.geom.GeneralPath;


import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**

 @author David Sun
 @version for CS56, F17, UCSB


*/


public class CookieOval extends GeneralPathWrapper implements Shape 
{
	/**
	 Constructor
	 
	 @param x x coord of lower left corner of oval
       @param y y coord of lower left corner of oval
       @param width width of the oval
       @param height of house oval
       */
	public CookieOval(double x, double y, double width, double height)
	{

		Ellipse2D.Double createdOval = 
			new Ellipse2D.Double(x,y,width, height);
		GeneralPath ovalReturn = this.get();
		ovalReturn.append(createdOval, false);
	}

}
