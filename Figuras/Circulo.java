package Figuras;

import javax.swing.*;
import java.awt.*;

public class Circulo extends JFrame implements IAccionesFiguras {
    private int _diametro;

    public Circulo(int valor) {
        this._diametro = valor;
    }

    public void CrearFigura() {
        setTitle("Drawing a Circle");
        setSize(500, 400);
        setVisible(true);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawOval(150, 150, this._diametro, this._diametro);

    }
    public double CalcularArea() {
      return  Math.PI * Math.pow((this._diametro/2), 2);
    }

}
