package Figuras;

import javax.swing.JFrame;
import java.awt.*;

public class Triangulo extends JFrame implements IAccionesFiguras {
    int alto = 0;
    int base = 0;
    int x = 100;
    int y = 100;

    public Triangulo(int a, int b) {
        this.alto = a;
        this.base = b;
    }

    @Override
    public void CrearFigura() {
        setTitle("Drawing a Circle");
        setSize(500, 400);
        setVisible(true);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public double CalcularArea() {
        return (this.base*this.alto)\2;
    }
    @Override
    public void paint(Graphics g) {
        g.drawLine(x, y, x + (base / 2), y + alto);
        g.drawLine(x + (base / 2), y + alto, x - (base / 2), y + alto);
        g.drawLine(x, y, x - (base / 2), y + alto);
    }
}
