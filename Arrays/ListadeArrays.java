package Arrays;

import java.util.ArrayList;

public class ListadeArrays {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            numeros.add(i);
            for (int j = 0; j <numeros.size() ; j++) {
                if (numeros.get(j) % 2 ==0) {
                    numeros.remove(j);
                }
            }

        }
        System.out.println(numeros);
    }
}
