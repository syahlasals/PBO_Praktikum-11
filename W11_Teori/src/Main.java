public class Main {
    public static void main(String[] args) {
        Family family = new Family("Big Boss Family");

        // Menambahkan uncles dan nieces ke dalam keluarga
        Uncle albert = new Uncle("Uncle Albert");
        Uncle bill = new Uncle("Uncle Bill");
        Niece amy = new Niece("Amy", 12, 5);
        Niece beatrice = new Niece("Beatrice", 7, 6);

        family.addUncle(albert);
        family.addUncle(bill);
        family.addNiece(amy);
        family.addNiece(beatrice);

        // Menampilkan daftar uncles dan nieces
        family.listUncles();
        family.listNieces();

        // Menambahkan hadiah dari Uncle Albert untuk Amy
        albert.addPresent(amy, "The Wonder of Computers");

        // Menampilkan hadiah yang diterima Amy dan hadiah yang diberikan Uncle Albert
        family.listNiecePresents(amy);
        family.listUnclePresents(albert);
    }
}
