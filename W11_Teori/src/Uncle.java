import java.util.HashMap;

public class Uncle {
    private String name;
    private HashMap<Niece, String> presents;

    public Uncle(String name) {
        this.name = name;
        this.presents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addPresent(Niece recipient, String description) {
        if (presents.containsKey(recipient)) {
            System.out.println("Uncle " + name + " has already chosen a present for " + recipient.getName() + ".");
        } else if (recipient.hasReceivedPresent(description)) {
            System.out.println(recipient.getName() + " has already received the present: " + description);
        } else {
            presents.put(recipient, description);
            recipient.addPresent(this, description);
        }
    }

    public void listPresents() {
        System.out.println("Presents from " + name + ":");
        for (Niece niece : presents.keySet()) {
            System.out.println("To " + niece.getName() + ": " + presents.get(niece));
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
