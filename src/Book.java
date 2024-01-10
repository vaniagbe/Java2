public class Book extends Item {
    private String author;

    public Book(String title, String uniqueID, String author) {
        super(title, uniqueID);
        this.author = author;
    }

    @Override
    public void borrowItem() {
        if (!isBorrowed()) {
            setBorrowed(true);
            System.out.println("Book borrowed: " + getTitle() + " by " + author);
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Book returned: " + getTitle() + " by " + author);
        } else {
            System.out.println("Book is not currently borrowed.");
        }
    }

    // Additional methods and getters/setters specific to Book class
}
