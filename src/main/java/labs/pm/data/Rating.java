package labs.pm.data;

public enum Rating {

    /* Enum values */
    NOT_RATED("\u2686\u2686\u2686\u2686\u2686"),
    ONE_STAR("\u2685\u2686\u2686\u2686\u2686"),
    TWO_STAR("\u2685\u2685\u2686\u2686\u2686"),
    THREE_STAR("\u2685\u2685\u2685\u2686\u2686"),
    FOUR_STAR("\u2685\u2685\u2685\u2685\u2686"),
    FIVE_STAR("\u2685\u2685\u2685\u2685\u2685");

    /* Instance variables */
    private String stars;

    /* Private constructor */
    private Rating(String stars) {
        this.stars = stars;
    }

    /* Methods */
    public String getStars() {
        return stars;
    }

}
