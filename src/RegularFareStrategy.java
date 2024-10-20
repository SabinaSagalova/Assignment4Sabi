public class RegularFareStrategy implements FareStrategy {
    @Override
    public double calculateFare(double distance, double duration, boolean isPeakHour) {
        return (1.00 * distance) + (0.25 * duration);
    }
}

