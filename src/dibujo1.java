import javax.swing.*;
import java.awt.*;
public class dibujo1 extends JPanel {
    private int i, j;
    private int y, x, x1, y1;
    private int aux;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        y = getHeight();
        x = 0;
        x1 = 0;
        y1 = 0;
        for (j = 0; j < 15; j++) {
            g.drawLine(x1, y1, x, y);
            aux = x + 40;
            x = aux;
            aux = y - 40;
            y = aux;
        }

    }
}
