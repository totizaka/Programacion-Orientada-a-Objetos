package poo.Guias.Guia7.ej4;
import java.util.Objects;
public class BookRanked implements Comparable<BookRanked>{
    Book book;
    Genre genre;
    private int ranking=0;
    public BookRanked(Book book, Genre genre) {
        this.book=book;
        this.genre=genre;
    }
    public BookRanked(Book book){
        this.book=book;
        this.ranking=1;
    }
    public BookRanked(BookRanked bookRanked){
        this.book=bookRanked.book;
        this.ranking=bookRanked.ranking+1;
        this.genre=bookRanked.genre;
    }
    @Override
    public boolean equals(Object o){
        return o instanceof BookRanked bookRanked &&
                book.equals(bookRanked.book) &&
                genre == bookRanked.genre;
    }
    @Override
    public int hashCode() {
        return Objects.hash(book, genre);
    }
    @Override
    public String toString() {
        return "%s : %d".formatted(book, ranking);
    }
    @Override
    public int compareTo(BookRanked o) {
        int rankingCompare = Integer.compare(o.ranking, ranking);
        if(rankingCompare == 0) {
            return book.compareTo(o.book);
        }
        return rankingCompare;
    }
}
