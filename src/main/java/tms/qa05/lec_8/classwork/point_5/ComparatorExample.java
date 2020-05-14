package tms.qa05.lec_8.classwork.point_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        BookNameComparator nameComparator = new BookNameComparator();
        Comparator<Book> bookComparator = nameComparator.thenComparing(new BookYearComparator());

        Set<Book> booksSet = new TreeSet<>(bookComparator);
        booksSet.add(new Book("DD", "A", 1997));
        booksSet.add(new Book("DD", "B", 2003));
        booksSet.add(new Book("BB", "C", 2020));

        System.out.println(booksSet);

        List<Book> booksList = new ArrayList<>();
        booksList.add(new Book("DD", "B", 2003));
        booksList.add(new Book("DD", "A", 1997));
        booksList.add(new Book("BB", "C", 2020));
        System.out.println(booksList);

        Collections.sort(booksList, nameComparator);
        System.out.println(booksList);
    }
}
