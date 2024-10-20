public class DiscountFareStrategy implements FareStrategy {
    @Override
    public double calculateFare(double distance, double duration, boolean isPeakHour) {
        return (0.75 * distance) + (0.20 * duration);
    }
}

