import java.util.ArrayList;
import java.util.List;

public class Library implements IManageable {
    private List<Item> items;
    private List<Patron> patrons;

    public Library() {
        this.items = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        items.add(item);
    }

    @Override
    public void remove(Item item) {
        items.remove(item);
    }

    @Override
    public void listAvailable() {
        // Implement logic to list available items
    }

    @Override
    public void listBorrowed() {
        // Implement logic to list borrowed items
    }

    public void registerPatron(Patron patron) {
        patrons.add(patron);
    }

    public void lendItem(Patron patron, Item item) {
        if (!item.isBorrowed()) {
            patron.borrow(item);
            item.borrowItem();
        } else {
            // Handle case when the item is already borrowed
        }
    }

    public void returnItem(Patron patron, Item item) {
        if (patron.getBorrowedItems().contains(item)) {
            patron.returnItem(item);
            item.returnItem();
        } else {
            // Handle case when the patron didn't borrow the item
        }
    }
}
