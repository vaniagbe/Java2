import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private String ID;
    private List<Item> borrowedItems;

    public Patron(String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.borrowedItems = new ArrayList<>();
    }

    public List<Item> getBorrowedItems() {
        return borrowedItems;
    }

    // Other methods to borrow and return items
    public void borrow(Item item) {
        borrowedItems.add(item);
    }

    public void returnItem(Item item) {
        borrowedItems.remove(item);
    }

    // Getters and setters
}

