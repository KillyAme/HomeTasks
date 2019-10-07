package homework7;

public class Reader {
    private String fullName, faculty;
    private int libraryCard, dateOfBirth;

    public Reader(String fullName, String faculty, int libraryCard, int dateOfBirth) {
        this.fullName = fullName;
        this.faculty = faculty;
        this.libraryCard = libraryCard;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getLibraryCard() {
        return libraryCard;
    }

    public void setLibraryCard(int libraryCard) {
        this.libraryCard = libraryCard;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", faculty='" + faculty + '\'' +
                ", libraryCard=" + libraryCard +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public void takeBook(int i) {
        System.out.println(fullName + " взял " + i + " книги.");
    }

    public void takeBook(String... nameBook) {
        System.out.print(fullName + " взял книги: ");
        for (String nameBooks : nameBook) {
            System.out.print(nameBooks + ", ");
        }
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (Book nameBooks : books) {
            System.out.print(nameBooks + ", ");
        }
    }

    public void returnBook(int i) {
        System.out.println(fullName + " вернул " + i + " книги.");
    }

    public void returnBook(String... nameBook) {
        System.out.print(fullName + " вернул книги: ");
        for (String nameBooks : nameBook) {
            System.out.print(nameBooks + "; ");
        }
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (Book nameBooks : books) {
            System.out.print(nameBooks + "; ");
        }
    }
}
