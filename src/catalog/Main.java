package catalog;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        iProduct[] products = new iProduct[6];

        products[0] = new Iphone("Apple", "Negro", "iPhone 12", 1000);
        products[1] = new TvLcd("Samsung", 50,12000);
        products[2] = new Book(10000, new Date(), "J.K. Rowling", "Harry Potter y la Piedra Filosofal", "Salamandra");
        products[3] = new Comic(2000, new Date(), "Stan Lee", "The Amazing Spider-Man", "Marvel Comics", "Spider-Man");
        products[4] = new Book(6000, new Date(), "George R.R. Martin", "Canción de hielo y fuego", "Plaza & Janés");
        products[5] = new TvLcd("Sony", 55,18000);

        for (iProduct product : products) {
            System.out.println("----------------------------");
            if (product instanceof Iphone) {
                Iphone iPhone = (Iphone) product;
                System.out.println("iPhone " + iPhone.getModel() + " - " + iPhone.getColor());
            } else if (product instanceof TvLcd) {
                TvLcd tvLcd = (TvLcd) product;
                System.out.println("TV LCD " + tvLcd.getInch() + " pulgadas - " + tvLcd.getMaker());
            } else if (product instanceof Book) {
                Book book = (Book) product;
                System.out.println("Libro: " + book.getTitle() + " - " + book.getAuthor() + " - Editorial: " + book.getEditorial());
            } else if (product instanceof Comic) {
                Comic comic = (Comic) product;
                System.out.println("Comic: " + comic.getTitle() + " - " + comic.getAuthor() + " - Personaje: " + comic.getCharacter());
            }

            System.out.println("Precio: $" + product.getPrice());
            System.out.println("Precio de Venta: $" + product.getSalePrice());
        }
    }
}
