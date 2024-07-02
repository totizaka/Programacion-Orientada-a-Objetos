package poo.Guias.Guia7.ej4;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private final String title, author;
    public Book(String title, String author){
        this.author=author;
        this.title=title;
    }

    @Override
    public boolean equals(Object o){
        return o instanceof Book book &&
                (this.title.compareTo(book.title)==0) &&
                (this.author.compareTo(book.author)==0);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
    @Override
    public String toString(){
        return "%s".formatted(title);
    }
    @Override
    public int compareTo(Book b){
        int titleCmp = title.compareTo(b.title);
        if(titleCmp != 0) {
            return titleCmp;
        }
        return author.compareTo(b.author);
    }
}
