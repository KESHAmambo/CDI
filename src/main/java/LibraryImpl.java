/**
 * Created by abara on 15.11.2016.
 */
public class LibraryImpl implements Library {
    public Book getBook() {
        return new Book("Nabokov", "Lolita");
    }
}
