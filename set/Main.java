package contohPenggunaanSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set <String> hobby1 = new HashSet <String>();
        Set <String> hobby2 = new HashSet <String>();
        hobby1.add("Berenang");
        hobby1.add("Membaca");
        hobby1.add("Bermain");
        System.out.println("Hobby Prihan = "+ hobby1);
        hobby2.add("Bermain");
        hobby2.add("Bulu Tangkis");
        hobby2.add("Membaca");
        hobby2.add("Berkelahi");
        hobby2.remove("Berkelahi ");
        System.out.println("Hobby Wahyu : = " + hobby2);

        Set<String> intersection = new HashSet<String>(hobby1);
        intersection.retainAll(hobby2);

        System.out.println("Hobby Mereka Yang Sama = " + intersection);

        hobby1.addAll(hobby2);
        System.out.println("Gabungan Hobby Mereka :");
        for (Iterator iterator = hobby1.iterator(); iterator.hasNext(); ) {
            // looping menggunakan Iterator
            System.out.println(iterator.next());
        }
    }
}
