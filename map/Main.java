package ContohMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> dataMahasiswa = new HashMap<>();
        dataMahasiswa.put("Prihan", 2105571011);
        dataMahasiswa.put("Badut", 2105571041);
        dataMahasiswa.put("Sukman", 2106951011);
        dataMahasiswa.put("Jonathan", 2105522311);

        for (String key : dataMahasiswa.keySet()) { // looping key dari Map
            // method get() untuk melihat isi Map berdasarkan key
            System.out.println(key + " => " + dataMahasiswa.get(key));
        }

        dataMahasiswa.remove("Sukman");
        dataMahasiswa.remove("Badut");

        System.out.println("\n=== Data Mahasiswa ===");
        dataMahasiswa.keySet().forEach(employee -> {
            System.out.println(employee + " => " + dataMahasiswa.get(employee));
        });
    }
}
