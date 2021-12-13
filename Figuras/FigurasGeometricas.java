package Figuras;

public class FigurasGeometricas {
    public double Circulo(){
        Circulo circulo = new Circulo(100);
        circulo.CrearFigura();
        return circulo.CalcularArea();
    }
    public double Triangulo(){
        Triangulo triangulo = new Triangulo(100,100);
        triangulo.CrearFigura();
        return triangulo.CalcularArea();
    }
    // public double Rectangulo(){
    //     Rectangulo rectangulo = new Rectangulo(100);
    //     rectangulo.CrearFigura();
    //     return rectangulo.CalcularArea();
    // }
    // public double Rombo(){
    //     Rombo rombo = new Rombo(100);
    //     rombo.CrearFigura();
    //     return rombo.CalcularArea();
    // }
}
