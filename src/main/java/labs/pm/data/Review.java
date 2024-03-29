package labs.pm.data;

public class Review implements Comparable<Review> {

    /* Fields */
    private Rating rating;
    private String comments;

    public Review(Rating rating, String comments) {
        this.rating = rating;
        this.comments = comments;
    }

    /* Methods */
    public Rating getRating() {
        return rating;
    }

    public String getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "Rating= " + rating + ", comment= " + comments;
    }

    @Override
    public int compareTo(Review other) {
        return other.getRating().ordinal() - this.rating.ordinal();
    }
}
