public class Reverse {
    public static void main(String[] args) {
        String cadena = "hola mundo";
        StringBuilder stringBuilder = new StringBuilder(cadena);
        String cadenaReverse = stringBuilder.reverse().toString();
        System.out.println("Su cadena inversa profesor es "+ cadenaReverse);
    }
}
