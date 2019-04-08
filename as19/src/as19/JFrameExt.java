/*
 * Bogdan Gordin
 *12/7/2018
 * COMSC-255-8213
 * Mr. Khaja
 * 
 * Main Pie Chart Extended Program hm19-2
 */

package as19;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameExt extends JFrame{
	private double north;
	private double south;
	private double east;
	private double west;
	private double midwest;
	
	public JFrameExt(double north, double south, double east, double west, double midwest) {
		super();
		this.north = north;
		this.south = south;
		this.east = east;
		this.west = west;
		this.midwest = midwest;
	}
	
	private JButton jbABORT = new JButton("ABORT");

@Override
	public void paint(Graphics g) {
		super.paint(g);
		double all = north + south + east + west + midwest;
		
		System.out.println(north);
		System.out.println(south);
		System.out.println(east);
		System.out.println(west);
		System.out.println(midwest);
		System.out.println(all + "\n");
		
		//Draw my text
		g.drawString("Greetings,", 25, 50);
		g.drawString("\tWelcome to Bogdan Gordin's Pie Charty-Roo program.", 25, 70);
		g.drawString("...", 25, 705);
		g.drawString("Goodbye!", 25, 725);
		
		//Draw the outline
		g.drawRect(25, 100, 445, 445);
		g.drawOval(25, 100, 445, 445);
		
		//Draw the pies
		int startAngle = 0;
		int arcAngle = (int)(north/all*360);
		System.out.println(startAngle + " " + arcAngle);
		g.setColor(Color.cyan);
		g.fillArc(25, 100, 445, 445, startAngle, arcAngle);
		
		
		startAngle += arcAngle;
		arcAngle = (int)(south/all*360);
		System.out.println(startAngle + " " + arcAngle);
		g.setColor(Color.blue);
		g.fillArc(25, 100, 445, 445, startAngle, arcAngle);
		
		
		startAngle += arcAngle;
		arcAngle = (int)(east/all*360);
		System.out.println(startAngle + " " + arcAngle);
		g.setColor(Color.yellow);
		g.fillArc(25, 100, 445, 445, startAngle, arcAngle);
		
		
		startAngle += arcAngle;
		arcAngle = (int)(west/all*360);
		System.out.println(startAngle + " " + arcAngle);
		g.setColor(Color.magenta);
		g.fillArc(25, 100, 445, 445, startAngle, arcAngle);
		
		
		startAngle += arcAngle;
		arcAngle = (int)(midwest/all*360);
		System.out.println(startAngle + " " + arcAngle);
		g.setColor(Color.orange);
		g.fillArc(25, 100, 445, 445, startAngle, arcAngle);
		
		//Draw the label area
		g.setColor(Color.cyan);
		g.fillRect(25, 560, 30, 20);
		g.setColor(Color.black);
		g.drawString("= NORTH " + north, 55, 575);
		
		g.setColor(Color.blue);
		g.fillRect(25, 585, 30, 20);
		g.setColor(Color.black);
		g.drawString("= SOUTH " + south, 55, 600);
		
		g.setColor(Color.yellow);
		g.fillRect(25, 610, 30, 20);
		g.setColor(Color.black);
		g.drawString("= EAST " + east, 55, 625);
		
		g.setColor(Color.magenta);
		g.fillRect(25, 635, 30, 20);
		g.setColor(Color.black);
		g.drawString("= WEST " + west, 55, 650);
		
		g.setColor(Color.orange);
		g.fillRect(25, 660, 30, 20);
		g.setColor(Color.black);
		g.drawString("= MIDWEST " + midwest, 55, 675);
		
		//Add the ABORT button
		
		/*
		if (ev.getSource() == jbABORT || ev.getSource() == jmiABORT) {
			System.out.println("ABORT ABORT ABORT");
			System.exit(ABORT);
		}
		*/
		
	}

}
