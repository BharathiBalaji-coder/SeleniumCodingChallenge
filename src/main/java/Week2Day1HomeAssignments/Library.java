package Week2Day1HomeAssignments;

public class Library {


    public String addBook(String bookTitle) {
        System.out.println("Book added successfully");
        return bookTitle;
    }


    public void issueBook() {
        System.out.println("Book issued successfully");
    }

    public static void main(String[] args) {

        Library obj = new Library();
        obj.addBook("Java");
        obj.issueBook();
    }
}
