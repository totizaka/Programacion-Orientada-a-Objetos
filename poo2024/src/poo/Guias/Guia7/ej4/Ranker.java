package poo.Guias.Guia7.ej4;

import java.util.*;

public class Ranker{
    private Set<BookRanked> ranking = new TreeSet<>();

    public Ranker add(Genre genre, Book book) {
        ranking.add(new BookRanked(book, genre));
        return this;
    }
    public void rateUp(Book book){
        boolean found = false;

        Iterator<BookRanked> iterator = ranking.iterator();
        while (iterator.hasNext() && !found){
            BookRanked bookRanked = iterator.next();
            if (bookRanked.book.equals(book)){
                iterator.remove();
                ranking.add(new BookRanked(bookRanked));
                found=true;
            }
        }
        if (!found){
            ranking.add(new BookRanked(book));
        }
    }
    public void printRanking(Genre genre){
        System.out.println(genre);
        for(BookRanked bookRanked : ranking){
            if (bookRanked.genre != null && bookRanked.genre.compareTo(genre)==0){
                System.out.println(bookRanked);
            }
        }
    }
    public void printRanking(){
        System.out.println("General Ranking");
        for (BookRanked bookRanked : ranking){
            System.out.println(bookRanked);
        }
    }
}
