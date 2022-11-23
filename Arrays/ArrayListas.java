package Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListas {
    public static void main(String[] args) {
        ArrayList<String> distrosLinux= new ArrayList<>();
        distrosLinux.add("Solus-OS");
        distrosLinux.add("Elementary-OS");
        distrosLinux.add("Endeavour-OS");
        distrosLinux.add("Arch-Linux");

        LinkedList<String> distrosLinux2 = new LinkedList<>(distrosLinux);
        for (String p:distrosLinux) {
            System.out.println(p);
        }
    }
}
