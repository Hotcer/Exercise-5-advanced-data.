package Vectores;

import java.util.Vector;

public class Vector5Elementos {
    public static void main(String[] args) {
        Vector<String> vector = new Vector();

        vector.add("Ubuntu");
        vector.add("Fedora");
        vector.add("Manjaro");
        vector.add("Zorin-OS");
        vector.add("L.Mint");

        System.out.println(vector);

        vector.remove("L.Mint");
        vector.remove("Ubuntu");
        System.out.println(vector);
    }
}
