// cpnpth hashset vs treeset

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PerbedaanHashSetTreeSet {
    public static void main(String[] args) {
        // HashSet - Tidak menjamin urutan
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Agra");
        hashSet.add("Isyana");
        hashSet.add("Jihan");
        hashSet.add("Syahla");

        System.out.println("HashSet (tidak berurutan):");
        for (String nama : hashSet) {
            System.out.println(nama);
        }

        // TreeSet - Urut secara alami (alfabetis)
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Syahla");
        treeSet.add("Agra");
        treeSet.add("Isyana");
        treeSet.add("Jihan");

        System.out.println("\nTreeSet (urutan alami):");
        for (String nama : treeSet) {
            System.out.println(nama);
        }
    }
}
