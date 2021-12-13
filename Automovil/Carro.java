
/**
 * ElevarNumero
 * Ejercicio 2 Clases, Objetos, Mensajes, this
 * Se crea una clase llamada Llanta la cual la instanciamos desde carro y con solo pasarle el valor del radio
 * este queda en memoria mientras esta la instancia.
 * luego desde la instancia se ejecuta el método diámetro, que da como resultado el diámetro de la llanta
 */
package Automovil;

public class Carro {
    public static void main(String[] args) {
        // Se instancia llanta y el constructor nos solicita un radio al cual le pasamos
        // el valor de 12
        Llanta llanta = new Llanta(12);
        System.out.println("El diámetro de la llanta es: " + llanta.Diametro() + "cm");
    }
}
