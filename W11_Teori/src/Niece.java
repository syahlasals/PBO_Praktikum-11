import java.util.HashMap;

public class Niece {
    private String name;
    private int day, month;
    private HashMap<Uncle, String> receivedPresents;

    public Niece(String name, int day, int month) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.receivedPresents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public boolean hasReceivedPresent(String description) {
        return receivedPresents.containsValue(description);
    }

    public void addPresent(Uncle uncle, String description) {
        receivedPresents.put(uncle, description);
    }

    public void listPresents() {
        System.out.println("Presents for " + name + ":");
        for (Uncle uncle : receivedPresents.keySet()) {
            System.out.println("From " + uncle.getName() + ": " + receivedPresents.get(uncle));
        }
    }

    @Override
    public String toString() {
        return name + " - Birthday: " + day + "/" + month;
    }
}
