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
//        Product p2 = pm.createProduct(102, "Coffee", BigDecimal.valueOf(2.90), Rating.FOUR_STAR);
//        Product p3 = pm.createProduct(103, "Cake", BigDecimal.valueOf(2.78), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//        Product p4 = pm.createProduct(105, "Cookie", BigDecimal.valueOf(2.99), Rating.TWO_STAR, LocalDate.now());
//        Product p5 = p3.applyRating(Rating.THREE_STAR);
//        Product p6 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR);
//        Product p7 = pm.createProduct(104, "Chocolate", BigDecimal.valueOf(2.99), Rating.FIVE_STAR, LocalDate.now().plusDays(2));
//        Product p8 = p4.applyRating(Rating.FIVE_STAR);
//        Product p9 = p1.applyRating(Rating.ONE_STAR);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        System.out.println(p6.equals(p7));
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(p4);
//        System.out.println(p5);
//        System.out.println(p6);
//        System.out.println(p7);
//        System.out.println(p8);
//        System.out.println(p9);
//        System.out.println(p1.getBestBefore());
//        System.out.println(p3.getBestBefore());

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }

}
