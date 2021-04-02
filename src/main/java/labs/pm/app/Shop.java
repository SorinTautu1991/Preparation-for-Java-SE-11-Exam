package labs.pm.app;

import labs.pm.data.*;
import java.math.BigDecimal;
import java.util.Locale;

/*
* Preparation for Oracle
* Java 11 Exam Certification
*/

public class Shop {
    public static void main( String[] args ) {

        ProductManager pm = new ProductManager(Locale.GERMANY);
        Product p1 = pm.createProduct(101, "Tea", BigDecimal.valueOf(1.99), Rating.NOT_RATED);

        pm.printProductReport(p1);
        pm.reviewProduct(p1, Rating.FIVE_STAR, "Nice, hot, cup of tea");
        pm.reviewProduct(p1, Rating.ONE_STAR, "Horrible tea!!!");
        pm.reviewProduct(p1, Rating.FOUR_STAR, "Good cup of tea!");
        pm.reviewProduct(p1, Rating.FIVE_STAR, "Very good tea!");
        pm.reviewProduct(p1, Rating.FIVE_STAR, "Amazing tea!");
        pm.printProductReport(p1);

        Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(1.99), Rating.NOT_RATED);
        p2 = pm.reviewProduct(p2, Rating.THREE_STAR, "Cofee was ok");
        p2 = pm.reviewProduct(p2, Rating.ONE_STAR, "Where is teh milk?");
        p2 = pm.reviewProduct(p2, Rating.FIVE_STAR, "Perfect coffee");
        pm.printProductReport(p2);

        Product p3 = pm.createProduct(103, "Cookie", BigDecimal.valueOf(2.50), Rating.NOT_RATED);
        pm.reviewProduct(p3, Rating.FIVE_STAR, "Best cookie ever!");
        pm.reviewProduct(p3, Rating.TWO_STAR, "Average cookie!");
        pm.reviewProduct(p3, Rating.ONE_STAR, "Disgusting cookie");
        pm.printProductReport(103);

    }

}
