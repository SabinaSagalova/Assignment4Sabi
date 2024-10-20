public class SurgeFareStrategy implements FareStrategy {
    @Override
    public double calculateFare(double distance, double duration, boolean isPeakHour) {
        double baseFare = (1.00 * distance) + (0.25 * duration);
        return isPeakHour ? 2 * baseFare : baseFare;
    }
}
