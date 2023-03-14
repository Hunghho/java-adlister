package model;

import java.util.ArrayList;
import java.util.List;

public class BeanTest {
    public static void main(String[] args) {
        Album album1 = new Album("Michael Jackson", "Thriller", 1982, 47, "Pop/Rock/R&B");
        Album album2 = new Album("Pink Floyd", "The Dark Side of the Moon", 1973, 26, "Hard rock");
        Album album3 = new Album("Meat Loaf", "Bat Out of Hell", 1977, 21, "Hard rock/Progressive rock");

        ArrayList<Album> albums = new ArrayList<>(List.of(album1, album2, album3));
        for (Album album : albums) {
            System.out.println(album.getArtist());
        }





        Author author1 = new Author();
        Author author2 = new Author();
        Author author3 = new Author();

        author1.setFirst_name("Bruce");
        author1.setLast_name("lee");
        author2.setFirst_name("Terminator");
        author3.setFirst_name("shaggy");

        Quote quote1 = new Quote("be water, my friend", author1);
        Quote quote2 = new Quote("board dont fight back!", author1);
        Quote quote3 = new Quote("empty your mind.", author1);

        ArrayList<Quote> quotes = new ArrayList<>(List.of(quote1, quote2, quote3));
            for(Quote quote : quotes){
                System.out.println(quote.getAuthor().getFirst_name() + " " + quote.getAuthor().getFirst_name()
                + " \"" + quote.getText() + "\"");
            }

        ArrayList<Author> authors = new ArrayList<>(List.of(author1, author2, author3));

//        for(Author author : authors){
//           for(Quote quote : author1.getQuotes()){
//               System.out.println(author1.getFirst_name() + " " + author1.getLast_name() + " \"" + quote.getText() + "\"");
//           }
//        }
    }
}
