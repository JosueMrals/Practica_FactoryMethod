package org.josue;
import java.awt.*;

public class Cuadrado extends Figura {
    public Cuadrado(int lado) {
        super(lado);
    }
    public double getArea() {
        return 0;
    }

    public void dibujar(Graphics g, int x, int y) {
        g.setColor(Color.black);
        g.drawRect(x, y, lado, lado);
    }
}
