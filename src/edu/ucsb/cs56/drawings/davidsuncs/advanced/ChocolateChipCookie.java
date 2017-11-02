package edu.ucsb.cs56.drawings.davidsuncs.advanced;

import java.awt.geom.GeneralPath;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import java.lang.Math;
/**
 A Cookie
 @author David Sun
 @version for CS56, W17, UCSB

 */
public class ChocolateChipCookie extends CookieOval implements Shape
{
	/**
	 * Constructor for Cookies
	 */
	public ChocolateChipCookie(double x, double y,
		       	double width, double height)
	{
		super(x,y,width,height);

		GeneralPath gp = this.get(); //use general path from the super


		Rectangle2D cookieBounds = gp.getBounds2D();
		Rectangle2D cookieRectangle = cookieBounds.getBounds2D();
		double cookieRectWidth = cookieRectangle.getWidth()*0.8;
		double cookieRectHeight = cookieRectangle.getHeight()*0.8;
		double cookieRectX = cookieRectangle.getX()+cookieRectangle.getWidth()*.05;
		double cookieRectY = cookieRectangle.getY()+cookieRectangle.getHeight()*.05;
		double cookieRadius = (cookieRectWidth + cookieRectHeight)/20;
		ArrayList<Ellipse2D.Double> chocolateChipsList = new ArrayList<Ellipse2D.Double>();
		GeneralPath chocolateCookie = this.get();
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				double randValue = Math.random();
				double chipX = randValue*cookieRectWidth/3;
			        double chipY = randValue*cookieRectHeight/3;
				chipX +=(double)i*cookieRectWidth/3;
				chipY +=(double)j*cookieRectHeight/3;
				//chipX *= 0.9;
				//chipY *= 0.9;
				chipX += cookieRectX;
				chipY += cookieRectY;
				chocolateChipsList.add(new Ellipse2D.Double(chipX, chipY, 
							cookieRadius, cookieRadius)); 
			}
		} 
		GeneralPath wholeCookie = this.get();
		while(!chocolateChipsList.isEmpty())
		{
			wholeCookie.append(chocolateChipsList.get(0), false);
			chocolateChipsList.remove(0);
		}
	}
}



