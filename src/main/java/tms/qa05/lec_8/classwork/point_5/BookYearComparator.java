package tms.qa05.lec_8.classwork.point_5;

import java.util.Comparator;

public class BookYearComparator implements Comparator<Book> {
    @Override
    public int compare(Book book, Book book2) {
        return book.getYear() - book2.getYear();
    }
}
