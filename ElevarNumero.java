
/**
 * ElevarNumero
 * Ejercicio 1  Creando una función matemática
 */
public class ElevarNumero {
    public static void main(String[] args) {
        ElevaNumero(3,4);
        ElevaNumero(3,1);
        ElevaNumero(3,6);
        ElevaNumero(3,7);
        ElevaNumero(3,8);
    }
    
    public static void ElevaNumero(int base, int exponente){
        try {
            int contador = exponente;
            int numero=1;
            while (contador >= 1) {
                numero *= base;
                contador--;
            }
            System.out.println(numero);
        } catch (Exception e) {
            System.out.println("Error; "+e.getMessage());
        }

        
    }
}
