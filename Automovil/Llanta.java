package Automovil;

/**
 * Llanta
 */

public class Llanta {
    private int _radio;

    public Llanta(int y) {
        this._radio = y;
    }

    public int Diametro() {
        return 2 * _radio;
    }
}