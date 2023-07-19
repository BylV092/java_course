package catalog;

import java.util.Date;

public class Comic extends Book {
    private String character;

    public Comic(int price, Date datePublication, String author, String title, String editorial, String character) {
        super(price, datePublication, author, title, editorial);
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }
}
