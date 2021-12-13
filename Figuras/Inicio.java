package Figuras;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Inicio extends JFrame implements ActionListener {
    /* Declaro variables */
    private JButton btnCirculo, btnTriangulo, btnRectangulo, btnRombo;
private JLabel lblNombre;
    /* Constructor */
    Inicio() {
        setTitle("Figuras geometricas");
        
        CrearBotones(btnCirculo, "Circulo", 50);
        CrearBotones(btnTriangulo, "Triangulo", 100);
        CrearBotones(btnRectangulo, "Rectangulo", 150);
        CrearBotones(btnRombo, "Rombo", 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        setLayout(null);
        setVisible(true);

    }

    private void CrearBotones(JButton boton, String nombre, int posicion) {
        boton = new JButton("Crear " + nombre);
        boton.setName(nombre);
        boton.setBounds(10, posicion, 180, 40);
        add(boton);
        boton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        JButton o = (JButton) e.getSource();
        String name = o.getName();
        if ("Circulo".equals(name)) {
            new FigurasGeometricas().Circulo();
        }
        if ("Triangulo".equals(name)) {
            new FigurasGeometricas().Triangulo();
        }
        if ("Rectangulo".equals(name)) {
            System.out.println(name);
        }
        if ("Rombo".equals(name)) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        new Inicio();
    }
}
