import javax.swing.*;
import java.awt.*;
public class dibujo4 extends JPanel {
    private int i, j;
    private int y, x, x1, y1;
    private int aux;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        x1 = 0;
        y1 = 0;
        x = 0;
        y = height;

        for (j = 0; j < 30; j++) {
            g.drawLine(x1, y1, x, y);
            y1 += 30;
            x += 30;
        }
        y1=getHeight();
        x1=0;
        x=getWidth();
        y=getHeight();
        for (j = 0; j < 30; j++) {
            g.drawLine(x1, y1, x, y);
            aux = x1 += 30;
            x1 = aux;
            aux = y -= 30;
            y = aux;
        }
        y=getHeight();
        x=getWidth();
        x1=getWidth();
        y1=0;
        for (j = 0; j < 30; j++) {
            g.drawLine(x1, y1, x, y);
            aux = x1 -= 30;
            x1 = aux;
            aux = y -= 30;
            y = aux;
        }

        y = getHeight();
        x = 0;
        x1 = 0;
        y1 = 0;
        for (j = 0; j < 30; j++) {
            g.drawLine(x1, y1, x, y);
            aux = x1 += 30;
            x1 = aux;
            aux = y -= 30;
            y = aux;
        }

    }
}
