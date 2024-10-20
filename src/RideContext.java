public class RideContext {
    private FareStrategy fareStrategy;

    // Here is instances to avoid unnecessary object creation:
    private static final FareStrategy REGULAR = new RegularFareStrategy();
    private static final FareStrategy PREMIUM = new PremiumFareStrategy();
    private static final FareStrategy DISCOUNT = new DiscountFareStrategy();
    private static final FareStrategy SURGE = new SurgeFareStrategy();

    public FareStrategy selectFareStrategy(double distance, boolean isPeakHour) {
        if (distance > 20) {
            return PREMIUM;
        } else if (isPeakHour) {
            return SURGE;
        } else if (distance < 5) {
            return DISCOUNT;
        } else {
            return REGULAR;
        }
    }

    public double calculateFare(double distance, double duration, boolean isPeakHour) {
        if (distance < 0 || duration < 0) {
            throw new IllegalArgumentException("Distance and duration must be non-negative! Please try again");
        }
        fareStrategy = selectFareStrategy(distance, isPeakHour);
        double fare = fareStrategy.calculateFare(distance, duration, isPeakHour);
        return Math.max(fare, 5.00);
    }
}

