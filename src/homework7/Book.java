package homework7;

public class Book {
    private String nameBook, nameAuthor;

    public Book(String nameBook, String nameAuthor) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    @Override
    public String toString() {
        return
                "'" + nameBook + '\'' +
                        ", '" + nameAuthor + '\'';
    }
}
