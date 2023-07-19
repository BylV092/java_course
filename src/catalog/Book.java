package catalog;

import java.util.Date;

public class Book extends Product implements iBook{
   private Date datePublication;

   private String author;

   private String title;

   private String editorial;

    public Book(int price, Date datePublication, String author, String title, String editorial) {
        super(price);
        this.datePublication = datePublication;
        this.author = author;
        this.title = title;
        this.editorial = editorial;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    @Override
    public Date datePublication() {
        return null;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public double getSalePrice() {
        return getPrice() * 1.1;
    }
}
