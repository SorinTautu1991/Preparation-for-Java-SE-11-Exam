package labs.pm.data;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Objects;

public abstract class Product implements Rateable<Product> {

    /* Fields */
    private int id;
    private String name;
    private BigDecimal price;
    public static final BigDecimal discount = BigDecimal.valueOf(0.1);
    private Rating rating;

    Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    Product(int id, String name, BigDecimal price) {
        this(id, name, price, Rating.NOT_RATED);
    }

    /* Methods */
    public LocalDate getBestBefore() {
        return LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getDiscount(){
        return price.multiply(discount).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public Rating getRating() {
        return rating;
    }

//    public abstract Product applyRating(Rating newRating);

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", price=" + price + ", rating=" + rating.getStars() + ", bestBefore=" + getBestBefore();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return id == product.id &&
                name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
