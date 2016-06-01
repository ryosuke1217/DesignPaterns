package applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class AppletTest1 extends Applet{
	public void paint(Graphics g) {
		g.setColor(Color.red);

		Dimension size = getSize();
		g.fillRect(0, 0, size.width -1, size.height - 1 );
	}
}
