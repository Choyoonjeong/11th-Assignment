import javax.swing.*;
import java.awt.*;

public class BasicPaint {
	    public static void main(String[] args) {
		JFrame f = new JFrame("그래픽 기초 프로그램");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new MyPanel());
		f.setSize(700, 350);
		f.setVisible(true);
	}
}
  
class MyPanel extends JPanel {
	    public MyPanel() {
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
 
	    protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Font f1=new Font("serif",Font.ROMAN_BASELINE,13);
		g.setFont(f1);	 
		 
		//int[] x1 = {15, 120, 15, 120};
		//int[] y1 = {120, 200, 120, 150};
		
		  g.drawLine(15, 85, 85, 15);
		  g.drawRect(100, 15, 85, 70);
		  g.draw3DRect(200, 15, 85, 70, true);
		  g.drawRoundRect(300, 15, 70, 70, 30,30);
		  g.drawOval(400, 10, 30, 70);
		  g.drawArc(450, 15, 70, 70, 100, 150);
		  //g.drawPolygon(x1, y2, 3);
		  g.setFont(f1);
		  g.drawString(" drawLine()         drawRect()        draw3DRect()       drawRoundRect()      drawOval()   	drawArc()	drawPolygon()", 5, 110);
		  
		 // g.drawPolyline(15, 120, 85, 15);
		  g.fillRect(100, 120, 85, 70);
		  g.setColor(Color.BLACK);
		  g.fill3DRect(200, 120, 85, 70, true);
		  g.setColor(Color.BLACK);
		  g.fillRoundRect(300,120,70,70,30,30);
		  g.setColor(Color.BLACK);
		  g.fillOval(400, 120, 30, 70);
		  g.setColor(Color.BLACK);
		  g.fillArc(450, 120, 70, 70, 100, 150);
		  g.setColor(Color.BLACK);
		  //g.fillPolygon(x1,y2,4);
		  g.setFont(f1);
		  g.drawString(" drawPolyline()       fillRect()       fill3DRect()      fillRoundRect()     fillOval()     fillArc()  drawPolygon()", 5, 220);
		  
	}
}
