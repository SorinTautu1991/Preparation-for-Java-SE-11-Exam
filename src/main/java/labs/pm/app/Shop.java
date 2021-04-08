package labs.pm.app;

import labs.pm.data.*;
import java.math.BigDecimal;
import java.util.Comparator;

/*
* Preparation for Oracle
* Java 11 Exam Certification
*/

public class Shop {
    public static void main( String[] args ) {

        ProductManager pm = new ProductManager("uk-GB");
        Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);

        pm.printProductReport(p1);
        pm.reviewProduct(p1, Rating.FIVE_STAR, "Nice, hot, cup of tea");
        pm.reviewProduct(p1, Rating.ONE_STAR, "Horrible tea!!!");
        pm.reviewProduct(p1, Rating.FOUR_STAR, "Good cup of tea!");
        pm.reviewProduct(p1, Rating.FIVE_STAR, "Very good tea!");
        pm.reviewProduct(p1, Rating.FIVE_STAR, "Amazing tea!");
//        pm.printProductReport(p1);

        Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        p2 = pm.reviewProduct(p2, Rating.THREE_STAR, "Cofee was ok");
        p2 = pm.reviewProduct(p2, Rating.ONE_STAR, "Where is teh milk?");
        p2 = pm.reviewProduct(p2, Rating.FIVE_STAR, "Perfect coffee");
//        pm.printProductReport(p2);

        Product p3 = pm.createProduct(103, "Cookie", BigDecimal.valueOf(2.50), Rating.NOT_RATED);
        pm.reviewProduct(p3, Rating.FIVE_STAR, "Best cookie ever!");
        pm.reviewProduct(p3, Rating.TWO_STAR, "Average cookie!");
        pm.reviewProduct(p3, Rating.ONE_STAR, "Disgusting cookie");
//        pm.printProductReport(103);

//        pm.printProducts((prodOne, prodTwo) -> prodOne.getRating().ordinal() - prodTwo.getRating().ordinal());
//        pm.printProducts((prodOne, prodTwo) -> prodOne.getPrice().compareTo(prodTwo.getPrice()));
        Comparator<Product> ratingSorter = (prodOne, prodTwo) -> prodTwo.getRating().ordinal() - prodOne.getRating().ordinal();
        pm.printProducts(p -> p.getPrice().floatValue() < 2, ratingSorter);
        Comparator<Product> priceSorter = (prodOne, prodTwo) -> prodTwo.getPrice().compareTo(prodOne.getPrice());
//        pm.printProducts(priceSorter);
//        I can also combine them together
//        pm.printProducts(ratingSorter.thenComparing(priceSorter));
//        pm.printProducts(ratingSorter.thenComparing(priceSorter.reversed()));
        pm.getDiscounts().forEach((rating, discount) -> System.out.println(rating + "\t" + discount));
    }

}
