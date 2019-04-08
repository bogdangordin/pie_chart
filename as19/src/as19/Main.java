/*
 * Bogdan Gordin
 *12/7/2018
 * COMSC-255-8213
 * Mr. Khaja
 * 
 * Main Pie Chart Program hm19-1
 */

package as19;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String in;
		double north, south, east, west, midwest;
		
		in = JOptionPane.showInputDialog("Please punch in the North's data: ");
		north = Double.parseDouble(in);
		
		in = JOptionPane.showInputDialog("Please punch in the South's data: ");
		south = Double.parseDouble(in);
		
		in = JOptionPane.showInputDialog("Please punch in the East's data: ");
		east = Double.parseDouble(in);
		
		in = JOptionPane.showInputDialog("Please punch in the West's data: ");
		west = Double.parseDouble(in);
		
		in = JOptionPane.showInputDialog("Please punch in the Midwest's data: ");
		midwest = Double.parseDouble(in);
		
		
		JFrameExt f = new JFrameExt(north, south, east, west, midwest);
		f.setSize(500, 750);
		f.setVisible(true);
	}

}
