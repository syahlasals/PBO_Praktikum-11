import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Family {
    private String name;
    private ArrayList<Niece> nieces;
    private ArrayList<Uncle> uncles;

    public Family(String name) {
        this.name = name;
        this.nieces = new ArrayList<>();
        this.uncles = new ArrayList<>();
    }

    public void addNiece(Niece niece) {
        if (!nieces.contains(niece)) {
            nieces.add(niece);
        } else {
            System.out.println("Niece " + niece.getName() + " is already in the family.");
        }
    }

    public void addUncle(Uncle uncle) {
        if (!uncles.contains(uncle)) {
            uncles.add(uncle);
        } else {
            System.out.println("Uncle " + uncle.getName() + " is already in the family.");
        }
    }

    public void listNieces() {
        System.out.println("List of Nieces (sorted by birthday):");
        Collections.sort(nieces, Comparator.comparingInt(Niece::getMonth).thenComparingInt(Niece::getDay));
        for (Niece niece : nieces) {
            System.out.println(niece);
        }
    }

    public void listUncles() {
        System.out.println("List of Uncles (sorted alphabetically):");
        Collections.sort(uncles, Comparator.comparing(Uncle::getName));
        for (Uncle uncle : uncles) {
            System.out.println(uncle);
        }
    }

    public void listNiecePresents(Niece niece) {
        niece.listPresents();
    }

    public void listUnclePresents(Uncle uncle) {
        uncle.listPresents();
    }
}
