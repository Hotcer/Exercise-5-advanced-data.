package Excepciones;

public class DividexCero {
    public static void main(String[] args) throws ArithmeticException {
        try {
            division(9, 0);
        }catch(ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de codigo");
        }

    }

    private static int division(int num1, int num2)  {
        return num1 / num2;
    }


}
