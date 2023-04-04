import java.awt.*;
import java.applet.*;

/*<applet code="disovals.class" height="800" width="1860">
<param name="numOvals" value="10">
</applet>*/

public class difovals extends Applet {
	private int numOvals;
	public void init() {
		String numOvalsStr = getParameter("numOvals");
		numOvals = Integer.parseInt(numOvalsStr);
	}
	public void paint(Graphics g) {
		for (int i = 0; i < numOvals; i++) {
			int x = (int)(Math.random() * 400);
			int y = (int)(Math.random() * 300);
			int w = (int)(Math.random() * 100);
			int h = (int)(Math.random() * 100);
			g.drawOval(x, y, w, h);
		}
	}
}