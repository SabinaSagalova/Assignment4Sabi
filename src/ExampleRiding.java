public class ExampleRiding {
    public static void main(String[] args) {
        RideContext rideContext = new RideContext();

        // Here is examples of different rides with dynamic strategy selection
        System.out.println("Regular Ride: $" + rideContext.calculateFare(12, 20, false)); // Regular strategy
        System.out.println("Peak Hour Ride: $" + rideContext.calculateFare(8, 10, true)); // Surge strategy
        System.out.println("Short Ride (Discount): $" + rideContext.calculateFare(2, 3, false)); // Discount strategy
        System.out.println("Long Ride (Premium): $" + rideContext.calculateFare(30, 45, true)); // Premium strategy, with peak hour.

        // Here is testing of handling edge cases, when input is invalid:
        try {
            System.out.println("Invalid Ride (negative distance): $" + rideContext.calculateFare(-5, 10, false));
        } catch (IllegalArgumentException e) {
            System.out.println("Error:( " + e.getMessage());
        }

        try {
            System.out.println("Invalid Ride (negative duration): $" + rideContext.calculateFare(10, -3, true));
        } catch (IllegalArgumentException e) {
            System.out.println("Error:( " + e.getMessage());
        }
    }
}