package homework7;

public class ReaderDemo {
    public static void main(String[] args) {
        Reader[] arrayReaders = new Reader[3];
        arrayReaders[0] = new Reader("Petov Petr","1",24542,1997);
        arrayReaders[1] = new Reader("Ivanov Ivan","2",45234,1993);
        arrayReaders[2] = new Reader("Maximov Maxim","3",86041,1995);
        Book[]arrayBooks = new Book[3];
        arrayBooks[0]=new Book("1984","G. Orwell");
        arrayBooks[1]=new Book("Crime and Punishment","F. Dostoevsky");
        arrayBooks[2]=new Book("Dune","F. P. Herbert");
        arrayReaders[2].takeBook(4);
        arrayReaders[1].takeBook("1984","Crime and Punishment","Dune");
        System.out.println();
        arrayReaders[0].takeBook(arrayBooks[0],arrayBooks[2],arrayBooks[1]);
        System.out.println();
        arrayReaders[2].returnBook(4);
        arrayReaders[1].returnBook("1984","Crime and Punishment","Dune");
        System.out.println();
        arrayReaders[0].returnBook(arrayBooks[0],arrayBooks[2],arrayBooks[1]);
    }
}
