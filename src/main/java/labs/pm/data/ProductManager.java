package labs.pm.data;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class ProductManager {

    /* Fields */
    private Product product;
    private Review review;
    private Locale locale;
    private ResourceBundle resources;
    private DateTimeFormatter dateFormat;
    private NumberFormat moneyFormat;

    /* Constructor */
    public ProductManager(Locale locale) {
        this.locale = locale;
        resources = ResourceBundle.getBundle("labs.pm.data.resources", locale);
        dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(locale);
        moneyFormat = NumberFormat.getCurrencyInstance(locale);
    }

    /* Factory methods */
    public Product createProduct(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore){
        product = new Food(id, name, price, rating, bestBefore);
        return product;
    }

    public Product createProduct(int id, String name, BigDecimal price, Rating rating){
        product = new Drink(id, name, price, rating);
        return product;
    }

    /* Methods */
    public Product reviewProduct(Product product, Rating rating, String comments){
        review = new Review(rating, comments);
        this.product = product.applyRating(rating);
        return this.product;
    }
}
